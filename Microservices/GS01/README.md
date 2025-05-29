Para conectar com o banco: 

docker run -d \
--name mysql \
--rm \
-e MYSQL_ROOT_PASSWORD=root_pwd \
-e MYSQL_USER=new_user \
-e MYSQL_PASSWORD=my_pwd \
-p 3306:3306 \
mysql

dps docker ps na linha de baixo

E conectou

------------------------------------

mvn clean package
----------------------------------------------------

Edite o arquivo application.properties para definir os parâmetros de conexão:

springdoc.swagger-ui.path=/ springdoc.swagger-ui.disable-swagger-default-url=true

spring.datasource.url=jdbc:h2:mem:pacientesdb spring.datasource.driverClassName=org.h2.Driver spring.datasource.username=sa spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update spring.jpa.show-sql=true

mvn spring-boot:run


Entrar no dbeaver e criar um mysql.
Vai em prorpiedades do driver
Download

![image](https://github.com/user-attachments/assets/a2863ab8-aafe-4dc9-926c-9126978a7428)

AllowPublicKey coloca true

root -> nome usuario

root_pwd -> senha

Dps testa, vai dar certo e conclue

---------------------------------------------------

Passos para começar o arquivo:

![image](https://github.com/user-attachments/assets/cf8c49db-b8b3-44c5-88ff-27da4fb990be)


Dependencias:
Spring Web e Spring Boot dev tools




