package com.common.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by thangnguyen-imac on 6/24/16.
 */

public class DateUtils {

    public static String getToday(){
        String toDay = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        return toDay;
    }

}
