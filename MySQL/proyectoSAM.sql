CREATE DATABASE SAM;
USE SAM;

CREATE TABLE pagos(
	total BIGINT,
    return_message INT,
    card_message TEXT,
    card_name	VARCHAR(255),
    stock_units INT NOT NULL,
    created_at DATE,
    updated_at DATETIME,
    PRIMARY KEY (id_pago),
    FOREIGN KEY (id_recibo) REFERENCES recibo_de_pagos(id_recibo)
    FOREIGN KEY (id_payment) REFERENCES 
);