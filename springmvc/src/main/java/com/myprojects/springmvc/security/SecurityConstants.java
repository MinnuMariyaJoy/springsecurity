package com.myprojects.springmvc.security;

import com.myprojects.springmvc.SpringApplicationContext;

public class SecurityConstants {

    public static final long EXPIRATION_TIME=864000000; //how long the token will be good to use
    public static final String TOKEN_PREFIX="Bearer";  //prefix will be passed along with the header string in http request
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";

    public static String getTokenSecret(){
        AppProperties appProperties=(AppProperties) SpringApplicationContext.getBean("AppProperties");
        return appProperties.getTokenSecret();
    }

}
