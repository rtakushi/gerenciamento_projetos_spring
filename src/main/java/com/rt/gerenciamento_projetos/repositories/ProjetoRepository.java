package com.rt.gerenciamento_projetos.repositories;

import com.rt.gerenciamento_projetos.models.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
