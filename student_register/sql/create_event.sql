create table event
(
id int primary key auto_incerement,
name varchar(200) not null,
description varchar(200) not null
);

insert into event(name,description) values('paper presentation','present your project');
insert into event(name,description) values('games','connection');

select * from event;