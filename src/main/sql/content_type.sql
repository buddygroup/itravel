CREATE TABLE content_type (
  type_id int NOT NULL AUTO_INCREMENT,
  content_code varchar(50) NOT NULL,
  content_type_name varchar(50) NOT NULL,
  content_description varchar(500) NOT NULL,
  content_pics varchar(1000) DEFAULT NULL,
  PRIMARY KEY (type_id)
) 