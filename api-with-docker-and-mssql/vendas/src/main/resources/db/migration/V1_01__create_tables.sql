
CREATE TABLE itens_venda (
    id bigint NOT NULL IDENTITY(1,1),
    produto bigint NOT NULL,
    descricao varchar(255) NOT NULL,
    qtde bigint NOT NULL,
    created_at datetime NOT NULL,
    updated_at datetime NOT NULL,
    CONSTRAINT itens_venda_id_pk PRIMARY KEY (id)
);

INSERT INTO itens_venda (created_at, updated_at, produto, descricao, qtde) VALUES
(getdate(), getdate(), 1, 'Produto 1', 5),
(getdate(), getdate(), 2, 'Produto 2', 8),
(getdate(), getdate(), 3, 'Produto 3', 3),
(getdate(), getdate(), 4, 'Produto 4', 21),
(getdate(), getdate(), 5, 'Produto 5', 2);
