package com.common;

import com.common.date.DateUtils;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void test_should_get_today_return_a_day(){

        String toDay = DateUtils.getToday();

        String currentDay = new SimpleDateFormat("dd/MM/yyyy").format(new Date());

        assertEquals(toDay, currentDay);
    }
}
