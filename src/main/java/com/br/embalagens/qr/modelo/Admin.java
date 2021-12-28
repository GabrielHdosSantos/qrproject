package com.br.embalagens.qr.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table
public class Admin{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @NotNull
   private String nome;

   @NotNull
   private String cpf;

    public Admin(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Deprecated
    public Admin(){}
}
