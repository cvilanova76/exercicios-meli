package com.ccvn.exercicio.service;

import com.ccvn.exercicio.dto.ProdutoDto;
import com.ccvn.exercicio.model.Produto;
import com.ccvn.exercicio.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAllProdutos(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> findById(Integer id){
        return produtoRepository.findById(id);
    }

    public String save(ProdutoDto produtoDto){
        Produto produto = new Produto();
        produto.setId(produtoDto.getId());
        produto.setNome(produtoDto.getNome());
        produto.setValor(produtoDto.getValor());

        produtoRepository.save(produto);
        return "Produto salvo";
    }

    public String updateProduto(Integer id, ProdutoDto produtoDto){
        Produto foundProduto = produtoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Produto não encontrado"));

        foundProduto.setNome(produtoDto.getNome());
        foundProduto.setValor(produtoDto.getValor());

        produtoRepository.save(foundProduto);
        return "Produto atualizado";
    }

    public String delete(Integer id){
        Produto foundProduto = produtoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Produto não encontrado"));

        produtoRepository.delete(foundProduto);
        return "Produto excluído";
    }
}
