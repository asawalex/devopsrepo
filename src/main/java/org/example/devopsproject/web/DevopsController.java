package org.example.devopsproject.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

    @GetMapping
    public String getHelloWord(){
        return "Hello World";
    }
}
