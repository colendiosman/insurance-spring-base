CREATE SCHEMA IF NOT EXISTS migrations;

CREATE TABLE IF NOT EXISTS migrations.providers (
                                                 id INT2,
                                                 name TEXT NOT NULL,
                                                 PRIMARY KEY (id)
    );