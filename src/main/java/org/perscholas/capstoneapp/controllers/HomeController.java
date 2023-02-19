package org.perscholas.capstoneapp.controllers;

import lombok.extern.slf4j.Slf4j;
//import org.perscholas.capstoneapp.dao.UsersRepoI;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
@Slf4j
public class HomeController {
//    UsersRepoI usersRepoI;
//
//
//    @Autowired
//    public HomeController(UsersRepoI usersRepoI) {
//        this.usersRepoI = usersRepoI;
//    }
    @GetMapping("/index")
    public String homePage(){
        log.info("I am in the index controller method");

        return "index";
    }

    @GetMapping("/dashboard")
    public String dashPage(){
        log.warn("I am in the dashboard controller method");
        return "dashboard";
    }

    @GetMapping("/login")
    public String loginPage(){
        log.warn("I am in the login controller method");
        return "login";
    }

    @GetMapping("/signup")
    public String signupPage(){
        log.warn("I am in the signup controller method");
        return "signup";
    }
}
