package com.cursodsousa.produtosapi.controller;


import com.cursodsousa.produtosapi.model.Produto;
import com.cursodsousa.produtosapi.repository.ProdutoRepository;
import com.cursodsousa.produtosapi.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoRepository repository;

    @Autowired
    ProdutoService service;

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto) {
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        repository.save(produto);
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId (@PathVariable String id) {
        Produto p = service.buscarPorId(id);
        return ResponseEntity.ok().body(p);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> apagar(@PathVariable String id) {
        service.apagar(id);
        return ResponseEntity.noContent().build();
    }


























}
