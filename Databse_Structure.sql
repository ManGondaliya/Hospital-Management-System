/* Hospital Management System Database Table Structure. */

/* Create Database Hospital. */

create database hospital;

/* Use This Database 'Hospital' */

use hospital;

/* Create Table Login. */

CREATE TABLE `login` (
  `user` varchar(20) DEFAULT NULL,
  `pass` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/* Insert Record In Login Table. */

insert into login values ('admin','admin123');

/* Create Table Patient. */

CREATE TABLE `patient` (
  `id` varchar(20) NOT NULL,
  `name` varchar(40) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `age` varchar(10) DEFAULT NULL,
  `mobile_no` varchar(20) DEFAULT NULL,
  `diseases` varchar(20) DEFAULT NULL,
  `room_no` varchar(20) DEFAULT NULL,
  `time` varchar(100) DEFAULT NULL,
  `deposite` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


/* Create Table Room. */

CREATE TABLE `room` (
  `room_no` varchar(20) DEFAULT NULL,
  `availability` varchar(20) DEFAULT NULL,
  `charge` varchar(20) DEFAULT NULL,
  `room_type` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


/* Insert Records Into Room Table. */

insert into room values('101','Available','500','General');
insert into room values('102','Available','500','General');
insert into room values('103','Available','500','General');
insert into room values('201','Available','1500','Private');
insert into room values('202','Available','1500','Private');
insert into room values('203','Available','1500','Private');
insert into room values('301','Available','3500','ICU Bed');
insert into room values('302','Available','3500','ICU Bed');
insert into room values('303','Available','3500','ICU Bed');


/* Create Table Doctor. */

CREATE TABLE `doctor` (
  `doctor_id` int NOT NULL,
  `doctor_name` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `mobile` varchar(15) NOT NULL,
  `specialization` varchar(45) NOT NULL,
  `shedule` varchar(45) NOT NULL,
  PRIMARY KEY (`doctor_id`),
  UNIQUE KEY `iddoctor_UNIQUE` (`doctor_id`),
  UNIQUE KEY `doctor_name_UNIQUE` (`doctor_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

   /* Create OPD Table.  */
   
   CREATE TABLE `opd` (
  `name` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `mobile_no` varchar(20) NOT NULL,
  `doctor_type` varchar(45) NOT NULL,
  `doctor_name` varchar(45) NOT NULL,
  `charge` varchar(30) NOT NULL,
  `date_time` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

