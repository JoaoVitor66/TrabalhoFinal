package br.unifor.t200.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private  String cpf;
        private String nome;
        private String email;
        private String telefone;
        private  boolean devedor = false;
        private double saldoDevendo;
        @OneToMany
        private List<Conta> conta;

        public Cliente(String cpf, String nome,String email,String telefone){
            this.cpf = cpf;
            this.nome = nome;
            this.email=email;
            this.telefone=telefone;

        }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public boolean isDevedor() {
        return devedor;
    }

    public double getSaldoDevendo() {
        return saldoDevendo;
    }

    public List<Conta> getConta() {
        return conta;
    }

    public void setDevedor(boolean devedor) {
        this.devedor = devedor;
    }

    public void setSaldoDevendo(double saldoDevendo) {
        this.saldoDevendo = saldoDevendo;
    }

    public void setConta(ArrayList<Conta> conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", devedor=" + devedor +
                ", saldoDevendo=" + saldoDevendo +
                ", conta=" + conta +
                '}';
    }
}

