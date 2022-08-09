package com.colendi.insurance.base.helpers;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class DateFormats {
    public Date GetDateNow(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();
        formatter.format(date);
        return date;
    }
}
