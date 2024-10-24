package br.com.ohgestor.movenda.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Perfil {

    ADM("Administrador"),
    USE("Suporte"),
    VED("Vendedores");

    private final String nome;
}
