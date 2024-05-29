package com.practice_i18n_i10n_1.controller;

import com.practice_i18n_i10n_1.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping("/login")
    public ModelAndView loginPage() {
        ModelAndView mav = new ModelAndView("/login");
        mav.addObject("user", new User());
        return mav;
    }

    @PostMapping("/doLogin")
    public ModelAndView doLogin(@ModelAttribute User user) {
        ModelAndView mav = new ModelAndView("/dashboard");
        mav.addObject("user", user);
        return mav;
    }
}
