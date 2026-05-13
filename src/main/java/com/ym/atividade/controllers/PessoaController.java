package com.ym.atividade.controllers;

import com.ym.atividade.models.PessoaModel;
import com.ym.atividade.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public PessoaModel criarProduto(@RequestBody PessoaModel pessoaModel) {
        return pessoaService.criarProduto(pessoaModel);
    }

    @GetMapping
    public List<PessoaModel> listarProduto(){
        return pessoaService.listarProduto();
    }

    @GetMapping("/{id}")
    public Optional<PessoaModel> listarProdutoId(@PathVariable Long id){
        return pessoaService.listarProdutoId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
        pessoaService.deletarProduto(id);
    }
}
