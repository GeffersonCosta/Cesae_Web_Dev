--criar base de dados
create database `joaoWM_aula01`

--criar tabela

create table tabela(
   id int AUTO_INCREMENT PRIMARY KEY,
  nome varchar(300)
)

-- para usar a base de dados é preciso estabelecer um foco, entao usamos o "use e o nome da tabela"

use joaoWM_aula01

-- detelar tabela 

DROP TABLE tabela

-- alterar tabela
alter table tabela modify column nome varchar(100) not null;