package com.rttperscholas.GLAB3092.MyController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
     private String hello(){
            return "Hello World";
    }
}
