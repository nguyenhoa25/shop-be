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
    public static final String RESET_PASSWORD = PRE_FIX + "/reset-password";
    public static final String UPDATE_PASSWORD = PRE_FIX + "/update-password";
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

  public static class Cart {
    public static final String PREFIX = "carts";
    public static final String LIST = PREFIX;
    public static final String GET = PREFIX + "/{idCart}";
    public static final String USER_CART = PREFIX + "/{idUser}/cart-user";
    public static final String CREATE = PREFIX + "/{idUser}";
    public static final String ADD_PRODUCT_TO_CART = PREFIX + "/{idCart}/{idProduct}/add-cart-detail";
    public static final String EDIT_AMOUNT_OF_CART_DETAIL = PREFIX + "/{idItemDetail}/edit-cart-detail";
    public static final String DELETE_CART_DETAIL = PREFIX + "/{idItemDetail}/delete-cart-detail";
    public static final String DELETE_ALL_CART_DETAIL = PREFIX + "/{idCart}/delete-all-cart-detail";
    public static final String DELETE = PREFIX + "/{idCart}";
  }

  public static class Order {
    private Order() {
    }

    private static final String PREFIX = "/orders";
    public static final String LIST = PREFIX;
    public static final String SEARCH = PREFIX + "/search";
    public static final String CREATE = PREFIX;
    public static final String CANCEL = PREFIX+ "/{idOrder}";
    public static final String GET = PREFIX + "/{idOrder}";
    public static final String GET_BY_USER = PREFIX + "/user/{idUser}";
    public static final String ORDER_PLACED = PREFIX + "/{idOrder}/order-placed";
    public static final String PREPARING_TO_SHIP = PREFIX + "/{idOrder}/preparing-to-ship";
    public static final String IN_TRANSIT = PREFIX + "/{idOrder}/in-transit";
    public static final String DELIVERED = PREFIX + "/{idOrder}/delivered";
  }

  public static class Category {
    private Category() {
    }

    private static final String PREFIX = "/categories";
    public static final String LIST = PREFIX;
    public static final String CREATE = PREFIX;
    public static final String GET = PREFIX + "/{id}";
    public static final String UPDATE = PREFIX;
    public static final String DELETE = PREFIX + "/{id}";
  }

  public static class Product {
    private Product() {
    }

    private static final String PREFIX = "/products";
    public static final String LIST = PREFIX;
    public static final String CREATE = PREFIX;
    public static final String GET = PREFIX + "/{id}";
    public static final String SEARCH = PREFIX + "/search";
    public static final String UPDATE = PREFIX;
    public static final String ADD_IMAGES = PREFIX + "/add-images";
    public static final String REMOVE_IMAGES = PREFIX + "/remove-images";
    public static final String DELETE = PREFIX + "/{id}";
    public static final String REPORT = PREFIX + "/report";
  }

  public static class Rate {
    private Rate() {
    }

    private static final String PRE_FIX = "/rates";
    public static final String LIST = PRE_FIX;
    public static final String CREATE = PRE_FIX;
    public static final String GET = PRE_FIX + "/{id}";
    public static final String UPDATE = PRE_FIX;
    public static final String DELETE = PRE_FIX + "/{id}";
  }

  public static class Statistic {
    private Statistic() {
    }

    private static final String PREFIX = "/statistics";
    public static final String VIEW = PREFIX + "/view";
    public static final String LIST = PREFIX;
    public static final String CREATE = PREFIX;
    public static final String GET = PREFIX + "/{id}";
    public static final String DELETE = PREFIX + "/{id}";
  }

}