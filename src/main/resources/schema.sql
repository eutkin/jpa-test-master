create table authors
(
    id   int primary key auto_increment,
    name varchar2(50) not null
);

create table books
(
    id        int primary key auto_increment,
    name      varchar2(100) not null,
    author_id int references authors (id)
);