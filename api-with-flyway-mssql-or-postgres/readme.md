## Exemplo de api compatível com mais de um banco usando flyway (postgres ou sqlserver)

A aplicação está com as duas dependências no `pom.xml`
```
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>com.microsoft.sqlserver</groupId>
    <artifactId>mssql-jdbc</artifactId>
    <scope>runtime</scope>
</dependency>
```

A configuração do flyway é definida no `application.properties` atribuindo o local das migrations:
```
spring.flyway.locations=classpath:db/migration/${DATASOURCE}
```

Subindo api com postgres
```
docker-compose -f docker-compose-postgres.yml up -d
```

Subindo api com sqlserver
```
docker-compose -f docker-compose-mssql.yml up -d
```
