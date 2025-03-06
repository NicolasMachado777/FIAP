https://github.com/acnaweb/study-apir

Git dele

-------------------------------------------
Para achar um erro, vamos no log, de baixo pra cima, que uma hr vai ter o nosso pacote e lá vai ter o erro e vamo saber o erro na linha a cima
Toda a vez que colocamos @RestController...
Quando faço o @Service o spinrg framework pega, instancia a classe e deixa em memoria   
@Autowired pega os atributos que precisa fazer ingestão
para fazer o live server, vai na no spring initializer, pega a dependencia devtools, pega a depence no code, e coloca em dependences no pom.xml
Open APi
Swagger -> software que implementa open api

pegar dependencia para a open api no acenaweb ecommerce

<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>${springdoc-openapi.version}</version>
		</dependency>

mas precisa de uma versao, que fica em proprieties, que no caso e 2.5.0

tiro ${springdoc-openapi.version} e coloco 2.5.0
