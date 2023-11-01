package com.ccvn.exercicio.controller;

import com.ccvn.exercicio.dto.ProdutoDto;
import com.ccvn.exercicio.model.Produto;
import com.ccvn.exercicio.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public String save(@RequestBody ProdutoDto produtoDto){
        String retorno = produtoService.save(produtoDto);
        return retorno;
    }



}
