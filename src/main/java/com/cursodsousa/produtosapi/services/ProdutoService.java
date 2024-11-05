package com.cursodsousa.produtosapi.services;

import com.cursodsousa.produtosapi.model.Produto;
import com.cursodsousa.produtosapi.repository.ProdutoRepository;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;

    public Produto buscarPorId(String id) {
        return repository.findById(id).orElse(null);
    }

    public void apagar(String id) throws RuntimeException {
        if(!repository.existsById(id)) {
            throw new NoSuchBeanDefinitionException("Id Nao encontrado");
        }
        repository.deleteById(id);
    }

}
