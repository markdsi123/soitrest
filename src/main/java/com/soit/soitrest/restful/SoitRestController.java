package com.soit.soitrest.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/uc")
public class SoitRestController {

    //soit endpoint

    //Address to access this endpoint: http://localhost:8080/uc/soit

    @GetMapping("/soit")
    public String helloSoit(){
        return "Hello, and Welcome to the school of Information Technology!";
    }
}
