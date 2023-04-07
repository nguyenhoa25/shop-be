package com.hoa.shopbanhang.adapter.web.v1.transfer.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AuthenticationResponse {

  private String token;

  private String tokenType;

  private String refreshToken;

}
