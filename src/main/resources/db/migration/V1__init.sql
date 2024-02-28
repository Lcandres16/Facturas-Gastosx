CREATE TABLE categories (
id SERIAL PRIMARY KEY,
name VARCHAR(255) NOT NULL
);

CREATE TABLE expenses (
id SERIAL PRIMARY KEY,
description VARCHAR(255),
amount NUMERIC NOT NULL,
categories_id BIGINT,
FOREIGN KEY (categories_id) REFERENCES categories(id)
);
