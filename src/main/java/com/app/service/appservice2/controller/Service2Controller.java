package com.app.service.appservice2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
    @GetMapping("/service2/data")
    public ResponseEntity<String> getData(){
      return ResponseEntity.ok("service2");
    }
}
