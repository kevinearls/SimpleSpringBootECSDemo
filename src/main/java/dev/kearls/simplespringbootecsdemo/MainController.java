package dev.kearls.simplespringbootecsdemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class MainController {
    private final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String homePage(final Model model) {
        model.addAttribute("localDateTime", LocalDateTime.now());
        model.addAttribute("appName", appName);
        return "home";
    }
}
