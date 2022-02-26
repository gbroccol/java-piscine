SET DATABASE SQL SYNTAX PGS TRUE;

CREATE SCHEMA IF NOT EXISTS public;

DROP TABLE IF EXISTS public.user;

CREATE TABLE public.user (
 	identifier  BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY,
 	email     VARCHAR(200),
	password  VARCHAR(200)
);

COMMIT;