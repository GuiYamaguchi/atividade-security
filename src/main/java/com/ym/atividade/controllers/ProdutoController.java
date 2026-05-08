package com.ym.atividade.controllers;

import com.ym.atividade.models.ProdutoModel;
import com.ym.atividade.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ProdutoModel criarProduto(@RequestBody ProdutoModel produtoModel) {
        return produtoService.criarProduto(produtoModel);
    }

    @GetMapping
    public List<ProdutoModel> listarProduto(){
        return produtoService.listarProduto();
    }

    @GetMapping("/{id}")
    public Optional<ProdutoModel> listarProdutoId(@PathVariable Long id){
        return produtoService.listarProdutoId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
    }
}
