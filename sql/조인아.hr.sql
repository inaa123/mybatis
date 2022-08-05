drop user hr2 cascade; 

create user hr2 identified by hr2 default tablespace users;
grant connect, resource to hr2;

create table hr2.laborers(
    laborer_id number(10) constraint laborers_laborerid_pk primary key,
    laborer_name varchar2(15),
    hire_date date);
    
create sequence hr2.l_lid_seq
    start with 1 
    increment by 1 
    maxvalue 9;
    
commit;