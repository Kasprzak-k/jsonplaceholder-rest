# JSONPlaceholder REST Client

API REST desenvolvida em Spring Boot (Java 17) para consumo da API pública [JSONPlaceholder](https://jsonplaceholder.typicode.com/) utilizando `RestClient`.

##  Tecnologias

- Java 17
- Spring Boot 3.2.3
- Spring Web (`RestClient`)
- Maven

##  Como Executar

### Pré-requisitos
- Java 17+
- Maven

### Passos
1. Compile e execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

2. Teste o endpoint no navegador ou terminal:
   ```bash
   curl http://localhost:8080/events
   ```

##  Endpoints

- `GET /events` — Retorna os dados do usuário integrados via `EventService` usando `RestClient`.
