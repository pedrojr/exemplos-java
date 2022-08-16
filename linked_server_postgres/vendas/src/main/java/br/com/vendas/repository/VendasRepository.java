package br.com.vendas.repository;

import br.com.vendas.model.ItemVenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VendasRepository extends JpaRepository<ItemVenda, Long> {

    @Query(value = "select i.id, i.produto, p.descricao, i.qtde\n" +
                   "from itens_venda i\n" +
                   "left join mssql_cadastros_produtos p on(p.id = i.produto)", nativeQuery = true)
    List<ItemVenda> obterVendas();

}
