# Teste de Conhecimento

Nesse teste será testado o conhecimento nos seguintes topicos:

- Utilizacao de recurso de lambda do Java 8
- Principios basicos do OO como o polimorfismo
- Instalacao de banco de dados mysql
- Manipulação do banco de dados mysql com criação de tabela
- Configuração do banco de dados mysql na aplicação
- Utilizacao de Maven
- Configuracao do JPA e Hibernate
- Utilizando o JPA e Hibernate
- Conceitos basicos do Spring Boot e utilização de serviços REST

**Questão 1:** Na classe "FiltroJava8.java" que esta no pacote "br.com.escolinha.testeone.java8" implementar o metodo "getCarrosComMenosDe50Anos" utilizando o filtro do java 8 (a explicação da implementação esta em um comentario na classe).

**Questão 2:** Na classe "ContaPolimorfismo.java" que esta no pacote "br.com.escolinha.testeone.polimorfismo" implementar o polimorfismo para atender os diferentes tipos de saque (na classe contem um comentario com a explicação)

**Questão 3:** Instalar um banco MySql localmente e criar a tabela com os seguitnes requisitos:

		   Nome: CARRO_TB
		   COLUNAS:
		   - MODELO       VARCHAR
		   - ANO          NUMBER
		   - MARCA        VARCHAR
		   - QTD_PORTAS   NUMBER

**Questao 4:** Realizar 5 inserts na tabela com registros diferentes

**Questao 5:** Configure o banco mysql na aplicação, para isso será necessario mapear as dependencias no arquivo .pom (drive mysql, hibernate, jpa, dentre outros)

**Questao 6:** Na classe "CarroEntity" que esta no pacote "br.com.escolinha.testeone.entity" implemente os getters e setters e realize o mapeamento JPA de acordo com a tabela "CARRO_TB" criada.

**Questao 7:** Utilizando JPA+Hibernate realize a implementação do DAO "CarroDao" que esta no pacote "br.com.escolinha.testeone.dao"

**Questao 8:** Realize a implementacao do metodo "get" da classe "CarroController" que esta no pacote "br.com.escolinha.testeone.controller" para listar os registros do banco (Para testar suba a aplicação SpringBoot e chame o serviço REST referente ao metodo).

**Questao 9:** Realize a implementacao do metodo "post" da classe "CarroController" que esta no pacote "br.com.escolinha.testeone.controller" para salvar o registro do banco (Para testar suba a aplicação SpringBoot e chame o serviço REST referente ao metodo).

**Questao 10:** Com a aplicação startada chame o serviço http://localhost:8081/carros/listar e copie e cole o retorno do serviço para o nosso email.
