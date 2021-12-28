package com.br.embalagens.qr.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    private boolean fragil;

    public Produto(String nome, boolean fragil){
        this.nome = nome;
        this.fragil = fragil;
    }

    public Produto(){}

}
