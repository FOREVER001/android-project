package client.com.http.utils;

import android.text.TextUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
*
* Name: TimeUtils
* Author: zxh17
* Email: 
* Comment: 日期时间工具类
* Date: 2018-08-09 14:00
* 
*/public    class TimeUtils   {
    public static final String LONG_DATE_FORMAT_WITH_7 = "yyyy-MM-dd";
    public static String stringToDateString4(String dateStr) {
        if (TextUtils.isEmpty(dateStr)) {
            return "";
        }
        Date date = stringToDateFormat(dateStr, LONG_DATE_FORMAT_WITH_7);
        if (null == date) {
            return "";
        }
        return dateToStringFormat(date, LONG_DATE_FORMAT_WITH_7);
    }

    public static Date stringToDateFormat(String dateStr, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        simpleDateFormat.setLenient(false);
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
        }
        return date;
    }
    public static String dateToStringFormat(Date date, String format) {
        String sdate;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        sdate = simpleDateFormat.format(date);
        return sdate;
    }
}
