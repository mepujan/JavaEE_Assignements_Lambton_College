package com.assignment04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @Autowired
    private PageCounter pageCounter;

    @GetMapping("/")
    public String getWelcomePage(Model model){
        pageCounter.incrementPageCounter();
        model.addAttribute("counter", pageCounter.getPageCounter());
        return "welcome";
    }

}
