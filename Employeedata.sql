create database Employeesdata;

use Employeesdata;
create table Employeetable (
empno int,
ename varchar(15),
job varchar(15),
mgr int,
hiredate date,
sal decimal(10,2),
comm decimal(10,2),
deptno int
);
 

insert into Employeetable(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (8369,'SMITH','CLERK',8902,"1990-12-18",800,null,20),
(8499,'ANYA','SALESMAN',8698,"1991-02-20",1600,300,30),
(8521,'SETH','SALESMAN',8698,"1991-02-22",1250,500,30),
(8566,'MAHADEVAN','MANAGER',8839,"1991-04-02",2985,null,20),
(8654,'MOMIN','SALESMAN',8698,"1991-09-28",1250,1400,30),
(8698,'BINA','MANAGER',8839,"1991-05-01",2850,null,30),
(8882,'SHIVANSH','MANAGER',8839,"1991-06-09",2450,null,10),
(8888,'SCOTT','ANALYST',8566,"1992-12-09",3000,null,20),
(8839,'AMIR','PRESIDENT',null,"1991-11-18",5000,null,10),
(8844,'KULDEEP','SALESMAN',8698,"1991-09-08",1500,0,30);

select * from Employeetable;

select ename,sal from Employeetable where sal>=2200;

select * from Employeetable where comm is null;

select * from Employeetable where sal not between 2500 and 4000;

select * from Employeetable where mgr is null;

select * from Employeetable where ename like '__A%';

select * from Employeetable where ename like '%T';

use JDBC_Task;

select * from Emp_Table;
