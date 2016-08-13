CREATE TABLE group_contents (
  content_id int NOT NULL AUTO_INCREMENT,
  group_id int NOT NULL,
  user_id BIGINT(20) NOT NULL,
  content_type varchar(50) NOT NULL,
  content varchar(500) not NULL,
  description varchar(500) not NULL,
  PRIMARY KEY (content_id),
  FOREIGN KEY (group_id) REFERENCES groups(group_id),
  FOREIGN KEY (user_id) REFERENCES users(id)
) ;