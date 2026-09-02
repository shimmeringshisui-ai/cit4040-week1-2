/*CREATE DATABASE library;

CREATE TABLE books (
                       id SERIAL PRIMARY KEY,
                       title VARCHAR(200) NOT NULL,
                       author VARCHAR(120) NOT NULL,
                       pages INTEGER,
                       available BOOLEAN DEFAULT TRUE
);

INSERT INTO books (title, author, pages, available)
VALUES
    ('1984', 'George Orwell', 328, TRUE),
    ('The Hobbit', 'J.R.R. Tolkien', 310, TRUE),
    ('The Little Prince', 'Antoine de Saint-Exupery', 96, TRUE),
    ('Pride and Prejudice', 'Jane Austen', 432, TRUE);

SELECT *
FROM books
WHERE pages > 300;

SELECT title
FROM books
ORDER BY title ASC;*/