package com.Test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint")
public class ServiceController {
    @GetMapping("/displayMessage")
    public ResponseEntity<String> showMessage(){
        return ResponseEntity.ok("service one controller executed succesfully");
    }

}
