package com.hoa.shopbanhang.application.services;

import com.hoa.shopbanhang.adapter.web.v1.transfer.parameter.auth.AuthenticationRequest;
import com.hoa.shopbanhang.adapter.web.v1.transfer.response.AuthenticationResponse;
import com.hoa.shopbanhang.application.inputs.user.CreateUserInput;
import com.hoa.shopbanhang.domain.entities.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IAuthService {

  AuthenticationResponse login(AuthenticationRequest authenticationRequest);

  User signUp(CreateUserInput createUserInput, HttpServletRequest request);

  AuthenticationResponse refreshToken(HttpServletRequest request, HttpServletResponse response);

}
