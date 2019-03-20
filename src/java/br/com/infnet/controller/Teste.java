/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infnet.controller;

import br.com.infnet.dao.CadastroDAO;
import br.com.infnet.dominio.Cadastro;
import java.sql.SQLException;

/**
 *
 * @author PC-GAMER
 */
public class Teste {
    
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        CadastroDAO dao = new CadastroDAO();
        
        cadastro.setName("teste");
        cadastro.setEmail("teste@teste.com");
        cadastro.setPassword("teste");
        
        try {
            dao.adiciona(cadastro);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
