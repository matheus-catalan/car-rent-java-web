USE vehicle_rental;

CREATE TABLE employees (
 id     int NOT NULL auto_increment,
 name   varchar(45) NOT NULL ,
 email   varchar(45) NOT NULL ,
 phone  varchar(45) NOT NULL ,
 cpf    varchar(45) NOT NULL ,
 gender varchar(45) NOT NULL ,
 created_at datetime not null,
 updated_at datetime not null,
 PRIMARY KEY (`id`)
);

CREATE TABLE user (
  id     int NOT NULL auto_increment,
 name   varchar(45) NOT NULL ,
 email   varchar(45) NOT NULL ,
 phone  varchar(45) NOT NULL ,
 cpf    varchar(45) NOT NULL ,
 gender varchar(45) NOT NULL ,
 created_at datetime not null,
 updated_at datetime not null,
 PRIMARY KEY (`id`)
);

CREATE TABLE vehicle
(
 id             int NOT NULL auto_increment,
 identification varchar(45) NOT NULL ,
 manufacturer   varchar(45) NOT NULL ,
 model          varchar(45) NOT NULL ,
 year           varchar(45) NOT NULL ,
 fuel           varchar(45) NOT NULL ,
 status         varchar(45) NOT NULL ,

PRIMARY KEY (id)
);

SET character_set_client = utf8;
SET character_set_connection = utf8;
SET character_set_results = utf8;
SET collation_connection = utf8_general_ci;
