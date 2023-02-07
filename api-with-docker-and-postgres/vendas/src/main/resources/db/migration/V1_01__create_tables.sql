
CREATE TABLE itens_venda (
    id bigint not null generated always as identity,
    produto bigint NOT NULL,
    descricao varchar(255) NOT NULL,
    qtde bigint NOT NULL,
    created_at timestamp NOT NULL,
    updated_at timestamp NOT NULL,
    CONSTRAINT itens_venda_id_pk PRIMARY KEY (id)
);

INSERT INTO itens_venda (created_at , updated_at , produto, descricao, qtde) VALUES
(CURRENT_DATE, CURRENT_DATE, 1, 'Produto 1', 5),
(CURRENT_DATE, CURRENT_DATE, 2, 'Produto 2', 8),
(CURRENT_DATE, CURRENT_DATE, 3, 'Produto 3', 3),
(CURRENT_DATE, CURRENT_DATE, 4, 'Produto 4', 21),
(CURRENT_DATE, CURRENT_DATE, 5, 'Produto 5', 2);
