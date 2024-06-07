-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2024 at 11:20 PM
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
(8, 'SIMPLE'),
(9, 'SIMPLE'),
(10, 'SIMPLE'),
(11, 'ROOT'),
(12, 'ROOT'),
(13, 'ROOT');

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
(11, '2', '2', 2, '2', 2, '2', 2, '22', 'ENABLED'),
(22, '2', '2', 2, '2', 2, '2', 2, '2', 'ENABLED'),
(22222, '22', '22', 22, '22', 22, '2', 22, '22', 'DISABLED');

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
  `otp` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book_history`
--

INSERT INTO `book_history` (`book_id`, `T_status`, `T_time`, `T_date`, `student_id`, `employee_id`, `quantity`, `otp`) VALUES
(22, 'GAVE', '10:12:06', '2024-06-05', 87, 9, 1, NULL),
(22, 'GAVE', '10:12:09', '2024-06-05', 87, 9, 1, NULL),
(22, 'GAVE', '10:13:51', '2024-06-05', 87, 9, 1, NULL),
(22, 'GAVE', '10:19:56', '2024-06-05', 87, 9, 1, NULL),
(22, 'GAVE', '10:20:59', '2024-06-05', 87, 9, 1, NULL),
(22, 'GAVE', '10:21:03', '2024-06-05', 87, 9, 1, NULL),
(22, 'GAVE', '10:24:57', '2024-06-05', 87, 9, 1, NULL),
(22, 'GAVE', '10:25:09', '2024-06-05', 87, 9, 1, NULL),
(22, 'GAVE', '10:27:19', '2024-06-05', 87, 9, 1, NULL),
(22, 'GAVE', '01:46:23', '2024-06-06', 87, 879, 1, '288751'),
(22, 'GAVE', '01:47:12', '2024-06-06', 87, 879, 1, '585778'),
(22, 'RETURNED', '02:04:12', '2024-06-06', 87, 879, 1, '227683'),
(2, 'REQUESTED', '01:31:59', '2024-06-07', 87, NULL, 1, '922341');

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
(00000001, 'ADMIN', 'MD ROMJAN', 'ALI', 34, '', '', '', '2004-02-01', 'MALE', '1234', 2345, 'REGULER', ''),
(00000003, 'ADMIN', '', '', 234123, '', '', '', '0016-03-26', 'MALE', '1234', 52345, 'REGULER', ''),
(00000004, 'ADMIN', '', '', 12, '', '', '', '1212-12-12', 'MALE', '1234', 12, 'REGULER', ''),
(00000005, 'ADMIN', '', '', 56, '', '', '', '0036-11-03', 'MALE', '1234', 45, 'REGULER', ''),
(00000006, 'ADMIN', '', '', 4564356, '', '', '', '0031-04-02', 'MALE', '1234', 3456346, 'REGULER', ''),
(00000007, 'ADMIN', '', '', 121212, '', '', '', '0012-12-12', 'MALE', '1234', 121212, 'REGULER', ''),
(00000008, 'ADMIN', '', '', 1212, '', '', '', '0012-12-12', 'MALE', '1234', 1212, 'REGULER', ''),
(00000009, 'ADMIN', '', '', 12121, '', '', '', '0012-12-12', 'MALE', '1234', 12121, 'REGULER', ''),
(00000013, 'ADMIN', 'MD ROMJAN', 'ALI', 4674583507, '+8801779852361', 'ROMJANALI01673@GMAIL.COM', '35-BAIRA', '2024-02-01', 'MALE', '1234', 1234567890, 'REGULER', 'KARIM');

-- --------------------------------------------------------

--
-- Table structure for table `employee_history`
--

CREATE TABLE `employee_history` (
  `E_id` int(8) DEFAULT NULL,
  `T_status` varchar(20) DEFAULT NULL,
  `by_who` varchar(200) DEFAULT NULL,
  `T_time` time DEFAULT NULL,
  `T_DATE` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `notification`
--

CREATE TABLE `notification` (
  `student_id` int(8) NOT NULL,
  `employee_id` int(8) NOT NULL,
  `subject` varchar(111) NOT NULL,
  `T_time` time DEFAULT NULL,
  `T_date` date DEFAULT NULL,
  `message` varchar(800) NOT NULL,
  `description` varchar(5000) NOT NULL,
  `From_who` int(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `notification`
--

INSERT INTO `notification` (`student_id`, `employee_id`, `subject`, `T_time`, `T_date`, `message`, `description`, `From_who`) VALUES
(87, 0, '', NULL, NULL, '', '', NULL),
(5685, 0, '', NULL, NULL, '', '', NULL),
(87, 0, '', NULL, NULL, '', '', NULL),
(87, 0, '457454j45756', NULL, NULL, '', '', NULL),
(2345, 3456, 'sd', '00:58:58', '2024-06-07', 'sd', 'sd', NULL),
(2345, 3456, 'sd', '01:00:13', '2024-06-07', 'sd', 'sd', NULL);

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
('FD', 'DFAS', 'DDDS', 'SDFDDD', 'MALE', '2009-05-29', 4674583506, 'SDASA', 'DASD', 'S', 's', '01:28:17', '2024-05-30'),
('GFH', 'FGHDFG', 'FGHFDG', 'FDGHDFG', 'MALE', '2015-05-21', 5645645, 'FGH', 'GFHFD', 'FGHD', '11', '06:02:57', '2024-05-31');

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

--
-- Dumping data for table `student_book`
--

INSERT INTO `student_book` (`student_id`, `book_id`, `T_time`, `T_date`, `T_status`) VALUES
(0, 23433, '00:00:00', '0000-00-00', ''),
(234, 0, '00:00:00', '0000-00-00', ''),
(87, 22, '23:23:23', '2323-12-12', 'TAKEN'),
(87, 22, '23:23:23', '2323-12-12', 'ISSUE');

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
  `s_status` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_data`
--

INSERT INTO `student_data` (`fast_name`, `last_name`, `phone`, `email`, `gender`, `dob`, `nid_birth`, `institute_office`, `ins_office_id`, `full_address`, `pass`, `user_id`, `s_status`) VALUES
('34523', '3453', NULL, '3452', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 00000222, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `student_history`
--

CREATE TABLE `student_history` (
  `user_id` int(8) DEFAULT NULL,
  `T_status` varchar(20) DEFAULT NULL,
  `by_who` varchar(150) DEFAULT NULL,
  `employee_id` int(8) DEFAULT NULL,
  `TIME` time DEFAULT NULL,
  `DATE` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_history`
--

INSERT INTO `student_history` (`user_id`, `T_status`, `by_who`, `employee_id`, `TIME`, `DATE`) VALUES
(87, 'registation', NULL, NULL, '09:08:08', '2024-04-09');

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
  MODIFY `user_id` int(8) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `student_data`
--
ALTER TABLE `student_data`
  MODIFY `user_id` int(8) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=223;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
