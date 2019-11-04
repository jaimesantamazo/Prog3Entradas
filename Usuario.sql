BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "Usuario" (
	"nombre"	TEXT NOT NULL,
	"apellido1"	TEXT NOT NULL,
	"apellido2"	TEXT NOT NULL,
	"fechancto"	TEXT NOT NULL,
	"usuario"	TEXT NOT NULL,
	"email"	TEXT NOT NULL,
	"pass"	TEXT NOT NULL,
	PRIMARY KEY("usuario")
);
COMMIT;
