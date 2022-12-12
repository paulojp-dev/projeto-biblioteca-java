/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author paulojp
 */
public class Emprestimo {
    
    private /*@ spec_public @*/ int id_emprestimo;
    private /*@ spec_public @*/ int id_cliente;
    private /*@ spec_public @*/ int id_livro;
    private /*@ spec_public @*/ String data_emprestimo;
    private /*@ spec_public @*/ String data_devolucao;

    public Emprestimo() {
    }   

    
    //@ ensures this.id_emprestimo == id_emprestimo;
    //@ ensures this.id_cliente == id_cliente;
    //@ ensures this.id_livro == id_livro;
    //@ ensures this.data_emprestimo == data_emprestimo;
    //@ ensures this.data_devolucao == data_devolucao;
    public Emprestimo(int id_emprestimo, int id_cliente, int id_livro, String data_emprestimo, String data_devolucao) {
        this.id_emprestimo = id_emprestimo;
        this.id_cliente = id_cliente;
        this.id_livro = id_livro;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }
    
    //@ ensures \result == id_emprestimo;
    public /*@ pure @*/ int getId_emprestimo() {
        return id_emprestimo;
    }
    
    //@ assignable this.id_emprestimo;
    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }
    
    //@ ensures \result == id_cliente;
    public /*@ pure @*/ int getId_cliente() {
        return id_cliente;
    }
    
    //@ assignable this.id_cliente;
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    //@ ensures \result == id_livro;
    public /*@ pure @*/ int getId_livro() {
        return id_livro;
    }
    
    //@ assignable this.id_livro;
    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }
    
    //@ ensures \result == data_emprestimo;
    public /*@ pure @*/ String getData_emprestimo() {
        return data_emprestimo;
    }
    
    //@ assignable this.data_emprestimo;
    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }
    
    //@ ensures \result == data_devolucao;
    public /*@ pure @*/ String getData_devolucao() {
        return data_devolucao;
    }
   
    //@ assignable this.data_devolucao;
    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
    
}
