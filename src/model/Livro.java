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
public class Livro {
    
    private int id;
    private String exemplar;
    private String autor;
    private byte edicao;
    private short ano;
    private String disponibilidade;

    public Livro(int id, String exemplar, String autor, byte edicao, short ano, String disponibilidade) {
        this.id = id;
        this.exemplar = exemplar;
        this.autor = autor;
        this.edicao = edicao;
        this.ano = ano;
        this.disponibilidade = disponibilidade;
    }

    public Livro() {
    }   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExemplar() {
        return exemplar;
    }

    public void setExemplar(String exemplar) {
        this.exemplar = exemplar;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public byte getEdicao() {
        return edicao;
    }

    public void setEdicao(byte edicao) {
        this.edicao = edicao;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }    
}
