SELECT * FROM todo.todo;

UPDATE todo.todo SET context=category;

ALTER TABLE todo.todo DROP COLUMN category;

ALTER TABLE todo.todo DROP FOREIGN KEY FKflrg3e055smk0nug5gx6j9lub;

ALTER TABLE todo.todo DROP COLUMN owner_id;

ALTER TABLE todo.todo DROP COLUMN type;

UPDATE todo.todo SET plannedtype = 0;

ALTER TABLE todo.todo DROP COLUMN due;

SELECT * FROM todo.todo;
UPDATE todo.todo SET duedate=due WHERE due IS NOT NULL;

alter table todo.todo rename column duedate to due;

alter table todo.todo add column duedate date;

select duedate 
, date_format(duedate, '%Y-%m-%d')
from todo.todo;

UPDATE todo.todo SET duedate='2023-06-10';

ALTER TABLE todo.todo DROP COLUMN due;

UPDATE todo.todo SET priority="M" WHERE priority="Midden";