package br.com.ohgestor.movenda.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DashboardController {

    @GetMapping("/")
    public String dashboard() {
        return "dashboard/index";
    }
}
