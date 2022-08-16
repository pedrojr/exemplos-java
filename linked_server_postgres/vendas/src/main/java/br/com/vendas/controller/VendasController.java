package br.com.vendas.controller;

import br.com.vendas.dto.ItemVendaDto;
import br.com.vendas.service.VendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendasController {

        @Autowired
        private VendasService service;

        @GetMapping()
        public List<ItemVendaDto> listar()
        {
                return service.obterVendas();
        }

}
