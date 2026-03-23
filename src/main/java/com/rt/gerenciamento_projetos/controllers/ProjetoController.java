package com.rt.gerenciamento_projetos.controllers;

import com.rt.gerenciamento_projetos.models.Projeto;
import com.rt.gerenciamento_projetos.services.ProjetoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoServices services;

    @PostMapping
    public Projeto criar(@RequestBody Projeto projeto){
        return services.salvar(projeto);
    }

    @GetMapping
    public List<Projeto> listarTodos(){
        return services.listar();
    }

    @GetMapping("/{id}")
    public Optional<Projeto> buscar(@PathVariable Long id){
        return services.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        services.deletar(id);
    }

}
