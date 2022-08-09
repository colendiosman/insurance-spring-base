CREATE SCHEMA IF NOT EXISTS migrations;

CREATE TABLE IF NOT EXISTS migrations.application_agreements (
     "id" INT2,
     "content" TEXT NOT NULL,
     "title" TEXT NOT NULL,
     "applicationProductId" INT,
     "createdAt" TIMESTAMP,
     "updatedAt" TIMESTAMP,
     "deletedAt" TIMESTAMP,
     PRIMARY KEY (id)
    );