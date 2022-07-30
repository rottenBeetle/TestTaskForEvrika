package com.rottenbeetle.testtaskforevrikabi.controllers;

import com.rottenbeetle.testtaskforevrikabi.utils.UserUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Controller
public class MainController {
    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @PostMapping("/checkUser")
    public String checkUser(@RequestParam("userName") String userName, Model model) {
        UserUtil userUtil = new UserUtil();
        List<String> users = userUtil.getAllUsers();
        //Меняем регистр букв на маленький
        users = users.stream().map(user -> user.toLowerCase(Locale.ROOT)).collect(Collectors.toList());

        model.addAttribute("userName", userName);
        if (users.contains(userName.toLowerCase(Locale.ROOT))){
            return "user-found";

        }else{
            return "user-not-found";
        }
    }
}
