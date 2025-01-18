show databases;

use enotes
show tables;
select * from db;

create database enotes;
select * from user;
create table user(

 user_id BIGINT NOT NULL PRIMARY KEY  AUTO_INCREMENT,
 first_name VARCHAR(50),
 last_name VARCHAR(50),
 email VARCHAR(50),
 password VARCHAR(50),
  mob_no VARCHAR(50)
);

role;

create table role(

 id BIGINT NOT NULL PRIMARY KEY  AUTO_INCREMENT,
 name VARCHAR(50) 
);

create table user_role(

 user_role_id BIGINT NOT NULL PRIMARY KEY  AUTO_INCREMENT,
 user_id BIGINT,
 role_id bigint ,
 FOREIGN KEY(role_id) REFERENCES ROLE(id),
 FOREIGN KEY(user_id) REFERENCES user(user_id)
);

---catagory;
create table category(

 category_id BIGINT NOT NULL PRIMARY KEY  AUTO_INCREMENT,
 name VARCHAR(50),
 is_Active bit ,
  is_Deleted bit,
  created_by BIGINT ,
  created_on TIMESTAMP DEFAULT (current_date()),
  updated_by BIGINT ,
  updated_on TIMESTAMP  DEFAULT (current_date()),
 FOREIGN KEY(created_by) REFERENCES user(user_id),
 FOREIGN KEY(updated_by) REFERENCES user(user_id)
);

 --notes
 
 create table notes(

 notes_id BIGINT NOT NULL PRIMARY KEY  AUTO_INCREMENT,
 title VARCHAR(1000),
 description varchar(10000),
 category_id BIGINT,
 created_by BIGINT,
 created_on TIMESTAMP DEFAULT (current_date()),
 updated_on TIMESTAMP  DEFAULT (current_date()),

 FOREIGN KEY(created_by) REFERENCES user(user_id),
 FOREIGN KEY(category_id) REFERENCES category(category_id)
);


--file details
 create table file_details(

 file_dtl_id BIGINT NOT NULL PRIMARY KEY  AUTO_INCREMENT,
 upload_file_name VARCHAR(255),
 original_file_name VARCHAR(255),
 display_file_name VARCHAR(255),
 path VARCHAR(255),
 file_size BIGINT
);

gALTER TABLE notes
add column file_id BIGINT;
--todo;
  create table todo(

 todo_id BIGINT NOT NULL PRIMARY KEY  AUTO_INCREMENT,
 title VARCHAR(1000),
  descriprion VARCHAR(1000),
 priority INT,
  status INT,
  created_by BIGINT,
  created_on TIMESTAMP DEFAULT (current_date()),
  
 FOREIGN KEY(created_by) REFERENCES user(user_id)
);


























