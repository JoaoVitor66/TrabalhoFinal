package br.unifor.t200.service;


import br.unifor.t200.model.Produtos;
import br.unifor.t200.repository.EstoqueRepository;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService {

private final EstoqueRepository estoqueRepository;


    public EstoqueService(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

 public  void salvar(Produtos produtos){


        estoqueRepository.save(produtos);

 }























}
