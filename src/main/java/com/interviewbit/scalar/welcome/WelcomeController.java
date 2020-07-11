package com.interviewbit.scalar.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String dashboard(Model model) {
        model.addAttribute("welcome", "Welcome to Scalar Academy!!!");
        return "welcome";
    }
}
