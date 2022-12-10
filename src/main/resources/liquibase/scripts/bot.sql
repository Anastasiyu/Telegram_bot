-- liquibase formatted sql

-- changeset safiulina:1

CREATE TABLE bot(
    id SERIAL,
    task TEXT,
    data DATE,
    time TIME,

)