DROP TABLE IF EXISTS user;
CREATE TABLE IF NOT EXISTS user
(
    `id`   INT(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) DEFAULT NULL,
    `age`  INT(11)      DEFAULT NULL,
    `sex`  VARCHAR(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = UTF8;
