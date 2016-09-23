CREATE TABLE group_users (
  group_id int NOT NULL,
  user_id int NOT NULL,
  active varchar(30) DEFAULT NULL,
  isAdmin boolean not null default 0,
  PRIMARY KEY (group_id, user_id),
  FOREIGN KEY (group_id) REFERENCES groups(group_id),
  FOREIGN KEY (user_id) REFERENCES users(id)
) ;