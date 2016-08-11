CREATE TABLE groups (
  group_id int NOT NULL AUTO_INCREMENT,
  group_name varchar(50) NOT NULL,
  group_code varchar(50) DEFAULT NULL,
  group_description varchar(100) NOT NULL,
  create_date date NOT NULL,
  public boolean not null default 0,
  admin_id int not null,
  PRIMARY KEY (group_id),
  FOREIGN KEY (admin_id) REFERENCES users(id)
) ;