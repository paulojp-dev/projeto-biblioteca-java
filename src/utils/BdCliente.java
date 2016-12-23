/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author paulojp
 */
public class BdCliente {
    
    /* ----CONEXÃO COM O BD-> */
    private Connection conexao;
    
    // Estabelece uma conexão
    public BdCliente() throws SQLException {       
        this.conexao = CriaConexao.getConexao();
    }
    /* <-CONEXÃO COM O BD---- */
    
    
    
    
    /* ----CLIENTE-> */
    
    // CREATE - Adiciona um registro
    public void adicionaCliente(Cliente c) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "INSERT INTO cliente(nome, data_nasc, sexo, cpf, endereco, fone)"
                + "VALUES(?, ?, ?, ?, ?, ?)";       
        PreparedStatement stmt;
        // stmt recebe o comando SQL
        stmt = this.conexao.prepareStatement(sql);
        
        // Seta os valores p/ o stmt, substituindo os "?"
        stmt.setString(1, c.getNome());
        stmt.setString(2, c.getDataNasc());
        stmt.setString(3, c.getSexo());
        stmt.setString(4, c.getCpf());
        stmt.setString(5, c.getEndereco());
        stmt.setString(6, c.getFone());
        
        // O stmt executa o comando SQL no BD, e fecha a conexão
        stmt.execute();
        stmt.close();
        
    }
    
    // SELECT - Retorna uma lista com o resultado da consulta
    public List<Cliente> getLista(String nome) throws SQLException{
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT * FROM cliente WHERE nome like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        
        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();
        
        List<Cliente> lista = new ArrayList<>();
        
        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while(rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
            Cliente c = new Cliente();
            
            // "c" -> Cliente novo - .setNome recebe o campo do banco de String "nome" 
            c.setId(Integer.valueOf(rs.getString("id_cliente")));
            c.setNome(rs.getString("nome"));
            c.setDataNasc(rs.getString("data_nasc"));
            c.setSexo(rs.getString("sexo"));
            c.setCpf(rs.getString("cpf"));
            c.setEndereco(rs.getString("endereco"));
            c.setFone(rs.getString("fone"));
            
            // Adiciona o registro na lista
            lista.add(c);            
        }
        
        
        
        // Fecha a conexão com o BD
        rs.close();
        stmt.close();
        
        // Retorna a lista de registros, gerados pela consulta
        return lista;          
    }
       
    // UPDATE - Atualiza registros
    public void altera(Cliente c) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "UPDATE cliente set nome=?, data_nasc=?, sexo=?, cpf=?, endereco=?, fone=?"
                + "WHERE id_cliente=?";
        // stmt recebe o comando SQL
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        
        // Seta os valores p/ o stmt, substituindo os "?"
        stmt.setInt(7, c.getId());
        stmt.setString(1, c.getNome());
        stmt.setString(2, c.getDataNasc());
        stmt.setString(3, c.getSexo());
        stmt.setString(4, c.getCpf());
        stmt.setString(5, c.getEndereco());
        stmt.setString(6, c.getFone());        
        
        // O stmt executa o comando SQL no BD, e fecha a conexão
        stmt.execute();
        stmt.close();
    }
    
    // DELETE - Apaga registros
    public void remove(int id) throws SQLException {       
        // Prepara conexão p/ receber o comando SQL
        String sql = "DELETE FROM cliente WHERE id_cliente=?";
        // stmt recebe o comando SQL
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        
        // Seta o valor do ID p/ a condição de verificação SQL, dentro do stmt
        stmt.setInt(1, id);
        
        // Executa o codigo SQL, e fecha
        stmt.execute();
        stmt.close();
        
    }
    /* <-CLIENTE---- */
}
