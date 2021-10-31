SET DATABASE SQL SYNTAX PGS TRUE;

CREATE SCHEMA IF NOT EXISTS test;

DROP TABLE IF EXISTS test.product;

CREATE TABLE test.product (
    identifier	BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY,
    name		VARCHAR(255),
    price		INTEGER
);

COMMIT;