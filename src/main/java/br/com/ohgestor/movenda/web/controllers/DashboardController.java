package br.com.ohgestor.movenda.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/")
    public String dashboard() {
        return "dashboard/index";
    }
}
