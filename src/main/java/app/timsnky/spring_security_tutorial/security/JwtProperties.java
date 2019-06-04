package app.timsnky.spring_security_tutorial.security;

public class JwtProperties {
    public static final String SECRET = "SpringSecuritySecret";
    public static final int EXPIRATION_TIME = 864000000; //10 Days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}
