-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 18, 2020 at 04:31 PM
-- Server version: 5.7.19
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fooddelivery`
--

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
CREATE TABLE IF NOT EXISTS `menu` (
  `ItemId` int(11) NOT NULL AUTO_INCREMENT,
  `ItemName` varchar(50) NOT NULL,
  `ItemPrice` varchar(20) NOT NULL,
  `Restaurant_Name` varchar(100) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ItemId`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`ItemId`, `ItemName`, `ItemPrice`, `Restaurant_Name`, `status`) VALUES
(1, 'bigmac', '10', 'mcd1', 1),
(2, 'Junior', '45', 'mcd1', 0),
(3, 'Samosa', '2.00', 'kabir', 1),
(4, 'burger', '1.0', 'kabir', 1),
(5, 'PalakPaneer', '10.20', 'kabir', 1),
(7, 'roti', '1', 'kabir', 1),
(8, 'Buger', '10', 'mcd1', 0),
(9, 'Beef', '7', 'Vua', 0),
(10, 'Chicken', '5', 'Vua', 1);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `Id` int(50) NOT NULL AUTO_INCREMENT,
  `ClientName` varchar(100) NOT NULL,
  `DeliveryGuyName` varchar(10) DEFAULT NULL,
  `RestaurantName` varchar(50) NOT NULL,
  `DeliveryArea` varchar(100) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Time` varchar(100) NOT NULL,
  `Itemname` varchar(100) NOT NULL,
  `Itemprice` varchar(100) NOT NULL,
  `Itemqty` varchar(100) NOT NULL,
  `Itemtotal` varchar(100) NOT NULL,
  `grandtotal` varchar(100) NOT NULL,
  `OrderStatus` varchar(100) NOT NULL,
  `Status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`Id`, `ClientName`, `DeliveryGuyName`, `RestaurantName`, `DeliveryArea`, `Date`, `Time`, `Itemname`, `Itemprice`, `Itemqty`, `Itemtotal`, `grandtotal`, `OrderStatus`, `Status`) VALUES
(8, 'nehal1', NULL, 'mcd1', 'H6G', '2020-02-15', '18:48:46.713', 'BigMac', '5.00', '2', '10.0', '45.0', 'pending', 1),
(9, 'riya1', NULL, 'mcd1', 'H6G', '2020-02-15', '18:48:46.713', 'Junior', '1.00', '10', '10.0', '45.0', 'pending', 1),
(10, 'riya1', NULL, 'mcd1', 'H6G', '2020-02-15', '18:48:46.713', 'BigMac', '5.00', '5', '25.0', '45.0', 'pending', 1),
(11, 'Pooja', NULL, 'mcd1', 'H6G', '2020-02-15', '19:19:54.785', 'BigMac', '5.00', '1', '5.0', '6.0', 'pending', 1),
(12, 'Pooja', NULL, 'mcd1', 'H6G', '2020-02-15', '19:19:54.785', 'Junior', '1.00', '1', '1.0', '6.0', 'pending', 1),
(13, 'riya1', NULL, 'mcd1', 'H6G', '2020-02-16', '20:51:25.556', 'Junior', '1.00', '1', '1.0', '1.0', 'pending', 1),
(14, 'riya1', 'dhaval', 'mcd1', 'H6H', '2020-02-16', '00:19:00.937', 'BigMac', '5.00', '50', '250.0', '250.0', 'Ready', 1),
(15, 'nima', NULL, 'Vua', 'H3H ', '2020-02-18', '09:24:27.921', 'Chicken', '5', '5', '25.0', '25.0', 'Ready', 1),
(16, 'nima', NULL, 'mcd1', 'H6H', '2020-02-18', '09:30:21.075', 'Buger', '5', '5', '25.0', '157.0', 'pending', 1),
(17, 'nima', NULL, 'mcd1', 'H6H', '2020-02-18', '09:30:21.075', 'Junior', '66', '2', '132.0', '157.0', 'pending', 1),
(18, 'nima', NULL, 'mcd1', 'H6H', '2020-02-18', '10:57:56.119', 'bigmac', '10', '5', '50.0', '300.0', 'accepted', 1),
(19, 'nima', NULL, 'mcd1', 'H6H', '2020-02-18', '10:57:56.119', 'bigmac', '10', '25', '250.0', '300.0', 'accepted', 1);

-- --------------------------------------------------------

--
-- Table structure for table `restaurant`
--

DROP TABLE IF EXISTS `restaurant`;
CREATE TABLE IF NOT EXISTS `restaurant` (
  `Restaurant_id` int(11) NOT NULL AUTO_INCREMENT,
  `Restaurant_Name` varchar(50) NOT NULL,
  `Restaurant_Address` text NOT NULL,
  `Restaurant_No` varchar(50) NOT NULL,
  `Sunday_Open_Hour` varchar(10) NOT NULL,
  `Sunday_Open_Minute` varchar(10) NOT NULL,
  `Sunday_Close_Hour` varchar(10) NOT NULL,
  `Sunday_Close_Minute` varchar(10) NOT NULL,
  `Monday_Open_Hour` varchar(10) NOT NULL,
  `Monday_Open_Minute` varchar(10) NOT NULL,
  `Monday_Close_Hour` varchar(10) NOT NULL,
  `Monday_Close_Minute` varchar(10) NOT NULL,
  `Tuesday_Open_Hour` varchar(10) NOT NULL,
  `Tuesday_Open_Minute` varchar(10) NOT NULL,
  `Tuesday_Close_Hour` varchar(10) NOT NULL,
  `Tuesday_Close_Minute` varchar(10) NOT NULL,
  `Wednesday_Open_Hour` varchar(10) NOT NULL,
  `Wednesday_Open_Minute` varchar(10) NOT NULL,
  `Wednesday_Close_Hour` varchar(10) NOT NULL,
  `Wednesday_Close_Minute` varchar(10) NOT NULL,
  `Thursday_Open_Hour` varchar(10) NOT NULL,
  `Thursday_Open_Minute` varchar(10) NOT NULL,
  `Thursday_Close_Hour` varchar(10) NOT NULL,
  `Thursday_Close_Minute` varchar(10) NOT NULL,
  `Friday_Open_Hour` varchar(10) NOT NULL,
  `Friday_Open_Minute` varchar(10) NOT NULL,
  `Friday_Close_Hour` varchar(10) NOT NULL,
  `Friday_Close_Minute` varchar(10) NOT NULL,
  `Saturday_Open_Hour` varchar(10) NOT NULL,
  `Saturday_Open_Minute` varchar(10) NOT NULL,
  `Saturday_Close_Hour` varchar(10) NOT NULL,
  `Saturday_Close_Minute` varchar(10) NOT NULL,
  `DeliveryArea` text NOT NULL,
  `Status` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`Restaurant_id`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `restaurant`
--

INSERT INTO `restaurant` (`Restaurant_id`, `Restaurant_Name`, `Restaurant_Address`, `Restaurant_No`, `Sunday_Open_Hour`, `Sunday_Open_Minute`, `Sunday_Close_Hour`, `Sunday_Close_Minute`, `Monday_Open_Hour`, `Monday_Open_Minute`, `Monday_Close_Hour`, `Monday_Close_Minute`, `Tuesday_Open_Hour`, `Tuesday_Open_Minute`, `Tuesday_Close_Hour`, `Tuesday_Close_Minute`, `Wednesday_Open_Hour`, `Wednesday_Open_Minute`, `Wednesday_Close_Hour`, `Wednesday_Close_Minute`, `Thursday_Open_Hour`, `Thursday_Open_Minute`, `Thursday_Close_Hour`, `Thursday_Close_Minute`, `Friday_Open_Hour`, `Friday_Open_Minute`, `Friday_Close_Hour`, `Friday_Close_Minute`, `Saturday_Open_Hour`, `Saturday_Open_Minute`, `Saturday_Close_Hour`, `Saturday_Close_Minute`, `DeliveryArea`, `Status`) VALUES
(1, 'kabir', 'cascs', '7412589631', '01', '00', '01', '00', '01', '00', '01', '00', '01', '00', '01', '00', '01', '00', '01', '00', '01', '00', '01', '00', '01', '00', '01', '01', '01', '00', '01', '00', 'afsf sdsc ', 1),
(2, 'Vua', 'Montreal', '5147896321', '11', '00', '22', '00', '07', '00', '24', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', 'H6H H3H ', 1),
(3, 'Tim', 'scdcds', 'dvdv', '01', '01', '01', '01', '01', '01', '01', '01', '01', '01', '01', '01', '01', '01', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', 'scscs', 0),
(4, 'mcd1', 'montreal', '9632587410', '08', '00', '18', '00', '02', '02', '04', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', 'J8T H4H H6H  ', 1),
(5, 'dfgdfhd', 'dhdrh', 'dhn', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', 'H3H ', 1),
(6, 'starbucks', 'vsdvd', '8523697410', '01', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', 'H4H ', 1),
(7, 'Pho', 'sasascc1234', '7412589631', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', '00', 'dsddvs', 0),
(8, 'DKJFHSKJ', 'JDHKS', '1234567890', '01', '00', '00', '00', '01', '00', '00', '00', '01', '00', '00', '00', '01', '00', '00', '00', '01', '00', '00', '00', '01', '00', '00', '00', '01', '00', '00', '00', 'H6GK9L', 1),
(9, 'RJFYGH', 'KHD', '0987654321', '06', '00', '00', '00', '06', '00', '00', '00', '06', '00', '00', '00', '06', '00', '00', '00', '06', '00', '00', '00', '06', '00', '00', '00', '06', '00', '00', '00', 'S5RR4TG5H', 1),
(10, 'Vua sandwich saint ctherer', 'Qubec', '5147896123', '10', '00', '22', '00', '10', '00', '22', '00', '10', '00', '22', '00', '10', '00', '22', '00', '10', '00', '22', '00', '10', '00', '22', '22', '10', '00', '22', '00', 'O8H H6J H3H  ', 0),
(11, 'Abc', 'Qc', '8521479630', '07', '00', '03', '00', '07', '00', '03', '00', '07', '00', '03', '00', '07', '00', '03', '00', '07', '00', '03', '00', '07', '00', '03', '03', '07', '00', '03', '00', 'L7K J7K ', 0),
(12, 'Abc', 'Qc', '8521479630', '07', '00', '03', '00', '07', '00', '03', '00', '07', '00', '03', '00', '07', '00', '03', '00', '07', '00', '03', '00', '07', '00', '03', '03', '07', '00', '03', '00', ' J7K', 0);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Cpassword` varchar(50) NOT NULL,
  `Last_name` varchar(10) NOT NULL,
  `First_name` varchar(10) NOT NULL,
  `Address` text NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Phone_number` varchar(15) NOT NULL,
  `Level` varchar(10) DEFAULT NULL,
  `Restaurant_Name` varchar(50) DEFAULT NULL,
  `Status` int(10) NOT NULL DEFAULT '1',
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=65 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Id`, `Username`, `Password`, `Cpassword`, `Last_name`, `First_name`, `Address`, `Email`, `Phone_number`, `Level`, `Restaurant_Name`, `Status`) VALUES
(1, 'nehal', '111', '111', 'patel', 'riya', 'Montreal', 'riya@123', '1234567890', 'admin', '', 1),
(2, 'aaa', 'aaaa', '', 'aaaa', 'aaa', 'aaa', 'aaa', 'dfesdfsedf', '2', '', 1),
(3, 'riya', '12', '', 'jlfkj', 'jflkjf;l', 'fjlkfj', 'jlskfj', '12323', '22', '', 1),
(4, 'aaaaa', 'aaa', '', 'defdse', 'fsfs', 'eefes', 'dede', 'effsf', 'client', '', 1),
(5, 'hgkjhkj', 'grgf', '', 'kjhfkjs', 'kjhfekh', 'kjfhkesfh', 'dekfh', 'fghfkkf', 'client', '', 1),
(6, 'Pooja', '12345', '', 'thakkar', 'pooja', 'ndjfjkfnvdlks', 'poojathakkar1997', '741258963', 'client', '', 0),
(13, 'anjani', 'anji', '', 'patel', 'anjani', 'scscscsdcs', 'vddscdvd', '741258963', 'client', '', 1),
(14, 'anjani', 'anj', '', 'patel', 'anjani', 'scscscsdcs', 'vddscdvd', '741258963', 'client', '', 1),
(15, 'anjani', 'anjani', '', 'patel', 'anjani', '', 'vddscdvd', '741258963', 'client', '', 1),
(16, 'anjani', 'pooja', '', 'patel', 'anjani', '', 'vddscdvd', '741258963', 'client', '', 1),
(17, 'anjani', 'anjani1', '', 'patel', 'anjani', 'axAX', 'vddscdvd', '741258963', 'client', '', 1),
(18, 'alka', 'alka', '', 'scsc', 'dsvdv', 'vdsv', 'dvsd', 'vdsv', 'client', '', 1),
(35, 'Pano', 'pano123', 'pano123', 'Patel', 'Pano pp', 'Montreal', 'pano@gmail.com', '235689dscsc', 'manager', '', 1),
(32, 'Shail', 'shail12', 'shail12', 'thak', 'shailesh', 'acsacsc', 'scascascs', 'scscs', 'admin', '', 1),
(36, 'Pano', 'pano123', 'pano123', 'Patel', 'Pano pp', 'Montreal', 'pano@gmail.com', '235689dscsc', 'manager', 'Vua', 0),
(37, 'punam', 'punam12', 'punam12', 'fsfdf', 'dsvfv', 'sa', 'vdsgd', 'sfafs', 'manager', 'kabir', 0),
(45, 'khushbo', '12345678', '12345678', 'fsfdf', 'dsvfv', 'sa', 'vdsgd', 'sfafs', 'chef', 'mcd1', 1),
(46, 'dipti', '123456', '123456', 'sas', 'scdas', 'ascs', 'sca', 'ascs', 'manager', 'starbucks', 0),
(47, 'mehul', 'mehul12', 'mehul12', '', '', 'H6H ', '', '741258963', 'guy', '', 1),
(55, 'abc', '123456', '123456', '', '', 'H4H H3H ', '', '7412589635', 'guy', '', 1),
(48, 'khushi', '12345678', '12345678', 'kushiii', 'thakkkar', 'cascscs', 'casdscdsv', '7418529630', 'manager', 'mcd1', 1),
(50, 'dhaval', '1234567', '1234567', '', '', 'H6H H3H H2H ', '', '7412589632', 'guy', '', 1),
(62, 'Dhoshi', '123456', '123456', '', '', 'H3G H4H  ', '', '7412589630', 'guy', '', 0),
(63, 'nehal', '123456', '123456', 'patell', 'neehaa', 'montreal', 'nehal@gmail.com', '9632587410', 'chef', 'Vua', 1),
(64, 'nima', '123456', '123456', 'nima', 'patel', 'montreal', 'nima@gmail.com', '1123456987', 'client', NULL, 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
