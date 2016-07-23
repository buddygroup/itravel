CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(30) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `password` varchar(100) NOT NULL,
  `create_date` date NOT NULL,
  `location` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) 