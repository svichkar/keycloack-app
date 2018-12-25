package com.svichkar.keycloackapp.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActionController
{
  @GetMapping(value = "/")
  public String app()
  {
    return "index";
  }

  @GetMapping(value = "/help")
  public String help()
  {
    return "help";
  }

  @GetMapping(value = "/logout")
  public String logout(HttpServletRequest request) throws ServletException
  {
    request.logout();
    return "index";
  }
}
