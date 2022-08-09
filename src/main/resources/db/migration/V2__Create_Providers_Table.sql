CREATE SCHEMA IF NOT EXISTS migrations;

CREATE TABLE IF NOT EXISTS migrations.providers (
             "id" INT2,
             "name" TEXT NOT NULL,
             "description" TEXT NOT NULL,
             "logo_url" TEXT NOT NULL,
             "endpoint" TEXT NOT NULL,
             "privateKey" TEXT NOT NULL,
             "accessKey" TEXT NOT NULL,
             "status" SMALLINT,
             PRIMARY KEY (id)
    );