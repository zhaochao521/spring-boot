use db01;
create table employee(
    id int primary key,
    lastName varchar(50),
    email varchar(20),
    gender varchar(10),
    d_id varchar(50)
);
alter table employee modify id int auto_increment;