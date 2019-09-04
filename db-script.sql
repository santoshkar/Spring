DROP TABLE IF EXISTS dept;
CREATE TABLE dept (
  deptId int(11) NOT NULL AUTO_INCREMENT,
  deptname varchar(45)NOT NULL,
  address varchar(250) DEFAULT NULL,
  PRIMARY KEY (deptId)
);

DROP TABLE IF EXISTS emp;
CREATE TABLE emp (
  empId int(11) NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  deptId int(11) DEFAULT NULL,
  sal varchar(45) DEFAULT NULL,
  PRIMARY KEY (empId)
);


DROP TABLE IF EXISTS student;
CREATE TABLE student (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  course varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);
