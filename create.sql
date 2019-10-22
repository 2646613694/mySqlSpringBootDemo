/*
SQLyog v10.2 
MySQL - 5.7.20-log : Database - wms_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`wms_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `wms_db`;

/*Table structure for table `wms_user` */

DROP TABLE IF EXISTS `wms_user`;

CREATE TABLE `wms_user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_USERNAME` varchar(30) NOT NULL,
  `USER_PASSWORD` varchar(40) NOT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1021 DEFAULT CHARSET=utf8;

/*Data for the table `wms_user` */

insert  into `wms_user`(`USER_ID`,`USER_USERNAME`,`USER_PASSWORD`) values (1001,'admin','6f5379e73c1a9eac6163ab8eaec7e41c'),(1018,'王皓','50f202f4862360e55635b0a9616ded13'),(1019,'李富荣','c4b3af5a5ab3e3d5aac4c5a5436201b8'),(1020,'小可爱','38dc12ed0ca4f15ef59db04c6479b5ce');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
