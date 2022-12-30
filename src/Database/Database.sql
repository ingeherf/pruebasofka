CREATE DATABASE  IF NOT EXISTS `spaceship` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `spaceship`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: spaceship
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `notripulated`
--

DROP TABLE IF EXISTS `notripulated`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notripulated` (
  `idnotripulated` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `maximumspeed` double NOT NULL,
  `weight` double NOT NULL,
  `height` double NOT NULL,
  `loadweight` double NOT NULL,
  `acumulateddistance` double NOT NULL,
  `company` varchar(200) NOT NULL,
  `country` varchar(150) NOT NULL,
  `active` tinyint(1) NOT NULL,
  `deleted` date DEFAULT NULL,
  PRIMARY KEY (`idnotripulated`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notripulated`
--

LOCK TABLES `notripulated` WRITE;
/*!40000 ALTER TABLE `notripulated` DISABLE KEYS */;
INSERT INTO `notripulated` VALUES (1,'Apollo II',59,74,1000,13,29,'JAXA','South Africa',1,NULL),(2,'Apollo I',77,74,1000,100,96,'NASA','United States',0,NULL),(3,'Apollo IV',6,5,1000,35,12,'NASA','United States',0,NULL);
/*!40000 ALTER TABLE `notripulated` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `propeller`
--

DROP TABLE IF EXISTS `propeller`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `propeller` (
  `idpropeller` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `maximumspeed` double NOT NULL,
  `weight` double NOT NULL,
  `height` double NOT NULL,
  `loadweight` double NOT NULL,
  `acumulateddistance` double NOT NULL,
  `company` varchar(200) NOT NULL,
  `country` varchar(150) NOT NULL,
  `motorcount` int NOT NULL,
  `active` tinyint(1) NOT NULL,
  `deleted` date DEFAULT NULL,
  PRIMARY KEY (`idpropeller`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `propeller`
--

LOCK TABLES `propeller` WRITE;
/*!40000 ALTER TABLE `propeller` DISABLE KEYS */;
INSERT INTO `propeller` VALUES (2,'GXG-01',1200,4350,80,1200,13250,'JAXA','Japan',4,1,NULL),(3,'STNIK-02',2100,2100,120,1350,4300,'FKA','Rusia',6,1,NULL),(4,'UPS-01',2201,12000,153,523,210,'Nasa','United States',3,1,NULL);
/*!40000 ALTER TABLE `propeller` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tripulated`
--

DROP TABLE IF EXISTS `tripulated`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tripulated` (
  `idtripulated` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `maximumspeed` double NOT NULL,
  `weight` double NOT NULL,
  `height` double NOT NULL,
  `loadweight` double NOT NULL,
  `acumulateddistance` double NOT NULL,
  `company` varchar(200) NOT NULL,
  `country` varchar(150) NOT NULL,
  `astrounautcounter` int NOT NULL,
  `active` tinyint(1) NOT NULL,
  `deleted` date DEFAULT NULL,
  PRIMARY KEY (`idtripulated`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tripulated`
--

LOCK TABLES `tripulated` WRITE;
/*!40000 ALTER TABLE `tripulated` DISABLE KEYS */;
INSERT INTO `tripulated` VALUES (2,'KPOA-00',1440,2182,90,720,450,'JAXA','Japan',8,1,NULL),(3,'EFM-00',1729,4124,55,1020,12000,'ESA','France',6,1,NULL),(4,'MME-00',31290,3129,98,3190,21901,'ESA','Sweden',7,0,NULL);
/*!40000 ALTER TABLE `tripulated` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-29 20:38:29
