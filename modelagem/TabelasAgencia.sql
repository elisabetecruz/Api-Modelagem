select * from usuario;
select * from passagens;
select * from acessos;

create database agenciaUser;

Use agenciaUser; 
CREATE TABLE Cliente (
    id_cliente INTEGER PRIMARY KEY,
    Nome varchar(20),
    Endereco varchar(30),
    Telefone varchar(11),
    Cpf varchar(11),
    fk_AgenciaBahiaTur_AgenciaBahiaTur_id INTEGER
);

CREATE TABLE AgenciaBahiaTur (
    AgenciaBahiaTur_id INTEGER PRIMARY KEY,
    CNPJ varchar(15),
    Endereco varchar(20),
    Telefone varchar(11)
);

CREATE TABLE Pacotes (
    Servisos varchar(10),
    Precos DECIMAL,
    Pacotes_id INTEGER,
    fk_Cliente_Cliente_id INTEGER,
    PRIMARY KEY (Pacotes_id, fk_Cliente_Cliente_id)
);

CREATE TABLE Passagens (
    Preco DECIMAL,
    Quantidade varchar(5),
    Passagens_id INTEGER,
    Destinos varchar(1),
    fk_Cliente_Cliente_id INTEGER,
    PRIMARY KEY (Passagens_id, fk_Cliente_Cliente_id)
);
 
ALTER TABLE Cliente ADD CONSTRAINT FK_Cliente_2
    FOREIGN KEY (fk_AgenciaBahiaTur_AgenciaBahiaTur_id)
    REFERENCES AgenciaBahiaTur (AgenciaBahiaTur_id)
    ON DELETE RESTRICT;
 
ALTER TABLE Pacotes ADD CONSTRAINT FK_Pacotes_2
    FOREIGN KEY (fk_Cliente_Cliente_id)
    REFERENCES Cliente (id_cliente)
    ON DELETE CASCADE;
 
ALTER TABLE Passagens ADD CONSTRAINT FK_Passagens_2
    FOREIGN KEY (fk_Cliente_Cliente_id)
    REFERENCES Cliente (id_cliente)
    ON DELETE CASCADE;