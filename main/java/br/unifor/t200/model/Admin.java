package br.unifor.t200.model;

import java.util.ArrayList;

public class Admin {

    private String nome;
    private String senha;
    private ArrayList<Produtos>estoque;
    private ArrayList<Cliente>listClient;


    public Admin(String nome,String senha){

        this.nome = nome;
        this.listClient=new ArrayList<Cliente>();
        this.estoque = new ArrayList<Produtos>();

    }

    public String getNome() {

        return nome;
    }

    public ArrayList<Produtos> getEstoque() {
        return estoque;
    }

    public ArrayList<Cliente> getListClient() {
        return listClient;
    }



}
