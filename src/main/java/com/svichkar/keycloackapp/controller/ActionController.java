package com.svichkar.keycloackapp.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.OidcKeycloakAccount;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActionController
{
  @GetMapping(value = "/")
  public String app(ModelMap model)
  {
    KeycloakAuthenticationToken authentication = (KeycloakAuthenticationToken) SecurityContextHolder.getContext()
        .getAuthentication();

    model.addAttribute("authenticated", authentication.isAuthenticated());

    Optional.of(authentication)
        .map(KeycloakAuthenticationToken::getAccount)
        .map(OidcKeycloakAccount::getKeycloakSecurityContext)
        .map(KeycloakSecurityContext::getIdToken)
        .ifPresent(model::addAttribute);

    return "index";
  }

  @GetMapping(value = "/help")
  public String help()
  {
    return "help";
  }

  @GetMapping(value = "/logout")
  public String logout(HttpServletRequest request, ModelMap model) throws ServletException
  {
    request.logout();
    model.addAttribute("authenticated", false);
    return "index";
  }
}
