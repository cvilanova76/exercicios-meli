package com.ccvn.exercicio.controller;

import com.ccvn.exercicio.dto.ProdutoDto;
import com.ccvn.exercicio.model.Produto;
import com.ccvn.exercicio.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/todos")
    public List<Produto> findAllProdutos(){
        return produtoService.findAllProdutos();
    }

    @PostMapping("/create")
    public String save(@RequestBody ProdutoDto produtoDto){
        String retorno = produtoService.save(produtoDto);
        return retorno;
    }


    @PutMapping(("/{id}"))
    public String updateProduto(@PathVariable Integer id, @RequestBody ProdutoDto produtoDto){
        return produtoService.updateProduto(id, produtoDto);
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        return produtoService.delete(id);
    }


}
