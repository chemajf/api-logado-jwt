package com.saga.demo.jwt.security;

public class Constants {

    // Spring Security

    public static final String COSA_URL = "/cosas/**";
    public static final String LOGIN_URL = "/login";
    public static final String LOGOUT_URL = "/logout";
    public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";

    // JWT

    public static final String ISSUER_INFO = "https://www.odfenergia.es/";
    public static final String SUPER_SECRET_KEY = "1234";
    public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 day
    public static final int TOKEN_EXPIRATION_TIME_MINUTES = 240; // 4 horas

}
