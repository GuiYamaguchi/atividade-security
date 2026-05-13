package com.ym.atividade.services;

import com.ym.atividade.models.PessoaModel;
import com.ym.atividade.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaModel criarProduto(PessoaModel pessoaModel) {
        return pessoaRepository.save(pessoaModel);
    }

    public List<PessoaModel> listarProduto(){
        return pessoaRepository.findAll();
    }

    public Optional<PessoaModel> listarProdutoId(Long id){
        return pessoaRepository.findById(id);
    }

    public void deletarProduto(Long id){
        pessoaRepository.deleteById(id);
    }

}
