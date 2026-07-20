/*
SQLyog Community v13.3.1 (64 bit)
MySQL - 10.4.32-MariaDB : Database - MockEntranceExam
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`MockEntranceExam` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `MockEntranceExam`;

/*Table structure for table `Administrator` */

DROP TABLE IF EXISTS `Administrator`;

CREATE TABLE `Administrator` (
  `id` bigint(20) unsigned NOT NULL,
  `employee_num` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  UNIQUE KEY `employee_num` (`employee_num`),
  CONSTRAINT `Administrator_ibfk_1` FOREIGN KEY (`id`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `Administrator` */

/*Table structure for table `Candidate` */

DROP TABLE IF EXISTS `Candidate`;

CREATE TABLE `Candidate` (
  `id` bigint(20) unsigned NOT NULL,
  `jmbg` varchar(13) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `jmbg` (`jmbg`),
  CONSTRAINT `Candidate_ibfk_1` FOREIGN KEY (`id`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `Candidate` */

/*Table structure for table `Exam` */

DROP TABLE IF EXISTS `Exam`;

CREATE TABLE `Exam` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `Exam` */

/*Table structure for table `Payment` */

DROP TABLE IF EXISTS `Payment`;

CREATE TABLE `Payment` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `registration_id` bigint(20) unsigned NOT NULL,
  `administrator_id` bigint(20) unsigned NOT NULL,
  `amount` decimal(10,2) NOT NULL CHECK (`amount` >= 0),
  `payment_date` datetime NOT NULL,
  `recorded_at` datetime NOT NULL,
  `transaction_reference` varchar(100) DEFAULT NULL,
  `note` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `registration_id` (`registration_id`),
  KEY `administrator_id` (`administrator_id`),
  CONSTRAINT `Payment_ibfk_1` FOREIGN KEY (`registration_id`) REFERENCES `Registration` (`id`),
  CONSTRAINT `Payment_ibfk_2` FOREIGN KEY (`administrator_id`) REFERENCES `Administrator` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `Payment` */

/*Table structure for table `PriceList` */

DROP TABLE IF EXISTS `PriceList`;

CREATE TABLE `PriceList` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `exam_id` bigint(20) unsigned NOT NULL,
  `price` decimal(10,2) NOT NULL CHECK (`price` >= 0),
  `start_date` datetime NOT NULL,
  `end_date` datetime DEFAULT NULL CHECK (`end_date` is null or `end_date` >= `start_date`),
  `active` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `exam_id` (`exam_id`),
  CONSTRAINT `PriceList_ibfk_1` FOREIGN KEY (`exam_id`) REFERENCES `Exam` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `PriceList` */

/*Table structure for table `Registration` */

DROP TABLE IF EXISTS `Registration`;

CREATE TABLE `Registration` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `candidate_id` bigint(20) unsigned NOT NULL,
  `created_at` datetime NOT NULL,
  `total_cost` decimal(10,2) NOT NULL CHECK (`total_cost` >= 0),
  `status` varchar(30) NOT NULL COMMENT 'Ovde je varchar zato sto postoje 4 razlicite vrednosti za status u Registration',
  `reference_number` varchar(100) NOT NULL,
  `cancellation_date` datetime DEFAULT NULL,
  `payment_deadline` datetime NOT NULL CHECK (`payment_deadline` > `created_at`),
  PRIMARY KEY (`id`),
  UNIQUE KEY `reference_number` (`reference_number`),
  KEY `candidate_id` (`candidate_id`),
  CONSTRAINT `Registration_ibfk_1` FOREIGN KEY (`candidate_id`) REFERENCES `Candidate` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `Registration` */

/*Table structure for table `RegistrationItem` */

DROP TABLE IF EXISTS `RegistrationItem`;

CREATE TABLE `RegistrationItem` (
  `registration_id` bigint(20) unsigned NOT NULL,
  `term_id` bigint(20) unsigned NOT NULL,
  `price` decimal(10,2) NOT NULL CHECK (`price` >= 0),
  PRIMARY KEY (`registration_id`,`term_id`),
  KEY `term_id` (`term_id`),
  CONSTRAINT `RegistrationItem_ibfk_1` FOREIGN KEY (`registration_id`) REFERENCES `Registration` (`id`),
  CONSTRAINT `RegistrationItem_ibfk_2` FOREIGN KEY (`term_id`) REFERENCES `Term` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `RegistrationItem` */

/*Table structure for table `Term` */

DROP TABLE IF EXISTS `Term`;

CREATE TABLE `Term` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `exam_id` bigint(20) unsigned NOT NULL,
  `starts_at` datetime NOT NULL,
  `address` varchar(100) NOT NULL,
  `capacity` int(20) unsigned NOT NULL CHECK (`capacity` > 0),
  `registration_deadline` datetime NOT NULL CHECK (`registration_deadline` < `starts_at`),
  `status` varchar(30) NOT NULL COMMENT 'Pogledaj u Registration status (isti je razlog)',
  PRIMARY KEY (`id`),
  KEY `exam_id` (`exam_id`),
  CONSTRAINT `Term_ibfk_1` FOREIGN KEY (`exam_id`) REFERENCES `Exam` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `Term` */

/*Table structure for table `User` */

DROP TABLE IF EXISTS `User`;

CREATE TABLE `User` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `active` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `User` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
