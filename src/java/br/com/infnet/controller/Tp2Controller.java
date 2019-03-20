/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infnet.controller;

import br.com.infnet.dao.CadastroDAO;
import br.com.infnet.dominio.Cadastro;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author PC-GAMER
 */
@Controller
public class Tp2Controller {
    
    @RequestMapping("/olaMundo")
    public String login(Model model, Cadastro cadastro) {            
        CadastroDAO dao = new CadastroDAO();
        
        try {
            dao.adiciona(cadastro);
        } catch (SQLException e) {
            System.out.println(e);            
        }
        
            return "login";                     
    }
    
    /*@RequestMapping("/olaMundo")
    public String olaMundo(Model model, @RequestParam("name") String name, @RequestParam("email") String email) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "index";
    }*/
    
    @RequestMapping("/")
    public String cadastro() {
        return "cadastro";
    }
}
