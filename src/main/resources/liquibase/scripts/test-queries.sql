--liquibase formatted sql

--changeset elenazmeeva:1
CREATE TABLE author(
    id serial primary key,
    name text
                   );

CREATE TABLE book(
     id serial primary key,
     bookName text,
     author_id serial references author (id)
);

--changeset elenazmeeva: 2
CREATE TABLE guest(
    id serial primary key,
    guestName text,
    book_id serial references book(id)
);

--changeset elenazmeeva: 3
CREATE TABLE guest_book(
    guest_id serial references guest(id),
    book_id serial references book(id)
);

--changeset elenazmeeva: 4
SELECT * FROM book;
SELECT * FROM author WHERE name = 'Толстой Л.Н';
SELECT *FROM book WHERE author_id=3;
SELECT count(id) FROM book WHERE author_id=1;
INSERT INTO author VALUES (4, 'Тургенев И.С');
INSERT INTO book VALUES (4,'Гарри Поттер');
UPDATE book SET bookName='Капитанская дочка' WHERE id=2;

--changeset elenazmeeva: 5
UPDATE book SET bookName='Отцы и дети' WHERE id=4;
DELETE FROM book WHERE bookName='Анна Каренина';
DELETE FROM book WHERE id=4;
