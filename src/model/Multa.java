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
public class Multa {
	
    private /*@ spec_public @*/ int id_multa;
    private /*@ spec_public @*/ int id_cliente;
    private /*@ spec_public @*/ String descricao;
    private /*@ spec_public @*/ float valor;
    
    //@ requires valor >= 0;
    //@ requires descricao.length() <= 60;
    //@ ensures this.id_multa == id_multa;
    //@ ensures this.id_cliente == id_cliente;
    //@ ensures this.descricao == descricao;
    //@ ensures this.valor == valor;
    public Multa(int id_multa, int id_emprestimo, String descricao, float valor, String pagamento) {
        this.id_multa = id_multa;
        this.id_cliente = id_emprestimo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Multa() {
    }
    
    //@ ensures \result == id_multa;
    //@ assignable \nothing;
    public int getId_multa() {
        return id_multa;
    }

    //@ ensures this.id_multa == id_multa;
    //@ assignable this.id_multa;
    public void setId_multa(int id_multa) {
        this.id_multa = id_multa;
    }
    
    //@ ensures \result == id_cliente;
    //@ assignable \nothing;
    public int getId_cliente() {
        return id_cliente;
    }
    
    //@ ensures this.id_cliente == id_cliente;
    //@ assignable this.id_cliente; 
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    //@ ensures \result == descricao;
    //@ assignable \nothing;
    public String getDescricao() {
        return descricao;
    }
    
    //@ requires descricao.length() <= 60;
    //@ ensures this.descricao == descricao;
    //@ assignable this.descricao;
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //@ ensures \result == valor;
    //@ assignable \nothing;
    public float getValor() {
        return valor;
    }
    
    //@ requires valor >= 0;
    //@ ensures this.valor == valor;
    //@ assignable this.valor;
    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
