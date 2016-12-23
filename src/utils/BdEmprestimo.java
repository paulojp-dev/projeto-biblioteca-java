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
import model.Emprestimo;

/**
 *
 * @author paulojp
 */
public class BdEmprestimo {
    
    /* ----CONEXÃO COM O BD-> */
    private Connection conexao;
    
    // Estabelece uma conexão
    public BdEmprestimo() throws SQLException {       
        this.conexao = CriaConexao.getConexao();
    }
    /* <-CONEXÃO COM O BD---- */
    
    
    
    
    /* ----EMPRESTIMO-> */
    
    // CREATE - Adiciona um registro
    public void adicionaEmprestimo(Emprestimo e) throws SQLException {
        // Prepara conexão p/ receber o comando SQL
        String sql = "INSERT INTO emprestimo(id_cliente, id_livro, data_emprestimo, data_devolucao) VALUES(?, ?, ?, ?)";       
        PreparedStatement stmt;
        // stmt recebe o comando SQL
        stmt = this.conexao.prepareStatement(sql);
        
        // Seta os valores p/ o stmt, substituindo os "?"        
        stmt.setString(1, String.valueOf(e.getId_cliente()));
        stmt.setString(2, String.valueOf(e.getId_livro()));
        stmt.setString(3, e.getData_emprestimo());
        stmt.setString(4, e.getData_devolucao());
        
        // O stmt executa o comando SQL no BD, e fecha a conexão
        stmt.execute();
        stmt.close();
        
    }
    
    // SELECT - Retorna uma lista com o resultado da consulta
    public List<Emprestimo> getLista(String id) throws SQLException{
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT * FROM emprestimo WHERE id_emprestimo like ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, id);
        
        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();
        
        List<Emprestimo> lista = new ArrayList<>();
        
        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while(rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
            Emprestimo e = new Emprestimo();
            
            // "c" -> Registro novo - .setNome recebe o campo do banco de String "nome" 
            e.setId_emprestimo(Integer.valueOf(rs.getString("id_emprestimo")));
            e.setId_cliente(Integer.valueOf(rs.getString("id_cliente")));
            e.setId_livro(Integer.valueOf(rs.getString("id_livro")));
            e.setData_emprestimo(rs.getString("data_emprestimo"));
            e.setData_devolucao(rs.getString("data_devolucao"));
            
            // Adiciona o registro na lista
            lista.add(e);            
        }
        
        // Fecha a conexão com o BD
        rs.close();
        stmt.close();
        
        // Retorna a lista de registros, gerados pela consulta
        return lista;          
    }
    
    // SELECT - Retorna uma lista com as multas de um clientes epecífico
    public List<Emprestimo> getListaPorCliente(String id_cliente) throws SQLException{
        // Prepara conexão p/ receber o comando SQL
        String sql = "SELECT emprestimo.id_emprestimo, emprestimo.id_cliente, emprestimo.id_livro, emprestimo.data_emprestimo, emprestimo.data_devolucao" +
                    " FROM emprestimo" +
                    " INNER JOIN cliente" +
                    " ON emprestimo.id_cliente = cliente.id_cliente" +
                    " WHERE emprestimo.id_cliente = ?;";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, id_cliente);
        
        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();
        
        List<Emprestimo> lista = new ArrayList<>();
        
        // Enquanto existir registros, pega os valores do ReultSet e vai adicionando na lista
        while(rs.next()) {
            //  A cada loop, é instanciado um novo objeto, p/ servir de ponte no envio de registros p/ a lista
            Emprestimo e = new Emprestimo();
            
            // "c" -> Registro novo - .setNome recebe o campo do banco de String "nome" 
            e.setId_emprestimo(Integer.valueOf(rs.getString("emprestimo.id_emprestimo")));
            e.setId_cliente(Integer.valueOf(rs.getString("emprestimo.id_cliente")));
            e.setId_livro(Integer.valueOf(rs.getString("emprestimo.id_livro")));
            e.setData_emprestimo(rs.getString("emprestimo.data_emprestimo"));
            e.setData_devolucao(rs.getString("emprestimo.data_devolucao"));
            
            // Adiciona o registro na lista
            lista.add(e);            
        }
        
        // Fecha a conexão com o BD
        rs.close();
        stmt.close();
        
        // Retorna a lista de registros, gerados pela consulta
        return lista;          
    }
    
    // SELECT - Verifica se o cliente tem alguma multa
    public boolean verificaMultaCliente(String id_cliente) throws SQLException{

// Prepara conexão p/ receber o comando SQL
        String sql = "SELECT COUNT(multa.id_cliente) AS quantMulta" +
                        " FROM multa" +
                        " WHERE id_cliente = ?;";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, id_cliente);
        
        // Recebe o resultado da consulta SQL
        ResultSet rs = stmt.executeQuery();
        
        rs.next();
        
        int quantMulta = 0;
        quantMulta = rs.getInt("quantMulta");
        
        // Fecha a conexão com o BD
        rs.close();
        stmt.close();
        
        if (quantMulta > 0) {
            return true;
        }
        
        return false;          
    }
    
    // DELETE - Apaga registros
    public void remove(int id) throws SQLException {       
        // Prepara conexão p/ receber o comando SQL
        String sql = "DELETE FROM emprestimo WHERE id_emprestimo=?";
        // stmt recebe o comando SQL
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        
        // Seta o valor do ID p/ a condição de verificação SQL, dentro do stmt
        stmt.setInt(1, id);
        
        // Executa o codigo SQL, e fecha
        stmt.execute();
        stmt.close();
        
    }
    /* <-EMPRESTIMO---- */
}
