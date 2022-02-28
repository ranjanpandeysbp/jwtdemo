package com.mycompany.jwtdemo.controller;

import com.mycompany.jwtdemo.model.GstTrackerWrapper;
import com.mycompany.jwtdemo.service.GstFiledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    //@PreAuthorize("hasRole('ADMIN')")
    //@PreAuthorize("hasAnyRole('ADMIN','USER')")//both admin and user is allowed to access resource
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    //@PreAuthorize("hasAnyAuthority('DELETE_AUTHORITY', 'UPDATE_AUTHORITY')")
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from HomeController";
    }

}
