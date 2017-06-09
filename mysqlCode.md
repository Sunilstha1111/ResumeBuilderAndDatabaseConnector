drop schema if exists Resumebuilder;
Create schema Resumebuilder;
use Resumebuilder;
drop table Resume;
create table Resume (
name varchar(255),
email varchar(255),
eduAll varchar(1500),
workAll varchar(1500),
skillAll varchar(1500));



select * from Resume;

