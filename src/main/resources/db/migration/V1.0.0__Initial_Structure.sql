CREATE TABLE client(
id bigserial NOT NULL PRIMARY KEY,
name varchar(120) NOT NULL,
cpf varchar(11) NOT NULL
);

CREATE TABLE account(
account_number varchar(12) NOT NULL PRIMARY KEY,
balance decimal NOT NULL,
user_id bigserial NOT NULL,
CONSTRAINT user_id_fk FOREIGN KEY (user_id) REFERENCES client(id)
);