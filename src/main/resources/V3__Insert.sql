CREATE SCHEMA IF NOT EXISTS migrations;

CREATE TABLE IF NOT EXISTS migrations.providers (
                             "id" SERIAL UNIQUE PRIMARY KEY,
                             "name" varchar UNIQUE NOT NULL,
                             "logo" varchar,
                             "status" tinyint,
                             "isInternal" tinyint,
                             "createdAt" datetime NOT NULL DEFAULT (now()),
                             "updatedAt" datetime NOT NULL DEFAULT (now()),
                             "deletedAt" datetime
);

CREATE TABLE "categories" (
                              "id" SERIAL UNIQUE PRIMARY KEY,
                              "name" varchar UNIQUE NOT NULL,
                              "logo" varchar,
                              "status" tinyint,
                              "createdAt" datetime NOT NULL DEFAULT (now()),
                              "updatedAt" datetime NOT NULL DEFAULT (now()),
                              "deletedAt" datetime
);

CREATE TABLE "products" (
                            "id" SERIAL UNIQUE PRIMARY KEY,
                            "providerId" int NOT NULL,
                            "categoryId" int NOT NULL,
                            "status" tinyint,
                            "createdAt" datetime NOT NULL DEFAULT (now()),
                            "updatedAt" datetime NOT NULL DEFAULT (now()),
                            "deletedAt" datetime
);

CREATE TABLE "tokens" (
                          "id" SERIAL UNIQUE PRIMARY KEY,
                          "token" varchar,
                          "createdAt" datetime NOT NULL DEFAULT (now()),
                          "updatedAt" datetime NOT NULL DEFAULT (now()),
                          "deletedAt" datetime
);

CREATE TABLE "product_tokens" (
                                  "id" SERIAL UNIQUE PRIMARY KEY,
                                  "tokenId" int NOT NULL,
                                  "productId" int NOT NULL,
                                  "createdAt" datetime NOT NULL DEFAULT (now()),
                                  "updatedAt" datetime NOT NULL DEFAULT (now()),
                                  "deletedAt" datetime
);

CREATE TABLE "partners" (
                            "id" SERIAL UNIQUE PRIMARY KEY,
                            "name" varchar UNIQUE NOT NULL,
                            "logo" varchar,
                            "status" tinyint,
                            "createdAt" datetime NOT NULL DEFAULT (now()),
                            "updatedAt" datetime NOT NULL DEFAULT (now()),
                            "deletedAt" datetime
);

CREATE TABLE "product_partner_settings" (
                                            "id" SERIAL UNIQUE PRIMARY KEY,
                                            "productPartnerId" int NOT NULL,
                                            "description" varchar,
                                            "smsSent" tinyint,
                                            "mailSent" tinyint,
                                            "otpRequired" tinyint,
                                            "kycRequired" tinyint,
                                            "createdAt" datetime NOT NULL DEFAULT (now()),
                                            "updatedAt" datetime NOT NULL DEFAULT (now())
);

CREATE TABLE "product_partners" (
                                    "id" SERIAL UNIQUE PRIMARY KEY,
                                    "productId" int NOT NULL,
                                    "partnerId" int NOT NULL
);

CREATE TABLE "attribute_options" (
                                     "id" SERIAL UNIQUE PRIMARY KEY,
                                     "productPartnerId" int NOT NULL,
                                     "attributeId" int NOT NULL,
                                     "name" varchar UNIQUE NOT NULL,
                                     "isRequired" boolean NOT NULL,
                                     "createdAt" datetime NOT NULL DEFAULT (now()),
                                     "updatedAt" datetime NOT NULL DEFAULT (now())
);

CREATE TABLE "attributes" (
                              "id" SERIAL UNIQUE PRIMARY KEY,
                              "attributeGroupId" int NOT NULL,
                              "description" varchar,
                              "parameterKey" varchar,
                              "createdAt" datetime NOT NULL DEFAULT (now()),
                              "updatedAt" datetime NOT NULL DEFAULT (now())
);

CREATE TABLE "attribute_types" (
                                   "id" SERIAL UNIQUE PRIMARY KEY,
                                   "attributeOptionId" int NOT NULL,
                                   "name" varchar UNIQUE NOT NULL,
                                   "createdAt" datetime NOT NULL DEFAULT (now()),
                                   "updatedAt" datetime NOT NULL DEFAULT (now())
);

CREATE TABLE "attribute_groups" (
                                    "id" SERIAL UNIQUE PRIMARY KEY,
                                    "name" varchar UNIQUE NOT NULL,
                                    "createdAt" datetime NOT NULL DEFAULT (now()),
                                    "updatedAt" datetime NOT NULL DEFAULT (now())
);

CREATE TABLE "insurance_attributes" (
                                        "id" SERIAL UNIQUE PRIMARY KEY,
                                        "attributeOptionId" int NOT NULL,
                                        "insurancesId" int NOT NULL,
                                        "value" varchar,
                                        "createdAt" datetime NOT NULL DEFAULT (now()),
                                        "updatedAt" datetime NOT NULL DEFAULT (now())
);

CREATE TABLE "insurances" (
                              "id" SERIAL UNIQUE PRIMARY KEY,
                              "status" tinyint,
                              "colendiUserId" int,
                              "price" money,
                              "policyId" int,
                              "customerId" int NOT NULL,
                              "createdAt" datetime NOT NULL DEFAULT (now()),
                              "updatedAt" datetime NOT NULL DEFAULT (now())
);

CREATE TABLE "customers" (
                             "id" SERIAL UNIQUE PRIMARY KEY,
                             "firstName" varchar NOT NULL,
                             "lastName" varchar NOT NULL,
                             "tckn" varchar NOT NULL,
                             "gsm" varchar NOT NULL,
                             "email" varchar NOT NULL,
                             "city" varchar NOT NULL,
                             "district" varchar NOT NULL,
                             "createdAt" datetime NOT NULL DEFAULT (now()),
                             "updatedAt" datetime NOT NULL DEFAULT (now()),
                             "deletedAt" datetime
);

CREATE INDEX ON "providers" ("id");

CREATE INDEX ON "categories" ("id");

CREATE INDEX ON "products" ("id");

CREATE INDEX ON "tokens" ("id");

CREATE INDEX ON "product_tokens" ("id");

CREATE INDEX ON "partners" ("id");

CREATE INDEX ON "product_partner_settings" ("id");

CREATE INDEX ON "product_partners" ("id");

CREATE INDEX ON "attribute_options" ("id");

CREATE INDEX ON "attributes" ("id", "attributeGroupId");

CREATE INDEX ON "attribute_types" ("id");

CREATE INDEX ON "attribute_groups" ("id");

CREATE INDEX ON "insurance_attributes" ("id");

CREATE INDEX ON "insurances" ("id");

CREATE INDEX ON "customers" ("id");

COMMENT ON COLUMN "attribute_options"."productPartnerId" IS 'Not sure if one-to-one';

COMMENT ON COLUMN "attribute_options"."attributeId" IS 'Not sure if one-to-one';

COMMENT ON COLUMN "attributes"."attributeGroupId" IS 'Not sure if one-to-one';

COMMENT ON COLUMN "attributes"."description" IS 'Not sure';

COMMENT ON COLUMN "attributes"."parameterKey" IS 'Not sure';

COMMENT ON COLUMN "attribute_types"."attributeOptionId" IS 'Not sure if one-to-one';

COMMENT ON COLUMN "attribute_groups"."name" IS 'Cihaz Bilgileri, Seyahat Bilgileri';

COMMENT ON COLUMN "insurance_attributes"."attributeOptionId" IS 'Not sure if one-to-one';

COMMENT ON COLUMN "insurance_attributes"."insurancesId" IS 'Not sure if one-to-one';

COMMENT ON COLUMN "insurances"."customerId" IS 'Not sure if one-to-one';

ALTER TABLE "products" ADD FOREIGN KEY ("providerId") REFERENCES "providers" ("id");

ALTER TABLE "products" ADD FOREIGN KEY ("categoryId") REFERENCES "categories" ("id");

ALTER TABLE "product_tokens" ADD FOREIGN KEY ("tokenId") REFERENCES "tokens" ("id");

ALTER TABLE "product_tokens" ADD FOREIGN KEY ("productId") REFERENCES "products" ("id");

ALTER TABLE "product_partner_settings" ADD FOREIGN KEY ("productPartnerId") REFERENCES "product_partners" ("id");

ALTER TABLE "product_partners" ADD FOREIGN KEY ("productId") REFERENCES "products" ("id");

ALTER TABLE "product_partners" ADD FOREIGN KEY ("partnerId") REFERENCES "partners" ("id");

ALTER TABLE "attribute_options" ADD FOREIGN KEY ("productPartnerId") REFERENCES "attributes" ("id");

ALTER TABLE "attribute_options" ADD FOREIGN KEY ("attributeId") REFERENCES "product_partners" ("id");

ALTER TABLE "attributes" ADD FOREIGN KEY ("attributeGroupId") REFERENCES "attribute_groups" ("id");

ALTER TABLE "attribute_types" ADD FOREIGN KEY ("attributeOptionId") REFERENCES "attribute_options" ("id");

ALTER TABLE "insurance_attributes" ADD FOREIGN KEY ("attributeOptionId") REFERENCES "attribute_options" ("id");

ALTER TABLE "insurance_attributes" ADD FOREIGN KEY ("insurancesId") REFERENCES "insurances" ("id");

ALTER TABLE "insurances" ADD FOREIGN KEY ("customerId") REFERENCES "customers" ("id");
