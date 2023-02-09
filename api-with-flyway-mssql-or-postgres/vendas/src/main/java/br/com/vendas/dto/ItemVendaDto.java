package br.com.vendas.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemVendaDto {

    private int produto;

    private String descricao;

    private int qtde;
}
