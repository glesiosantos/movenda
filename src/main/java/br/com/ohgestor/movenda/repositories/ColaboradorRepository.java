package br.com.ohgestor.movenda.repositories;

import br.com.ohgestor.movenda.models.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository extends JpaRepository<Colaborador, String> {
}
