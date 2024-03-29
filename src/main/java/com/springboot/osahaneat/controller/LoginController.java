package com.springboot.osahaneat.controller;

import com.springboot.osahaneat.dto.UserDTO;
import com.springboot.osahaneat.entity.Users;
import com.springboot.osahaneat.repository.UserInterface;
import com.springboot.osahaneat.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/signin")
    public ResponseEntity<?> signin(){
        return new ResponseEntity<>(loginService.getAllUser(), HttpStatus.OK);
    }
}
