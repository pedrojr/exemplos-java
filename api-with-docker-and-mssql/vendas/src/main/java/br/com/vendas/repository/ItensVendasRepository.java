package br.com.vendas.repository;

import br.com.vendas.model.ItemVenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensVendasRepository extends JpaRepository<ItemVenda, Long> {
}
