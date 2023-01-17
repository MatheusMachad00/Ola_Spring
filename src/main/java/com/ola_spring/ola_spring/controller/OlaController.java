package com.ola_spring.ola_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class OlaController {

  @GetMapping
  String helloWorld() {
    return "Hello world from spring";
  }

}
