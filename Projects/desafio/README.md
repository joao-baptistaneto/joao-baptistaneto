# Getting Started

###Configurações Necessárias Para Aplicação
Para criação da aplicação, foi usado o Java 18 e IntelliJ.

###Banco de dados
Para desenvolver a aplicação foi escolhido o banco MySQL Server. Necessário algumas especificações
para rodar corretamente a aplicação, passo-a-passo das instruções:
Necessário usuario **"user"** para acessar o database com a **senha "1123"**. Caso queira utilizar
outro usuário, sinta livre para isso. Só será necessario alterar o **"user"** e **"senha"** dentro do 
**"application.properties"** dentro do projeto na pasta "resources".

Na criação do database, necessário ser com nome de "cliente", segue instruções para criação:
> **create database cliente;**

Com o database criado, necessário criar a tabela com as informações, segue instruções para criação da tabela:
> **create table tb_customer_account (
id_customer int primary key, cpf_cnpj char(14), nm_customer varchar(50), is_active boolean, vl_total decimal(8, 2)
);**

Para popular o banco de dados, a aplicação faz automaticamente via **"data.sql"**.
Caso queria adicionar mais valores a aplicação para teste, alterar o **data.sql** dentro da pasta
"resources" dentro do projeto, seguindo os mesmos parametros de:
> **(2001, '65419516541', 'Heric Staniek', 1, 800)**



###Visualizando valores
Todas as informações serão disponibilizadas via terminal do Java, com uma breve descrição
das informações geradas.







### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.6/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.6/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Batch](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#howto-batch-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Creating a Batch Service](https://spring.io/guides/gs/batch-processing/)

