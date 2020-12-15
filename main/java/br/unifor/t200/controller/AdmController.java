package br.unifor.t200.controller;

import br.unifor.t200.model.Cliente;
import br.unifor.t200.model.Produtos;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Adm")
public class AdmController {

@PostMapping("/estoque")
    public void addProduto(@RequestBody Produtos produtos){
    System.out.println(produtos.getQuantidade());
    System.out.println(produtos.toString());


    }


    @DeleteMapping("/estoque/{id}")
    public void deleteProduto(@PathVariable("id")int id , @RequestBody Produtos produtos){
        System.out.println(produtos.getQuantidade());
        System.out.println(produtos.toString());


    }

    @GetMapping("/Clientes")
    public Cliente listCliente(){
       Cliente cliente =new Cliente("12312323","assasd","sdasd@asdad.com","12334456");

        System.out.println(cliente.toString());
       return cliente;
    }


















}
