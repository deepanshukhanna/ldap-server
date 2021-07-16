package com.dk.ldapserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("/")
  public String index() {
    return " <h1> Welcome to the your own ldap World! </h1> ";
  }

}