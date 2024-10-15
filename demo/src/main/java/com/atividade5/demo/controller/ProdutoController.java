package com.atividade5.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.atividade5.demo.model.Produto;
import com.atividade5.demo.repository.ProdutoRepository;

import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repositorio;

    @GetMapping("/todos")
    public String listar(Model model) {
        List<Produto> produtos = repositorio.findAll();
        model.addAttribute("lista", produtos);
        return "lista-produtos"; 
    }

    @GetMapping("/novo")
    public String formularioCadastro() {
        return "cadastro-produto"; 
    }

    @PostMapping("/novo")
    public String adicionar(@ModelAttribute Produto produto) {
        repositorio.save(produto);
        return "redirect:/produtos/todos"; 
   
