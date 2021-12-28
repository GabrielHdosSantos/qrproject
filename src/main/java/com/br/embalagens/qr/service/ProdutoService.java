package com.br.embalagens.qr.service;

import com.br.embalagens.qr.modelo.Produto;
import com.br.embalagens.qr.repos.ProdutoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProdutoService {

    @Autowired
    private ProdutoRepo repo;

    public Produto addProduto(Produto produto){
       return repo.save(produto);
    }

    public Produto findProduto(Long id){
        return repo.getById(id);
    }

}
