CREATE TABLE user_profile (
  user_id int NOT NULL AUTO_INCREMENT,
  user_description varchar(30) NOT NULL,
  pics varchar(30) DEFAULT NULL,
  user_tag_line varchar(100) NOT NULL,
  hobbies date NOT NULL,
  PRIMARY KEY (user_id),
  FOREIGN KEY (user_id) REFERENCES users(id)
) 