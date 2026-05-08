package com.ym.atividade.repositories;

import com.ym.atividade.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
}
