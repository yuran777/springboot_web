package com.example.yr1st.controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static org.aspectj.weaver.AjAttribute.WeaverVersionInfo.AttributeName;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String NiceToMeetyou(@NotNull Model model) {
        model.addAttribute( AttributeName: "username", attributeValue: "유란");
        return "greetings";  //templates.greetings.mustache

    }
}
