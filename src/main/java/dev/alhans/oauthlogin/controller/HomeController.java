package dev.alhans.oauthlogin.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello, this is Homepage";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Welcome, this is Secured Page";
    }
}
