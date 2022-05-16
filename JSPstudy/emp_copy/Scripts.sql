
drop table emp_copy;

create table emp_copy
as
select * from employee;

select * from emp_copy;

-- oracle (statement)
-- select/insert/update/delete 01.jsp
-- select제외 _process.jsp
--(preparedstatement)
-- select/insert/update/delete 05
-- select제외 _process.jsp

-- mssql
-- insert 02
--  _process.jsp

-- mysql
-- insert 03
--  _process.jsp
