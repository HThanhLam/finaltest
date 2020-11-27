create database testsystem;
use testsystem;

CREATE TABLE Candidate (
    FirstName VARCHAR(20) NOT NULL,
    LastName VARCHAR(20) NOT NULL,
    Email VARCHAR(30) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    Password VARCHAR(30) NOT NULL,
    Expinyear smallint,
    Proskill Varchar(10),
    GraduationRank Varchar(20)
);
