CREATE TABLE user
(
    `id`   int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(255) DEFAULT NULL,
    `age`  int(11)      DEFAULT NULL,
    `sex`  varchar(255) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE = Innodb
  DEFAULT CHARSET = utf8;