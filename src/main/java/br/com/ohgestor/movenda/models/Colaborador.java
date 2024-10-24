package br.com.ohgestor.movenda.models;

import br.com.ohgestor.movenda.enuns.Perfil;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "colaboradores")
public class Colaborador extends Auditoria {

    @Column(name = "nm_completo")
    private String nomeCompleto;

    @Column(name = "avatar")
    private String avatar;
    private String email;

    @Enumerated(EnumType.STRING)
    private Perfil perfil;
    private String senha;
    private boolean ativo;
}
