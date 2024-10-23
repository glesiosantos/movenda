package br.com.ohgestor.movenda.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @GetMapping("/")
    public String carregarColaboradores() {
        return "colaboradores/index";
    }

}
