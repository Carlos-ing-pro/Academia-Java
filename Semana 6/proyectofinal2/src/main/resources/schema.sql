DROP TABLE product IF EXISTS;

CREATE TABLE inventarioPC (
    productId VARCHAR(20) NOT NULL,
    pcname VARCHAR(20),
    pcmodelo VARCHAR(60),
    zona VARCHAR(30)
);
