INSERT INTO author (first_name, last_name, email)
VALUES ('Robert', 'Martin', 'robermartinxxx12345@gmail.com'),
       ('Barbara', 'Liskov', 'barbaraliskov12345@gmail.com'),
       ('Taras', 'Halynskyi', 'tarashalynskyi12345@gmail.com');

INSERT INTO publisher (name)
VALUES ('Software Books Inc'),
       ('Easy Dev Learn');

INSERT INTO book (title, published_date, publisher_id)
VALUES ('Java rush course', '2002-08-25', 1),
       ('Spring in Action', '2018-02-15', 1),
       ('Angular for beginners', '2021-11-18', 2),
       ('PHP to rule them all', '2009-05-03', 2);

INSERT INTO book_author
VALUES (1, 2),
       (2, 1),
       (2, 2),
       (3, 3),
       (4, 3);