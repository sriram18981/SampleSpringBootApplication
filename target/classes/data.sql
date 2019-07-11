DROP TABLE IF EXISTS User;
 
CREATE TABLE User (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  age INT,
);
 
INSERT INTO User (id, first_name, last_name, age) VALUES
  (100, 'Aliko', 'Dangote', 25),
  (101, 'Bill', 'Gates', 30),
  (102, 'Sriram', 'Tanikella', 36),
  (103, 'Folrunsho', 'Alakija', 56);