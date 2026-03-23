package com.rt.gerenciamento_projetos.services;

import com.rt.gerenciamento_projetos.models.Projeto;
import com.rt.gerenciamento_projetos.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoServices {

    @Autowired
    private ProjetoRepository repository;

    public Projeto salvar(Projeto projeto){
        return repository.save(projeto);
    }

    public List<Projeto> listar(){
        return repository.findAll();
    }

    public Optional<Projeto> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
