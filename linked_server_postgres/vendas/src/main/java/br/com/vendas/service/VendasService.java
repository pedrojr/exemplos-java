package br.com.vendas.service;

import br.com.vendas.dto.ItemVendaDto;
import br.com.vendas.repository.VendasRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VendasService {

    @Autowired
    private VendasRepository repository;

    @Autowired
    private final ModelMapper modelMapper;

    public List<ItemVendaDto> obterVendas() {
        return repository.obterVendas().stream()
                .map(p -> modelMapper.map(p, ItemVendaDto.class))
                .collect(Collectors.toList());
    }

}
