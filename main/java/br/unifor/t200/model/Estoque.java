package br.unifor.t200.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Estoque {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String adim;
    @OneToMany
    private List<Produtos> produtosList;


    public Estoque(String adim, List<Produtos> produtosList) {
        this.adim = adim;
        this.produtosList = produtosList;
    }


    public String getAdim() {
        return adim;
    }

    public void setAdim(String adim) {
        this.adim = adim;
    }

    public List<Produtos> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produtos> produtosList) {
        this.produtosList = produtosList;
    }
}
