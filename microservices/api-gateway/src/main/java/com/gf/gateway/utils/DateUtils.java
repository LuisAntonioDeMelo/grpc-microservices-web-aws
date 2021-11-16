package com.gf.gateway.utils;

import org.springframework.util.ObjectUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static String format(LocalDate date){
        return !ObjectUtils.isEmpty(date) ? date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")): null;
    }
}
