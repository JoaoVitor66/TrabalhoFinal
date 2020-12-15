package br.unifor.t200.repository;

import br.unifor.t200.model.Cliente;
import br.unifor.t200.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstoqueRepository extends JpaRepository<Produtos,Integer> {
}
