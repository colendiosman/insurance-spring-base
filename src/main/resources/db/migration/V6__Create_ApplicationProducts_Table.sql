CREATE SCHEMA IF NOT EXISTS migrations;

CREATE TABLE IF NOT EXISTS migrations.application_products (
             "id" INT2,
             "productId" INT,
             "applicationId" INT,
             "createdAt" TIMESTAMP,
             "updatedAt" TIMESTAMP,
             "deletedAt" TIMESTAMP,
             PRIMARY KEY (id)
    );