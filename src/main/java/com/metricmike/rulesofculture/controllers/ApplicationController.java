package com.metricmike.rulesofculture.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

  @GetMapping("/")
  public String index() {
    return "Hello, World!";
  }
}
