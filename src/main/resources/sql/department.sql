use db01;
create table department(
    id int primary key,
    departmentName varchar(50)
);
alter table department modify id int auto_increment;