CREATE TABLE IF NOT EXISTS person(
    id int auto_increment PRIMARY KEY,
    name_suffix varchar(255),
    first_name varchar(255) NOT NULL,
    last_name varchar(255) NOT NULL,
    email varchar(255),
    gender varchar(255),
    parent_one varchar(255),
    parent_two varchar(255),
    country varchar(255),
    city varchar(255),
    street varchar(255),
    house_number varchar(255));