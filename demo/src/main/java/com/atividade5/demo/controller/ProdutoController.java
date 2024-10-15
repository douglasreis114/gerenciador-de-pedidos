package com.atividade5.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.atividade5.demo.model.Produto;
import com.atividade5.demo.repository.ProdutoRepository;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repositorioDeProdutos;

    @GetMapping("/all")
    public String listarProdutos(Model model) {
        List<Produto> listaDeProdutos = repositorioDeProdutos.findAll();
        model.addAttribute("produtos", listaDeProdutos);
        return "produto-lista"; 
    }

    @GetMapping("/new")
    public String mostrarFormularioCadastro() {
        return "produto-cadastro"; 
    }

    @PostMapping("/new")
    public String cadastrar(@ModelAttribute Produto novoProduto) {
        repositorioDeProdutos.save(novoProduto);
        return "redirect:/items/all"; 
    }
}

