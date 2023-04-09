package com.hoa.shopbanhang.application.constants;

public class UrlConstant {

  public static final class Token {
    public static final String PREFIX = "/tokens";
    public static final String LIST = PREFIX;
    public static final String GET = PREFIX + "/{token}";
    public static final String VERIFY = PREFIX + "/verify/{token}";
    public static final String VERIFY_FORGOT_PASSWORD = PREFIX + "/verify-forgot-password/{token}";
    public static final String RESEND = PREFIX + "/resend/{token}";
    public static final String FORGOT_PASSWORD = PREFIX + "/forgot-password/{token}";
    public static final String CREATE = PREFIX;
    public static final String UPDATE = PREFIX + "/{id}";
    public static final String DELETE = PREFIX + "/{id}";

    public Token() {

    }
  }

  public static class Auth {
    private Auth() {
    }

    private static final String PRE_FIX = "/auth";
    public static final String LOGIN = PRE_FIX + "/login";
    public static final String SIGNUP = PRE_FIX + "/signup";
    public static final String REFRESH_TOKEN = PRE_FIX + "/refresh-token";
    public static final String REFRESH_PASSWORD = PRE_FIX + "/refresh-password/{email}";
    public static final String FORGOT_PASSWORD = PRE_FIX + "/forgot-password/{email}";
    public static final String CHANGE_PASSWORD = PRE_FIX + "/change-password/{email}";
  }

  public static final class User {
    public static final String PREFIX = "/users";
    public static final String LIST = PREFIX;
    public static final String GET = PREFIX + "/{id}";
    public static final String CHANGE_AVATAR = PREFIX + "/change-avatar/{id}";
    public static final String UPDATE = PREFIX + "/{id}";
    public static final String DELETE = PREFIX + "/{id}";

    public User() {

    }
  }
}