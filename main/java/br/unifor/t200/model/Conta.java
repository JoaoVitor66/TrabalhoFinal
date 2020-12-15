package br.unifor.t200.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double valor;
    private String data;
    @OneToMany
    private List<Produtos> carrinho;

    public Conta(double valor, String data, List<Produtos> carrinho) {
        this.valor = valor;
        this.data = data;
        this.carrinho = carrinho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }



    public List<Produtos> getCarrinho() {
        return carrinho;
    }


}
