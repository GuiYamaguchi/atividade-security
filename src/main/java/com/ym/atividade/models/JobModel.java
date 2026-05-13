package com.ym.atividade.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tbl_job")
@Data
public class JobModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;


    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private List<ProdutoModel> jobs;

}
