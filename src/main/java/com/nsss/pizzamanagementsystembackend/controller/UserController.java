package com.nsss.pizzamanagementsystembackend.controller;

import com.nsss.pizzamanagementsystembackend.model.ERole;
import com.nsss.pizzamanagementsystembackend.model.Role;
import com.nsss.pizzamanagementsystembackend.model.User;
import com.nsss.pizzamanagementsystembackend.repository.RoleRepository;
import com.nsss.pizzamanagementsystembackend.repository.UserRepository;
import com.nsss.pizzamanagementsystembackend.request.UpdateUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/access")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    RoleRepository roleRepository;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String username) {
        try {
            List<User> users = new ArrayList<User>();

            if (username == null)
                userRepository.findAll().forEach(users::add);
            else
                userRepository.findByUsernameContaining(username).forEach(users::add);

            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/users/delivery")
    public ResponseEntity<List<User>> getAllDeliveryUsers() {
        try {
            List<User> _users = new ArrayList<User>();
            List<User> users = new ArrayList<User>();

            userRepository.findAll().forEach(users::add);

            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            for (User user : users) {
                for(Role role : user.getRoles()) {
                    if(role.getName() == ERole.ROLE_DELIVERY) {
                        _users.add(user);
                    }
                }
            }

            return new ResponseEntity<>(_users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") String id, @Valid @RequestBody UpdateUserRequest user) {
        Optional<User> userData = userRepository.findById(id);

        if(userData.isPresent()) {
            User _user = userData.get();
            _user.setUsername(user.getUsername());
            _user.setEmail(user.getEmail());
//            _user.setPassword(encoder.encode(user.getPassword()));

            Set<String> strRoles = user.getRoles();
            Set<Role> roles = new HashSet<>();

            strRoles.forEach(role -> {
                if ("admin".equals(role)) {
                    Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
                            .orElseThrow(() -> new RuntimeException("ERROR: Role not found."));
                    roles.add(adminRole);
                } else if ("manager".equals(role)) {
                    Role managerRole = roleRepository.findByName(ERole.ROLE_MANAGER)
                            .orElseThrow(() -> new RuntimeException("ERROR: Role not found."));
                    roles.add(managerRole);
                } else if ("cashier".equals(role)) {
                    Role cashierRole = roleRepository.findByName(ERole.ROLE_CASHIER)
                            .orElseThrow(() -> new RuntimeException("ERROR: Role not found."));
                    roles.add(cashierRole);
                } else if ("delivery".equals(role)) {
                    Role deliveryRole = roleRepository.findByName(ERole.ROLE_DELIVERY)
                            .orElseThrow(() -> new RuntimeException("ERROR: Role not found."));
                    roles.add(deliveryRole);
                }
            });

            _user.setRoles(roles);
            return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") String id) {
        try {
            userRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
