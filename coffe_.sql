-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 28-Set-2022 às 01:33
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `coffe_`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cli` int(10) NOT NULL,
  `nome_cli` varchar(30) DEFAULT NULL,
  `cpf_cli` varchar(30) DEFAULT NULL,
  `endereco_cli` varchar(50) DEFAULT NULL,
  `telefone_cli` varchar(30) DEFAULT NULL,
  `email_cli` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id_cli`, `nome_cli`, `cpf_cli`, `endereco_cli`, `telefone_cli`, `email_cli`) VALUES
(5, 'joao', '123789456', 'bangu', '21 962845137', 'joao@gmail.com'),
(6, 'matheus', '132465789', 'campo grande', '21 996788425', 'matheus@gmail.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id_fun` int(10) NOT NULL,
  `nome_fun` varchar(40) DEFAULT NULL,
  `cpf_fun` varchar(30) DEFAULT NULL,
  `endereco_fun` varchar(40) DEFAULT NULL,
  `telefone_fun` varchar(30) DEFAULT NULL,
  `email_fun` varchar(40) DEFAULT NULL,
  `login_fun` varchar(30) DEFAULT NULL,
  `senha_fun` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id_fun`, `nome_fun`, `cpf_fun`, `endereco_fun`, `telefone_fun`, `email_fun`, `login_fun`, `senha_fun`) VALUES
(3, 'felipe', '123456789', 'campo grande', '21 968541375', 'felipe@gmail.com', 'adm', '123'),
(5, 'zac', '156532789', 'new york', '21 965872436', 'zac@gmail.com', 'caixa', '456');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `id_prod` int(10) NOT NULL,
  `nome_prod` varchar(30) DEFAULT NULL,
  `descricao_prod` varchar(40) DEFAULT NULL,
  `quantidade_prod` varchar(60) DEFAULT NULL,
  `valor_prod` float DEFAULT NULL,
  `reserva` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id_prod`, `nome_prod`, `descricao_prod`, `quantidade_prod`, `valor_prod`, `reserva`) VALUES
(3, 'cafe', 'forte', '9', 30, 0),
(4, 'cha', 'gelado', '5kg', 15, 0);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cli`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id_fun`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id_prod`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cli` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_fun` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `id_prod` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
