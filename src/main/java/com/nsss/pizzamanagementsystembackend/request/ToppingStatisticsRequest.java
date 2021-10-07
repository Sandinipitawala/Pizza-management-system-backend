package com.nsss.pizzamanagementsystembackend.request;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//TOPPING STATISTICS REQUEST IS ADDED
public class ToppingStatisticsRequest {
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date fromTimestamp;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date toTimestamp;

    public ToppingStatisticsRequest(Date fromTimestamp, Date toTimestamp) {
        this.fromTimestamp = fromTimestamp;
        this.toTimestamp = toTimestamp;
    }

    public Date getFromTimestamp() {
        return fromTimestamp;
    }

    public void setFromTimestamp(Date fromTimestamp) {
        this.fromTimestamp = fromTimestamp;
    }

    public Date getToTimestamp() {
        return toTimestamp;
    }

    public void setToTimestamp(Date toTimestamp) {
        this.toTimestamp = toTimestamp;
    }
}
