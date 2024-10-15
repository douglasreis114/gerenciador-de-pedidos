package com.atividade5.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.atividade5.demo.model.Usuario;
import com.atividade5.demo.repository.UsuarioRepository;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repositorioDeUsuarios;

    @GetMapping("/all")
    public String listarUsuarios(Model model) {
        List<Usuario> listaDeUsuarios = repositorioDeUsuarios.findAll();
        model.addAttribute("usuarios", listaDeUsuarios);
        return "usuario-lista"; 
    }

    @GetMapping("/new")
    public String mostrarFormularioCadastro() {
        r
