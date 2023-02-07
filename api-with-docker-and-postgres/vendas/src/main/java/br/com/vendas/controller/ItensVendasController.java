package br.com.vendas.controller;

import br.com.vendas.dto.ItemVendaDto;
import br.com.vendas.service.ItensVendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ItensVendasController {
        @Autowired
        private ItensVendasService service;

        @GetMapping()
        public List<ItemVendaDto> listar() {
                return service.obterItensVendas();
        }
}
