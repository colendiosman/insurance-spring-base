CREATE SCHEMA IF NOT EXISTS migrations;

CREATE TABLE IF NOT EXISTS migrations.accounts (
         "id" INT2,
         "name" TEXT NOT NULL,
         PRIMARY KEY (id)
    );