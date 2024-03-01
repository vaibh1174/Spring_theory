package com.first_code.first_code_java_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome_spring {
    @GetMapping("/welcome_text")
    public String welcome(){
        return "hello user this is my first Spring text";
    }
}
