drop table users;
CREATE TABLE users (
  id bigint NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  password varchar(45) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY (username)
);

CREATE TABLE roles (
  id bigint NOT NULL AUTO_INCREMENT,
  role varchar(45) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY (role)
);


CREATE TABLE user_role (
    id bigint NOT NULL AUTO_INCREMENT,
    user_id bigint NOT NULL,
    role_id bigint NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (role_id) REFERENCES roles(id)
);