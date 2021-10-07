package com.nsss.pizzamanagementsystembackend.request;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//Crust Statistics Request
public class CrustStatisticsRequest {
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date fromTimestamp;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date toTimestamp;

    public CrustStatisticsRequest(Date fromTimestamp, Date toTimestamp) {
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
