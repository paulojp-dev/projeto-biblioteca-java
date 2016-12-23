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
    private int id_multa;
    private int id_cliente;
    private String descricao;
    private float valor;

    public Multa(int id_multa, int id_emprestimo, String descricao, float valor, String pagamento) {
        this.id_multa = id_multa;
        this.id_cliente = id_emprestimo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Multa() {
    }

    public int getId_multa() {
        return id_multa;
    }

    public void setId_multa(int id_multa) {
        this.id_multa = id_multa;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
