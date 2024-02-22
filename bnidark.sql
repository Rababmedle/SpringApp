-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 22 jan. 2024 à 17:35
-- Version du serveur : 8.2.0
-- Version de PHP : 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `bnidark`
--

-- --------------------------------------------------------

--
-- Structure de la table `administrateurs`
--

DROP TABLE IF EXISTS `administrateurs`;
CREATE TABLE IF NOT EXISTS `administrateurs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `mot_de_passe` varchar(255) DEFAULT NULL,
  `nom_utilisateur` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `administrateurs`
--

INSERT INTO `administrateurs` (`id`, `email`, `mot_de_passe`, `nom_utilisateur`) VALUES
(1, 'lallazou@gmail.com', '12345', 'ADMIN'),
(2, 'admin1@gmail.com', 'motdepasse1', 'Admin1'),
(3, 'admin2@gmail.com', 'motdepasse2', 'Admin2'),
(4, 'admin3@gmail.com', 'motdepasse3', 'Admin3'),
(5, 'admin4@gmail.com', 'motdepasse4', 'Admin4'),
(6, 'admin5@gmail.com', 'motdepasse5', 'Admin5'),
(7, 'admin6@gmail.com', 'motdepasse6', 'Admin6'),
(8, 'admin7@gmail.com', 'motdepasse7', 'Admin7'),
(9, 'admin8@gmail.com', 'motdepasse8', 'Admin8'),
(10, 'admin9@gmail.com', 'motdepasse9', 'Admin9'),
(11, 'admin10@gmail.com', 'motdepasse10', 'Admin10');

-- --------------------------------------------------------

--
-- Structure de la table `employes`
--

DROP TABLE IF EXISTS `employes`;
CREATE TABLE IF NOT EXISTS `employes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `contact` varchar(20) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  `type_travail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `employes`
--

INSERT INTO `employes` (`id`, `contact`, `nom`, `prenom`, `image_url`, `type_travail`) VALUES
(3, '123456789', 'Employe1', 'Nom1', 'url_image1.jpg', 'Travail1'),
(4, '987654321', 'Employe2', 'Nom2', 'url_image2.jpg', 'Travail2'),
(5, '111111111', 'Employe3', 'Nom3', 'url_image3.jpg', 'Travail3'),
(6, '222222222', 'Employe4', 'Nom4', 'url_image4.jpg', 'Travail4'),
(7, '333333333', 'Employe5', 'Nom5', 'url_image5.jpg', 'Travail5'),
(8, '444444444', 'Employe6', 'Nom6', 'url_image6.jpg', 'Travail6'),
(9, '555555555', 'Employe7', 'Nom7', 'url_image7.jpg', 'Travail7'),
(10, '666666666', 'Employe8', 'Nom8', 'url_image8.jpg', 'Travail8'),
(11, '777777777', 'Employe9', 'Nom9', 'url_image9.jpg', 'Travail9'),
(12, '888888888', 'Employe10', 'Nom10', 'url_image10.jpg', 'Travail10');

-- --------------------------------------------------------

--
-- Structure de la table `societes_architecture`
--

DROP TABLE IF EXISTS `societes_architecture`;
CREATE TABLE IF NOT EXISTS `societes_architecture` (
  `id` int NOT NULL AUTO_INCREMENT,
  `adresse` varchar(255) DEFAULT NULL,
  `contact` varchar(20) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `societes_architecture`
--

INSERT INTO `societes_architecture` (`id`, `adresse`, `contact`, `nom`, `image_url`) VALUES
(1, 'Adresse11', '111111111', 'SocieteArch1', 'url_image11.jpg'),
(2, 'Adresse12', '222222222', 'SocieteArch2', 'url_image12.jpg'),
(3, 'Adresse13', '333333333', 'SocieteArch3', 'url_image13.jpg'),
(4, 'Adresse14', '444444444', 'SocieteArch4', 'url_image14.jpg'),
(5, 'Adresse15', '555555555', 'SocieteArch5', 'url_image15.jpg'),
(6, 'Adresse16', '666666666', 'SocieteArch6', 'url_image16.jpg'),
(7, 'Adresse17', '777777777', 'SocieteArch7', 'url_image17.jpg'),
(8, 'Adresse18', '888888888', 'SocieteArch8', 'url_image18.jpg'),
(9, 'Adresse19', '999999999', 'SocieteArch9', 'url_image19.jpg'),
(10, 'Adresse20', '1010101010', 'SocieteArch10', 'url_image20.jpg');

-- --------------------------------------------------------

--
-- Structure de la table `societes_materiaux`
--

DROP TABLE IF EXISTS `societes_materiaux`;
CREATE TABLE IF NOT EXISTS `societes_materiaux` (
  `id` int NOT NULL AUTO_INCREMENT,
  `adresse` varchar(255) DEFAULT NULL,
  `contact` varchar(20) DEFAULT NULL,
  `materiaux_disponibles` tinytext,
  `nom` varchar(255) DEFAULT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `societes_materiaux`
--

INSERT INTO `societes_materiaux` (`id`, `adresse`, `contact`, `materiaux_disponibles`, `nom`, `image_url`) VALUES
(1, 'Adresse1', '111111111', 'Matériaux1, Matériaux2', 'SocieteMateriaux1', 'url_image1.jpg'),
(2, 'Adresse2', '222222222', 'Matériaux3, Matériaux4', 'SocieteMateriaux2', 'url_image2.jpg'),
(3, 'Adresse3', '333333333', 'Matériaux5, Matériaux6', 'SocieteMateriaux3', 'url_image3.jpg'),
(4, 'Adresse4', '444444444', 'Matériaux7, Matériaux8', 'SocieteMateriaux4', 'url_image4.jpg'),
(5, 'Adresse5', '555555555', 'Matériaux9, Matériaux10', 'SocieteMateriaux5', 'url_image5.jpg'),
(6, 'Adresse6', '666666666', 'Matériaux11, Matériaux12', 'SocieteMateriaux6', 'url_image6.jpg'),
(7, 'Adresse7', '777777777', 'Matériaux13, Matériaux14', 'SocieteMateriaux7', 'url_image7.jpg'),
(8, 'Adresse8', '888888888', 'Matériaux15, Matériaux16', 'SocieteMateriaux8', 'url_image8.jpg'),
(9, 'Adresse9', '999999999', 'Matériaux17, Matériaux18', 'SocieteMateriaux9', 'url_image9.jpg'),
(10, 'Adresse10', '1010101010', 'Matériaux19, Matériaux20', 'SocieteMateriaux10', 'url_image10.jpg');

-- --------------------------------------------------------

--
-- Structure de la table `terrains_a_vendre`
--

DROP TABLE IF EXISTS `terrains_a_vendre`;
CREATE TABLE IF NOT EXISTS `terrains_a_vendre` (
  `id` int NOT NULL AUTO_INCREMENT,
  `adresse` varchar(255) DEFAULT NULL,
  `contact` varchar(20) DEFAULT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  `prix` decimal(10,2) DEFAULT NULL,
  `superficie` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `terrains_a_vendre`
--

INSERT INTO `terrains_a_vendre` (`id`, `adresse`, `contact`, `image_url`, `prix`, `superficie`) VALUES
(1, 'Adresse21', '111111111', 'url_image21.jpg', 60000.00, 120),
(2, 'Adresse22', '222222222', 'url_image22.jpg', 80000.00, 180),
(3, 'Adresse23', '333333333', 'url_image23.jpg', 90000.00, 200),
(4, 'Adresse24', '444444444', 'url_image24.jpg', 70000.00, 150),
(5, 'Adresse25', '555555555', 'url_image25.jpg', 95000.00, 220),
(6, 'Adresse26', '666666666', 'url_image26.jpg', 120000.00, 250),
(7, 'Adresse27', '777777777', 'url_image27.jpg', 85000.00, 190),
(8, 'Adresse28', '888888888', 'url_image28.jpg', 110000.00, 230),
(9, 'Adresse29', '999999999', 'url_image29.jpg', 75000.00, 160),
(10, 'Adresse30', '1010101010', 'url_image30.jpg', 100000.00, 210);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateurs`
--

DROP TABLE IF EXISTS `utilisateurs`;
CREATE TABLE IF NOT EXISTS `utilisateurs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `mot_de_passe` varchar(255) DEFAULT NULL,
  `nom_utilisateur` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `utilisateurs`
--

INSERT INTO `utilisateurs` (`id`, `email`, `mot_de_passe`, `nom_utilisateur`) VALUES
(1, 'utilisateur1@gmail.com', 'mdp_utilisateur1', 'Utilisateur1'),
(2, 'utilisateur2@gmail.com', 'mdp_utilisateur2', 'Utilisateur2'),
(3, 'utilisateur3@gmail.com', 'mdp_utilisateur3', 'Utilisateur3'),
(4, 'utilisateur4@gmail.com', 'mdp_utilisateur4', 'Utilisateur4'),
(5, 'utilisateur5@gmail.com', 'mdp_utilisateur5', 'Utilisateur5'),
(6, 'utilisateur6@gmail.com', 'mdp_utilisateur6', 'Utilisateur6'),
(7, 'utilisateur7@gmail.com', 'mdp_utilisateur7', 'Utilisateur7'),
(8, 'utilisateur8@gmail.com', 'mdp_utilisateur8', 'Utilisateur8'),
(9, 'utilisateur9@gmail.com', 'mdp_utilisateur9', 'Utilisateur9'),
(10, 'utilisateur10@gmail.com', 'mdp_utilisateur10', 'Utilisateur10');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
