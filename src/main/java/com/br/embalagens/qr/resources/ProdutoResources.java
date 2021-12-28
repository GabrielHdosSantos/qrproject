package com.br.embalagens.qr.resources;

import com.br.embalagens.qr.modelo.Produto;
import com.br.embalagens.qr.modelo.Qr;
import com.br.embalagens.qr.service.ProdutoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/produto")
public class ProdutoResources {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public ResponseEntity<Produto> add(@RequestBody Produto produto) {
        Produto newProduto = service.addProduto(produto);
        return new ResponseEntity<>(newProduto, HttpStatus.CREATED);
    }

    @GetMapping("find/{id}")
    public ResponseEntity<Produto> find(@PathVariable("id") Long id) {
        Produto produto = service.findProduto(id);

        return new ResponseEntity<>(produto, HttpStatus.OK);
    }

    @GetMapping("gerar/{id}")
    public ResponseEntity<Qr> gerarQr(@PathVariable Long id) {

        String URI = "https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=" +
                "http://localhost:8080/produto/find/" + id;

        Qr qr = new Qr();
        qr.link = URI;

        return new ResponseEntity<>(qr, HttpStatus.OK);

    }


}
