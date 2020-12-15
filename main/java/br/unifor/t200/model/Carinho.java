package br.unifor.t200.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Carinho {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cliente;
    @OneToMany
    private List<Produtos> produtosList;


    public Carinho(String cliente, List<Produtos> produtosList) {
      this.cliente=cliente;
      this.produtosList=produtosList;
    }
}
