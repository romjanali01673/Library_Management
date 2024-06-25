-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 25, 2024 at 10:23 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library_ms`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_data`
--

CREATE TABLE `admin_data` (
  `user_id` int(8) NOT NULL,
  `admin_type` varchar(20) DEFAULT 'SIMPLE'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_data`
--

INSERT INTO `admin_data` (`user_id`, `admin_type`) VALUES
(1, 'ROOT');

-- --------------------------------------------------------

--
-- Table structure for table `book_data`
--

CREATE TABLE `book_data` (
  `book_id` int(6) NOT NULL,
  `book_name` varchar(200) DEFAULT NULL,
  `author` varchar(100) DEFAULT NULL,
  `book_part` int(2) DEFAULT NULL,
  `book_type` varchar(20) DEFAULT NULL,
  `price` int(5) DEFAULT NULL,
  `few_i_line` varchar(500) DEFAULT NULL,
  `quantity` int(4) DEFAULT NULL,
  `book_source` varchar(200) NOT NULL,
  `b_status` varchar(10) DEFAULT 'REGULER'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book_data`
--

INSERT INTO `book_data` (`book_id`, `book_name`, `author`, `book_part`, `book_type`, `price`, `few_i_line`, `quantity`, `book_source`, `b_status`) VALUES
(121, '1', '1', 1, '1', 1, '1', 1, '1', 'REGULER');

-- --------------------------------------------------------

--
-- Table structure for table `book_history`
--

CREATE TABLE `book_history` (
  `book_id` int(6) DEFAULT NULL,
  `T_status` varchar(20) DEFAULT NULL,
  `T_time` time DEFAULT NULL,
  `T_date` date DEFAULT NULL,
  `student_id` int(8) DEFAULT NULL,
  `employee_id` int(8) DEFAULT NULL,
  `quantity` int(8) NOT NULL DEFAULT 1,
  `otp` varchar(6) DEFAULT NULL,
  `by_who` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book_history`
--

INSERT INTO `book_history` (`book_id`, `T_status`, `T_time`, `T_date`, `student_id`, `employee_id`, `quantity`, `otp`, `by_who`) VALUES
(121, 'ADDED', '15:21:24', '2024-06-12', NULL, 1, 1, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `changes_student_data`
--

CREATE TABLE `changes_student_data` (
  `fast_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `nid_birth` bigint(20) NOT NULL,
  `dob` date DEFAULT NULL,
  `institute_office` varchar(400) DEFAULT NULL,
  `ins_office_id` varchar(20) DEFAULT NULL,
  `full_address` varchar(500) DEFAULT NULL,
  `remark` varchar(5000) DEFAULT NULL,
  `user_id` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `employee_data`
--

CREATE TABLE `employee_data` (
  `user_id` int(8) UNSIGNED ZEROFILL NOT NULL,
  `position` varchar(10) NOT NULL,
  `fast_name` varchar(10) NOT NULL,
  `last_name` varchar(10) NOT NULL,
  `nid` bigint(17) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `email` varchar(100) NOT NULL,
  `full_address` varchar(200) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(10) NOT NULL,
  `pass` varchar(100) NOT NULL DEFAULT '1234',
  `ftr_nid` bigint(17) DEFAULT NULL,
  `e_status` varchar(10) DEFAULT NULL,
  `ftr_name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee_data`
--

INSERT INTO `employee_data` (`user_id`, `position`, `fast_name`, `last_name`, `nid`, `phone`, `email`, `full_address`, `dob`, `gender`, `pass`, `ftr_nid`, `e_status`, `ftr_name`) VALUES
(00000001, 'ADMIN', 'MD ROMJAN', 'ALI', 4574583507, '+8801779852361', 'ROMJANALI01673@GMAIL.COM', '350-BAIRA, MURADNAGAR, CUMILLA.', '2004-02-01', 'MALE', '1234560', 101010101010, 'REGULER', 'KARIM'),
(00000035, 'LIBRARIAN', 'KAPIL', 'UDDIN', 1234567890, '01789757888', 'KAPILUDDIN@GMAIL.COM', '350-SDFS,SDFSA,COX\'S BAZER.', '2002-06-26', 'MALE', '1234', 1234567890, 'REGULER', 'XYZ');

-- --------------------------------------------------------

--
-- Table structure for table `employee_history`
--

CREATE TABLE `employee_history` (
  `E_id` int(8) DEFAULT NULL,
  `T_status` varchar(20) DEFAULT NULL,
  `by_who` varchar(200) DEFAULT NULL,
  `T_time` time DEFAULT NULL,
  `T_date` date DEFAULT NULL,
  `A_E_id` int(8) DEFAULT NULL,
  `U_type` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee_history`
--

INSERT INTO `employee_history` (`E_id`, `T_status`, `by_who`, `T_time`, `T_date`, `A_E_id`, `U_type`) VALUES
(1, 'ADDED', 'DEVELOPER', '23:23:23', '2024-06-12', -999999, 'ADMIN'),
(35, 'ADDED', 'ADMIN', '15:13:30', '2024-06-12', 1, 'LIBRARIAN');

-- --------------------------------------------------------

--
-- Table structure for table `notification`
--

CREATE TABLE `notification` (
  `student_id` int(8) DEFAULT NULL,
  `employee_id` int(8) DEFAULT NULL,
  `subject` varchar(111) NOT NULL,
  `T_time` time NOT NULL,
  `T_date` date NOT NULL,
  `message` varchar(800) NOT NULL,
  `description` varchar(5000) DEFAULT NULL,
  `From_who` varchar(20) DEFAULT NULL,
  `A_E_ID` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `registaed_student_data`
--

CREATE TABLE `registaed_student_data` (
  `fast_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `nid_birth` bigint(17) DEFAULT NULL,
  `institute_office` varchar(200) DEFAULT NULL,
  `ins_office_id` varchar(30) DEFAULT NULL,
  `full_address` varchar(200) DEFAULT NULL,
  `pass` varchar(100) DEFAULT NULL,
  `registation_time` time DEFAULT NULL,
  `registation_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `registaed_student_data`
--

INSERT INTO `registaed_student_data` (`fast_name`, `last_name`, `phone`, `email`, `gender`, `dob`, `nid_birth`, `institute_office`, `ins_office_id`, `full_address`, `pass`, `registation_time`, `registation_date`) VALUES
('KAPIL', 'UDDIN', '+8801872018309', 'KAPILUDDIN36000@GMAIL.COM', 'MALE', '2008-06-19', 22009983293424797, 'BRAHMANBARIA POLYTECHNIC INSTITUTE', '677829', 'XYZ, COX\'S BAZER', '1234', '11:07:14', '2024-06-13');

-- --------------------------------------------------------

--
-- Table structure for table `student_book`
--

CREATE TABLE `student_book` (
  `student_id` int(8) NOT NULL,
  `book_id` int(6) NOT NULL,
  `T_time` time NOT NULL,
  `T_date` date NOT NULL,
  `T_status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student_data`
--

CREATE TABLE `student_data` (
  `fast_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `nid_birth` bigint(17) DEFAULT NULL,
  `institute_office` varchar(200) DEFAULT NULL,
  `ins_office_id` varchar(30) DEFAULT NULL,
  `full_address` varchar(200) DEFAULT NULL,
  `pass` varchar(100) DEFAULT NULL,
  `user_id` int(8) UNSIGNED ZEROFILL NOT NULL,
  `s_status` varchar(10) NOT NULL DEFAULT 'REGULER'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_data`
--

INSERT INTO `student_data` (`fast_name`, `last_name`, `phone`, `email`, `gender`, `dob`, `nid_birth`, `institute_office`, `ins_office_id`, `full_address`, `pass`, `user_id`, `s_status`) VALUES
('MD ROMJAN', 'ALI', '+8801779852361', 'ROMJANALI01673@GMAIL.COM', 'MALE', '2004-02-01', 4674583507, 'BRAHMANBARIA POLYTECHNIC INSTITUTE', '677844', '350-BAIRA, MURADNAGER, CUMILLA.', '1234560', 00000246, 'REGULER'),
('SAA', 'AA', 'AA', 'AA', 'MALE', '2005-05-05', 12, 'AA', 'AA', 'AA', 'aa', 00000249, 'REGULER'),
('A', 'A', 'A', 'A', 'MALE', '2005-06-21', 13, 'A', 'A', 'A', 'A', 00000253, 'REGULER');

-- --------------------------------------------------------

--
-- Table structure for table `student_history`
--

CREATE TABLE `student_history` (
  `user_id` int(8) DEFAULT NULL,
  `T_status` varchar(20) DEFAULT NULL,
  `by_who` varchar(150) DEFAULT NULL,
  `employee_id` int(8) DEFAULT NULL,
  `T_time` time DEFAULT NULL,
  `T_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_history`
--

INSERT INTO `student_history` (`user_id`, `T_status`, `by_who`, `employee_id`, `T_time`, `T_date`) VALUES
(246, 'ADDED', 'ADMIN', 1, '15:12:04', '2024-06-12'),
(246, 'REGISTATION', 'STUDENT', NULL, '15:11:32', '1970-01-01'),
(246, 'CHANGE', 'STUDENT', NULL, '15:19:32', '2024-06-12'),
(246, 'UPDATED', 'ADMIN', 1, '15:20:49', '2024-06-12'),
(249, 'ADDED', 'ADMIN', 1, '15:36:58', '2024-06-12'),
(249, 'REGISTATION', 'STUDENT', NULL, '15:36:31', '1970-01-01'),
(250, 'REGISTATION', 'STUDENT', 56, '15:40:14', '2024-06-12'),
(250, 'ADDED', 'MODERATOR', 56, '15:51:03', '2024-06-12'),
(0, 'DELETED', 'ADMIN', 1, '16:01:43', '2024-06-12'),
(253, 'ADDED', 'ADMIN', 1, '16:06:38', '2024-06-12'),
(253, 'REGISTATION', 'STUDENT', NULL, '16:05:07', '1970-01-01');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_data`
--
ALTER TABLE `admin_data`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `book_data`
--
ALTER TABLE `book_data`
  ADD PRIMARY KEY (`book_id`);

--
-- Indexes for table `changes_student_data`
--
ALTER TABLE `changes_student_data`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `nid_birth` (`nid_birth`);

--
-- Indexes for table `employee_data`
--
ALTER TABLE `employee_data`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `nid` (`nid`);

--
-- Indexes for table `student_data`
--
ALTER TABLE `student_data`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `nid_birth` (`nid_birth`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee_data`
--
ALTER TABLE `employee_data`
  MODIFY `user_id` int(8) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `student_data`
--
ALTER TABLE `student_data`
  MODIFY `user_id` int(8) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=254;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
