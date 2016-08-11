CREATE TABLE group_type (
  type_id int NOT NULL AUTO_INCREMENT,
  group_code varchar(50) NOT NULL,
  group_type_name varchar(50) NOT NULL,
  group_description varchar(500) NOT NULL,
  group_pics varchar(1000) DEFAULT NULL,
  PRIMARY KEY (type_id)
); 