package com.authentication.service.helper;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class HelpUtils {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
