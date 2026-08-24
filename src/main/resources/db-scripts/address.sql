DROP TABLE IF EXISTS address;

CREATE TABLE address(
  id int NOT NULL AUTO_INCREMENT,
  street varchar(100) NOT NULL,
  city varchar(45) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO address VALUES (1,'Happy Street','Delhi'),(2,'Down the town Street','NY');