package br.unifor.t200.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produtos {
   @Id
    private String id;
    private String nome;
    private int quantidade;
    private double preco;
//    @ManyToOne
//////    private Estoque estoque;
//////
//////    @ManyToOne
//////    private Carinho carinho;

    public Produtos(String nome, String id, int quantidade, double preco ){

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
         this.id = id;
    }

    public String getModelo() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "ID='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
