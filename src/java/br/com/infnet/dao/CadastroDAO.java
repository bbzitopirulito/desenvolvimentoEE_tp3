package br.com.infnet.dao;

import br.com.infnet.dominio.Cadastro;
import conexao.Conexao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastroDAO {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tp2PU");
        return factory.createEntityManager();
    }
    
    public void adiciona(Cadastro cadastro) throws SQLException {

        /*Conexao conn = new Conexao();
        String sql = "insert into tp3.cadastro(name, email, password) values (?,?,?)";                                
        
        conn.conectar();
        
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        
        ps.setString(1, cadastro.getName());
        ps.setString(2, cadastro.getEmail());
        ps.setString(3, cadastro.getPassword());
        ps.execute();     */
        
        EntityManager em = getEM();
        
        em.getTransaction().begin();        
        em.persist(cadastro);
        em.getTransaction().commit();
        em.close();
                
    }
    
}
