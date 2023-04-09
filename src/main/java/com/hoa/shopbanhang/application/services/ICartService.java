package com.hoa.shopbanhang.application.services;

import com.hoa.shopbanhang.adapter.web.v1.transfer.response.RequestResponse;
import com.hoa.shopbanhang.application.outputs.CartDetailOutput;
import com.hoa.shopbanhang.domain.entities.Cart;

import java.util.List;

public interface ICartService {
  List<Cart> getAll();

  CartDetailOutput getCartById(Long id);
  CartDetailOutput getCartByIdUser(Long idUser);

  Cart createCart(Long idUser);

  RequestResponse deleteById(Long id);
}
