package com.cursodsousa.produtosapi.repository;

import com.cursodsousa.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
