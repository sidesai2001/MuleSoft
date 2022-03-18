-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 18, 2022 at 08:58 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `movies`
--

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

CREATE TABLE `movies` (
  `m_name` varchar(100) DEFAULT NULL,
  `m_actor` varchar(100) DEFAULT NULL,
  `m_actress` varchar(100) DEFAULT NULL,
  `m_year` int(11) DEFAULT NULL,
  `m_director` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `movies`
--

INSERT INTO `movies` (`m_name`, `m_actor`, `m_actress`, `m_year`, `m_director`) VALUES
('John Wick', 'Keanu Reeves', 'Bridget Moynahan', 2014, 'Chad Stahelski'),
('Tenet', 'John David Washington', 'Elizabeth Debicki', 2020, 'Christopher Nolan'),
('Pushpa: The Rise', 'Allu Arjun', 'Rashmika Mandanna', 2021, 'Sukumar'),
('Spider-Man: No Way Home', 'Tom Holland', 'Zendaya', 2021, 'Jon Watts'),
('Sooryavanshi', 'Akshay Kumar', 'Katrina Kaif', 2021, 'Rohit Shetty'),
('Nobody', 'Bob Odenkirk', 'Connie Nielsen', 2021, 'Ilya Naishuller'),
('The Kashmir Files', 'Chinmay Mandlekar', 'Pallavi Joshi', 2022, 'Vivek Agnihotri');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
