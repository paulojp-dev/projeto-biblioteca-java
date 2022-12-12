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
    private /*@ spec_public @*/ int id;
    private /*@ spec_public @*/ String exemplar;
    private /*@ spec_public @*/ String autor;
    private /*@ spec_public @*/ byte edicao;
    private /*@ spec_public @*/ short ano;
    private /*@ spec_public @*/ String disponibilidade;

    /*@ requires id >= 0;
     @ requires exemplar.length() > 0 && exemplar.length() <= 100;
     @ requires autor.length() > 0 && autor.length() <= 100;
     @ requires edicao > 0;
     @ requires ano > 0;
     @ requires ano <= 2022;
     @ requires disponibilidade.length() == 1;
     @ ensures this.id == id;
     @ ensures this.exemplar == exemplar;
     @ ensures this.autor == autor;
     @ ensures this.edicao == edicao;
     @ ensures this.ano == ano;
     @ ensures this.disponibilidade == disponibilidade;
    @*/
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
    
    /*@ requires 0 <= id;
    @ assignable \nothing;
    @ ensures \result == id;
    @*/
    public /*@ pure @*/  int getId() {
        return id;
    }

    /*@ requires 0 <= id;
    @ assignable this.id;
    @ ensures this.id == id;
    @*/
    public void setId(int id) {
        this.id = id;
    }
    /*@ requires exemplar.length() > 0 && exemplar.length() <= 100;
    @ assignable \nothing;
    @ ensures \result == exemplar;
    @*/
    public /*@ pure @*/  String getExemplar() {
        return exemplar;
    }

    /*@ requires exemplar.length() > 0 && exemplar.length() <= 100;
    @ assignable this.exemplar;
    @ ensures this.exemplar == exemplar;
    @*/
    public void setExemplar(String exemplar) {
        this.exemplar = exemplar;
    }
    /*@ requires autor.length() > 0 && autor.length() <= 100;
    @ assignable \nothing;
    @ ensures \result == autor;
    @*/
    public /*@ pure @*/ String getAutor() {
        return autor;
    }

    /*@ requires autor.length() > 0 && autor.length() <= 100;
    @ assignable this.autor;
    @ ensures this.autor == autor;
    @*/
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    /*@ requires edicao > 0;
    @ assignable \nothing;
    @ ensures \result == edicao;
    @*/
    public /*@ pure @*/  byte getEdicao() {
        return edicao;
    }

    /*@ requires edicao > 0;
    @ assignable this.edicao;
    @ ensures this.edicao == edicao;
    @*/
    public void setEdicao(byte edicao) {
        this.edicao = edicao;
    }
    /*@ requires ano > 0 && ano <= 2022;
    @ assignable \nothing;
    @ ensures \result == ano;
    @*/
    public /*@ pure @*/  short getAno() {
        return ano;
    }
    /*@ requires ano > 0 && ano <=2022;
    @ assignable this.ano;
    @ ensures this.ano == ano;
    @*/
    public void setAno(short ano) {
        this.ano = ano;
    }
    /*@ requires disponibilidade.length() == 1;
    @ assignable \nothing;
    @ ensures \result == disponibilidade;
    @*/
    public /*@ pure @*/ String getDisponibilidade() {
        return disponibilidade;
    }
    /*@ requires  disponibilidade.length() == 1;
    @ assignable this.disponibilidade;
    @ ensures this.disponibilidade == disponibilidade;
    @*/
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }    
}
