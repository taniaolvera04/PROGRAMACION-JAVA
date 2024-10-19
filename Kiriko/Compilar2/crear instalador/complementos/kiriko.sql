-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-11-2023 a las 18:37:06
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `kiriko`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id_p` int(4) NOT NULL,
  `tipo_p` varchar(60) NOT NULL,
  `marca` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE `compras` (
  `id_u` int(4) NOT NULL,
  `folio_c` int(4) NOT NULL,
  `totalc` double NOT NULL,
  `fecha_hrc` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`id_u`, `folio_c`, `totalc`, `fecha_hrc`) VALUES
(2, 10, 11, '2023-11-27 08:21:48'),
(2, 11, 37, '2023-11-27 08:22:43'),
(2, 12, 15, '2023-11-27 21:06:28'),
(2, 13, 5, '2023-11-27 21:08:36'),
(2, 14, 115, '2023-11-28 08:54:52'),
(2, 15, 15, '2023-11-28 18:10:40');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_compras`
--

CREATE TABLE `detalle_compras` (
  `folio_c` int(4) DEFAULT NULL,
  `id_p` int(4) NOT NULL,
  `cant` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalle_compras`
--

INSERT INTO `detalle_compras` (`folio_c`, `id_p`, `cant`) VALUES
(10, 2, 2),
(10, 13, 2),
(11, 2, 1),
(11, 11, 1),
(12, 2, 3),
(13, 2, 1),
(14, 2, 5),
(14, 60, 6),
(15, 2, 3);

--
-- Disparadores `detalle_compras`
--
DELIMITER $$
CREATE TRIGGER `aumenta` BEFORE INSERT ON `detalle_compras` FOR EACH ROW update producto set stock=stock+new.cant where id_p=new.id_p
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_ventas`
--

CREATE TABLE `detalle_ventas` (
  `folio_v` int(4) NOT NULL,
  `id_p` int(4) NOT NULL,
  `cant` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalle_ventas`
--

INSERT INTO `detalle_ventas` (`folio_v`, `id_p`, `cant`) VALUES
(181, 2, 2),
(181, 11, 2),
(182, 2, 2),
(183, 2, 2),
(183, 11, 2),
(184, 2, 2),
(185, 2, 1),
(186, 2, 2),
(187, 2, 2),
(188, 2, 2),
(189, 2, 1),
(190, 2, 1),
(191, 2, 3),
(192, 60, 2),
(193, 60, 2),
(194, 23, 2),
(194, 40, 1),
(195, 2, 5),
(196, 64, 2),
(196, 65, 1);

--
-- Disparadores `detalle_ventas`
--
DELIMITER $$
CREATE TRIGGER `disminuye` BEFORE INSERT ON `detalle_ventas` FOR EACH ROW update producto set stock=stock-new.cant where id_p=new.id_p
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_p` int(4) NOT NULL,
  `nombrep` varchar(60) NOT NULL,
  `precioc` double NOT NULL,
  `preciov` double NOT NULL,
  `cap` double NOT NULL,
  `stock` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_p`, `nombrep`, `precioc`, `preciov`, `cap`, `stock`) VALUES
(2, 'Resistol', 5, 10, 25, 48),
(11, 'Libreta c.chico', 32, 64, 120, 36),
(13, 'Hojas de color ', 0.5, 1.5, 60, 17),
(16, 'Cartulina', 0.5, 1.5, 20, 50),
(17, 'Hojas Blancas ', 0.5, 1, 10, 40),
(18, 'Papel Cascaron 1/2', 8, 10, 45, 60),
(19, 'Papel Cascaron 1/4', 4, 6, 40, 60),
(20, 'Plumas de color ', 5, 8, 10, 70),
(21, 'Plumas de gel ', 9, 12, 40, 60),
(22, 'Resistol de barra ', 8, 10, 50, 60),
(23, 'Caja de colores ', 55, 60, 50, 28),
(24, 'Goma', 5, 8, 20, 60),
(25, 'Regla de metal', 10, 13, 60, 70),
(26, 'Regla de plastico', 8, 10, 50, 75),
(27, 'Transportador', 8, 10, 45, 50),
(28, 'Pluma color negro', 5, 8, 60, 80),
(29, 'Pluma color rojo', 5, 8, 60, 80),
(30, 'Pluma color azul', 5, 8, 60, 85),
(31, 'Corrector', 8, 10, 60, 90),
(32, 'Pluma morada', 8, 10, 60, 70),
(33, 'Papel china ', 3, 5, 60, 85),
(34, 'Papel bond', 3, 5, 60, 50),
(35, 'Libreta c. Grande', 19.5, 22, 60, 90),
(36, 'Cartulina de color', 1.5, 3, 60, 85),
(37, 'Papel crepe', 0.5, 3, 60, 50),
(38, 'Papel picado', 0.5, 2, 60, 50),
(39, 'Diamantina', 1.5, 3, 60, 45),
(40, 'Tijeras', 2, 5, 55, 49),
(41, 'Juego geometrico', 45, 50, 60, 20),
(42, 'Mica', 15, 20, 60, 30),
(43, 'Hule cristal', 5, 8, 60, 30),
(44, 'Hoja cuadriculada', 0.5, 1.5, 60, 50),
(45, 'Solicitud de empleo', 0.5, 2, 40, 70),
(46, 'Escarcha color verde ', 5, 8, 60, 50),
(47, 'Escarcha color blanca', 5, 8, 60, 50),
(48, 'Escarcha navideña', 5, 8, 60, 50),
(49, 'papel contac ', 3, 5, 60, 50),
(50, 'Diurex', 5, 8, 60, 50),
(51, 'Foami normal', 1.5, 2, 60, 80),
(52, 'Foami diamantado', 6.5, 8, 60, 85),
(53, 'Post-its pequeños', 3, 15, 60, 55),
(54, 'Moños de regalo', 3, 5, 56, 30),
(55, 'Bolsas de regalo p', 9, 15, 56, 35),
(56, 'Bolsas de regalo m', 15, 20, 56, 35),
(57, 'Bolsas de regalo g', 25, 30, 56, 40),
(58, 'Stikers', 2, 5, 62, 70),
(59, 'Etiqueta de datos', 5, 10, 62, 70),
(60, 'Bloc de notas', 15, 20, 60, 52),
(61, 'Lapiz infinito', 16, 22, 65, 70),
(62, 'Pop-its', 30, 50, 60, 82),
(63, 'Lapiceras plastico', 20, 30, 60, 95),
(64, 'Lapiceras tela', 25, 35, 60, 93),
(65, 'Goma de figuras', 15, 20, 62, 49);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE `proveedores` (
  `id_prov` int(3) NOT NULL,
  `nombre_prov` varchar(60) NOT NULL,
  `tel` bigint(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`id_prov`, `nombre_prov`, `tel`) VALUES
(2, 'Carlos', 5521726454),
(3, 'Rebe', 5532417920),
(6, 'Oscar', 5578932457);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_u` int(4) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `ap` varchar(50) NOT NULL,
  `ussername` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `codigo` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_u`, `nombre`, `ap`, `ussername`, `password`, `tipo`, `codigo`) VALUES
(2, 'Lucia', 'Flores', 'Kiriko', 'BLACKPINK', 'Admin', 'B28ED'),
(3, 'Carlos', 'Luna', 'sol_08', '12345', 'Usuario', '00239'),
(4, 'Ernesto', 'Palomo', 'Ernesto_Palomo', 'holi', 'Admin', '19784'),
(5, 'Magda', 'Reyes', 'Magda1990', 'HOLA', 'Usuario', 'C4865');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id_u` int(4) NOT NULL,
  `folio_v` int(4) NOT NULL,
  `total` double NOT NULL,
  `fecha_hr` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id_u`, `folio_v`, `total`, `fecha_hr`) VALUES
(2, 181, 148, '2023-11-27 09:37:52'),
(2, 182, 20, '2023-11-27 09:47:58'),
(2, 183, 148, '2023-11-27 10:24:41'),
(2, 184, 20, '2023-11-28 07:19:14'),
(2, 185, 10, '2023-11-28 07:19:53'),
(2, 186, 20, '2023-11-28 07:20:47'),
(2, 187, 20, '2023-11-28 07:21:55'),
(2, 188, 20, '2023-11-28 07:22:50'),
(2, 189, 10, '2023-11-28 07:30:39'),
(2, 190, 10, '2023-11-28 07:39:19'),
(2, 191, 30, '2023-11-28 07:47:02'),
(2, 192, 40, '2023-11-28 08:49:24'),
(2, 193, 40, '2023-11-28 08:50:28'),
(2, 194, 145, '2023-11-28 09:14:22'),
(2, 195, 50, '2023-11-28 18:09:33'),
(2, 196, 90, '2023-11-29 11:25:13');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD KEY `id_p` (`id_p`);

--
-- Indices de la tabla `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`folio_c`),
  ADD KEY `id_prov` (`id_u`);

--
-- Indices de la tabla `detalle_compras`
--
ALTER TABLE `detalle_compras`
  ADD KEY `folio_c` (`folio_c`),
  ADD KEY `id_p` (`id_p`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_p`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD PRIMARY KEY (`id_prov`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_u`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`folio_v`),
  ADD KEY `id_u` (`id_u`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_p` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `compras`
--
ALTER TABLE `compras`
  MODIFY `folio_c` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_p` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;

--
-- AUTO_INCREMENT de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  MODIFY `id_prov` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_u` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `folio_v` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=197;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD CONSTRAINT `categoria_ibfk_1` FOREIGN KEY (`id_p`) REFERENCES `producto` (`id_p`);

--
-- Filtros para la tabla `compras`
--
ALTER TABLE `compras`
  ADD CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`id_u`) REFERENCES `proveedores` (`id_prov`);

--
-- Filtros para la tabla `detalle_compras`
--
ALTER TABLE `detalle_compras`
  ADD CONSTRAINT `detalle_compras_ibfk_1` FOREIGN KEY (`folio_c`) REFERENCES `compras` (`folio_c`),
  ADD CONSTRAINT `detalle_compras_ibfk_2` FOREIGN KEY (`id_p`) REFERENCES `producto` (`id_p`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`id_u`) REFERENCES `usuario` (`id_u`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
