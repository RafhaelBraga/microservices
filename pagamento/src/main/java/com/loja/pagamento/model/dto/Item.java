package com.loja.pagamento.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private Long id;
    private Integer quantidade;
    private String descricao;
}
