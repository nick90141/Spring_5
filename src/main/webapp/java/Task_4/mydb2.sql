CREATE DATABASE mydb2;

CREATE TABLE my_table (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT
);

INSERT INTO my_table (name, age) VALUES
('John', 30),
('Alice', 25),
('Bob', 35);
