CREATE TABLE foods (
                       id BIGSERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       image VARCHAR(255),
                       price INTEGER
);

INSERT INTO foods (title, image, price) VALUES ('Food 1', 'image1.png', 100);
INSERT INTO foods (title, image, price) VALUES ('Food 2', 'image2.png', 200);
INSERT INTO foods (title, image, price) VALUES ('Food 3', 'image3.png', 300);
