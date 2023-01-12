package com.example.PP_3_1_2_Boot_Security_REST.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class LoginController {

    @GetMapping
    public String startPage() {
        return "redirect:/login";
    }
}
