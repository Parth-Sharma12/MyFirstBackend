package com.SpringProj.MyProject.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
    @RequestMapping("/")
    public String greet(){
        return "Welcome to project";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is my First SpringB project";
    }


}
