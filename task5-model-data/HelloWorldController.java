package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // Renamed Method
    @RequestMapping("/processFormVersionTwo")
    public String MovieName(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        // create the message with the required format
        String result = theName + " " + theName + " is my favorite movie";

        // add message to the model
        model.addAttribute("message", result);

        return "Movie";  // Changed redirect destination
    }
}
