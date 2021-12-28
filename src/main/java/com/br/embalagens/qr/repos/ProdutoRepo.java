package com.br.embalagens.qr.repos;

import com.br.embalagens.qr.modelo.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepo extends JpaRepository<Produto, Long> {
}
