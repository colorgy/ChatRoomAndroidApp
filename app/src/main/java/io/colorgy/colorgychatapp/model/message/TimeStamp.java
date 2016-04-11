package io.colorgy.colorgychatapp.model.message;

import java.util.Calendar;

/**
 * Created by erwaiyang on 2016/4/11.
 */
public class TimeStamp {

    private int year;
    private int month;
    private int date;
    private int hour;
    private int minute;
    private int second;
    private int millisecond;

    public TimeStamp(String timeStampString){

    }

    public TimeStamp(){
        Calendar c = Calendar.getInstance();
        this.year = c.get(Calendar.YEAR);
        this.month = c.get(Calendar.MONTH);
        this.date = c.get(Calendar.DATE);
        this.hour = c.get(Calendar.HOUR);
        this.minute = c.get(Calendar.MINUTE);
        this.second = c.get(Calendar.SECOND);
        this.millisecond = c.get(Calendar.MILLISECOND);
    }
}
