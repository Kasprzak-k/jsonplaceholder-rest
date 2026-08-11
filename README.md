# JSONPlaceholder API - Client Spring Boot

Projeto Spring Boot configurado para integração e consumo de dados da API pública [JSONPlaceholder](https://jsonplaceholder.typicode.com/).

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Web** (`RestTemplate` / `WebClient`)
- **Lombok**
- **Maven**

## ⚙️ Configurações

A URL base da API está configurada em [application.properties](file:///c:/Users/cactu/Downloads/JSONPlaceholderAPI/src/main/resources/application.properties):

```properties
jsonplaceholder.api.url=https://jsonplaceholder.typicode.com
```

## 📂 Endpoints da API JSONPlaceholder disponíveis para integração

- `/posts` - 100 posts
- `/comments` - 500 comentários
- `/albums` - 100 álbuns
- `/photos` - 5000 fotos
- `/todos` - 200 afazeres
- `/users` - 10 usuários

## 🚀 Como Rodar

1. Certifique-se de ter o **Java 17** e o **Maven** instalados.
2. Compile o projeto:
   ```bash
   mvn clean install
   ```
3. Execute a aplicação após criar a classe principal `@SpringBootApplication`:
   ```bash
   mvn spring-boot:run
   ```
