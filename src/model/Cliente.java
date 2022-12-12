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
public class Cliente {
    
	//@ spec_public
    private int id;
    
    private /*@ spec_public @*/ String nome;
    
    private /*@ spec_public @*/ String dataNasc;
    
    private /*@ spec_public @*/ String sexo;
    
    private /*@ spec_public @*/ String cpf;
    
    private /*@ spec_public @*/ String endereco;
    
    private /*@ spec_public nullable */ String fone;
    
    //@ requires nome.length() > 0 && nome.length() <= 100;
    //@ requires dataNasc.length() == 10;
    //@ requires sexo.length() == 1;
    //@ requires cpf.length() == 11;
    //@ requires endereco.length() > 0 && endereco.length() <= 100;
    //@ ensures this.nome == nome;
    //@ ensures this.dataNasc == dataNasc;
    //@ ensures this.sexo == sexo;
    //@ ensures this.cpf == cpf;
    //@ ensures this.endereco == endereco;
    //@ ensures this.fone == fone;
    public Cliente(String nome, String dataNasc, String sexo, String cpf, String endereco, String fone) {
    	this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.cpf = cpf;
        this.endereco = endereco;
        this.fone = fone;
    }
    
    public Cliente() {
    	
    }  
    
    //@ ensures \result == id;
    public /*@ pure @*/ int getId() {
        return id;
    }
    
    //@ requires id >= 0;
    //@ ensures this.id == id;
    //@ assignable this.id;
    public void setId(int id) {
        this.id = id;
    }    
    
    //@ ensures \result == nome;
    //@ assignable \nothing;
    public String getNome() {
        return nome;
    }

    //@ requires nome.length() > 0 && nome.length() <= 100;
    //@ ensures this.nome == nome;
    //@ assignable this.nome;
    public void setNome(String nome) {
        this.nome = nome;
    }

    //@ ensures \result == dataNasc;
    //@ assignable \nothing;
    public String getDataNasc() {
        return dataNasc;
    }
    
    //@ requires dataNasc.length() == 10;
    //@ ensures this.dataNasc == dataNasc;
    //@ assignable this.dataNasc;
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    //@ ensures \result == sexo;
    public /*@ pure @*/ String getSexo() {
        return sexo;
    }
    
    //@ requires sexo.length() == 1;
    //@ ensures this.sexo == sexo;
    //@ assignable this.sexo;
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //@ ensures \result == cpf;
    public /*@ pure @*/ String getCpf() {
        return cpf;
    }
    
    //@ requires cpf.length() == 11;
    //@ ensures this.cpf == cpf;
    //@ assignable this.cpf;
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //@ ensures \result == endereco;
    public /*@ pure @*/ String getEndereco() {
        return endereco;
    }
    
    //@ requires endereco.length() > 0 && endereco.length() <= 100;
    //@ ensures this.endereco == endereco;
    //@ assignable this.endereco;
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //@ ensures \result == fone;
    public /*@ pure @*/ String getFone() {
        return fone;
    }
    
    //@ ensures this.fone == fone;
    //@ assignable this.fone;
    public void setFone(String fone) {
        this.fone = fone;
    }  
    
}
