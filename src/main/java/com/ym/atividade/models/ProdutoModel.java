package com.ym.atividade.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_produto")
@Data
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

}
