-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 23, 2019 at 07:49 PM
-- Server version: 5.7.24
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proyecto`
--

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `E_Mail` varchar(45) DEFAULT NULL,
  `Edad` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`idCliente`, `Nombre`, `Telefono`, `E_Mail`, `Edad`) VALUES
(1, 'mike', '454', 'hbbbh', '15'),
(55669955, 'José Francisco', '5519051311', 'broodiersugar37@gmail.com', '18');

-- --------------------------------------------------------

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE IF NOT EXISTS `empleado` (
  `idEmpleado` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Edad` int(11) DEFAULT NULL,
  `Rfc` varchar(45) DEFAULT NULL,
  `Direccion` varchar(45) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `E_mail` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `empleado`
--

INSERT INTO `empleado` (`idEmpleado`, `Nombre`, `Edad`, `Rfc`, `Direccion`, `Telefono`, `E_mail`) VALUES
(1, 'Juan Esteban', 25, '545454', 'Satalite Privada 25', '55221145', 'Juan1212@hotmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `proyectos`
--

DROP TABLE IF EXISTS `proyectos`;
CREATE TABLE IF NOT EXISTS `proyectos` (
  `idProyectos` int(11) NOT NULL,
  `Tiempo` varchar(45) DEFAULT NULL,
  `Fecha_Inicio` date DEFAULT NULL,
  `Variante` varchar(45) DEFAULT NULL,
  `ProyectoDesc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idProyectos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyectos`
--

INSERT INTO `proyectos` (`idProyectos`, `Tiempo`, `Fecha_Inicio`, `Variante`, `ProyectoDesc`) VALUES
(1, '10a', '2019-11-06', 'lkm', 'kkm'),
(3404, '2 años', '2019-11-19', '', 'Proyecto cuida tu salud');

-- --------------------------------------------------------

--
-- Table structure for table `servicio`
--

DROP TABLE IF EXISTS `servicio`;
CREATE TABLE IF NOT EXISTS `servicio` (
  `idServicio` int(11) NOT NULL,
  `Variante` varchar(45) DEFAULT NULL,
  `Fecha_Fin` date DEFAULT NULL,
  `Fecha_Inicio` date DEFAULT NULL,
  `Empleado_idEmpleado` int(11) NOT NULL,
  `Cliente_idCliente` int(11) NOT NULL,
  `Proyectos_idProyectos` int(11) NOT NULL,
  PRIMARY KEY (`idServicio`),
  KEY `fk_Servicio_Empleado_idx` (`Empleado_idEmpleado`),
  KEY `fk_Servicio_Cliente1_idx` (`Cliente_idCliente`),
  KEY `fk_Servicio_Proyectos1_idx` (`Proyectos_idProyectos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `servicio`
--

INSERT INTO `servicio` (`idServicio`, `Variante`, `Fecha_Fin`, `Fecha_Inicio`, `Empleado_idEmpleado`, `Cliente_idCliente`, `Proyectos_idProyectos`) VALUES
(1, 'unknown', '2022-11-24', '2019-11-22', 1, 1, 3404);

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `idUsuario` int(10) NOT NULL AUTO_INCREMENT,
  `Usuarios` varchar(25) CHARACTER SET utf32 COLLATE utf32_spanish_ci NOT NULL,
  `Contraseña` blob NOT NULL,
  `roles` varchar(15) NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `Usuarios`, `Contraseña`, `roles`) VALUES
(7, 'mike', 0x6d696b65, 'admin'),
(8, 'mike', 0x6d696b65, 'admin'),
(9, 'mike', 0x6d696b65, 'admin'),
(6, 'mike', 0x6d696b65, 'admin'),
(10, 'mike', 0x6d696b65, 'admin'),
(11, 'mike', 0x6d696b65, 'admin'),
(12, 'Ramon', 0x70767461, 'visita');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `servicio`
--
ALTER TABLE `servicio`
  ADD CONSTRAINT `fk_Servicio_Cliente1` FOREIGN KEY (`Cliente_idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Servicio_Empleado` FOREIGN KEY (`Empleado_idEmpleado`) REFERENCES `empleado` (`idEmpleado`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Servicio_Proyectos1` FOREIGN KEY (`Proyectos_idProyectos`) REFERENCES `proyectos` (`idProyectos`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
