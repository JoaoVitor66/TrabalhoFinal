package br.unifor.t200.controller;


import br.unifor.t200.model.Cliente;
import br.unifor.t200.model.Produtos;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {
//atribuiçao do adm  provavelmente
    @PostMapping("/cadastro")
    public void add(@RequestBody Cliente cliente){

        System.out.println(cliente.toString());


    }
    @PostMapping("/carrinho")
    public void addProdutocarrinho(@RequestBody Produtos produtos){
        System.out.println(produtos.getQuantidade());
        System.out.println(produtos.toString());


    }

    @DeleteMapping("/carrinho")
    public void deleteProdutocarrinho( @RequestBody Produtos produtos){
        System.out.println(produtos.toString());


    }

    @GetMapping("/estoque/{id}")
    public Produtos listCliente(@PathVariable("id")int id ){
        Produtos produtos =new Produtos("asda","2223",2,12.0);

        System.out.println(produtos.toString());
        return produtos;
    }


}
