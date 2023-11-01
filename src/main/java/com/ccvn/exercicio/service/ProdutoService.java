package com.ccvn.exercicio.service;

import com.ccvn.exercicio.dto.ProdutoDto;
import com.ccvn.exercicio.model.Produto;
import com.ccvn.exercicio.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public String save(ProdutoDto produtoDto){
        Produto produto = new Produto();
        produto.setId(produtoDto.getId());
        produto.setNome(produtoDto.getNome());
        produto.setValor(produtoDto.getValor());

        produtoRepository.save(produto);
        return "Produto salvo";
    }
}
