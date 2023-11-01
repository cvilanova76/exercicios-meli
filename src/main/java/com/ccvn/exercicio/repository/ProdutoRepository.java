package com.ccvn.exercicio.repository;

import com.ccvn.exercicio.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
