# Buscador de DDDs - API REST com Spring Boot

Este projeto é uma API REST construída em Java com Spring Boot que permite consultar informações sobre DDDs (Discagem Direta à Distância) no Brasil. Ele consome dados da [BrasilAPI](https://brasilapi.com.br) e retorna o estado e as cidades correspondentes ao DDD informado.

---

## Funcionalidades:

- Consulta de DDDs válidos
- Retorno com estado e lista de cidades
- Consumo de API externa pública (BrasilAPI): https://brasilapi.com.br/api/ddd/v1/{ddd}
- Arquitetura baseada em MVC
- Testes unitários com JUnit e Mockito

---

## Tecnologias utilizadas:

- Java 17
- Spring Boot
- Spring Web
- REST APIs
- BrasilAPI
- JUnit 5 (para os testes unitários)
- Mockito (para os testes unitários)
- IntelliJ IDEA 

---

## Estrutura do projeto:

```bash

src/
├── main/
│   ├── java/
│   │   └── com/thayanaferreira/dddinfo/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── service/
│   │       └── AplicacaoBuscadorDddApi.java
│   └── resources/
│       └── application.properties
├── test/
│   └── java/
│       └── com/thayanaferreira/dddinfo/
│           └── service/
│               └── DddServiceTest.java
```

## Como executar o projeto:
### Pré-requisitos
  - Java 17+
  - Maven ou Gradle
  - IDE (ex: IntelliJ, VSCode)

## Passos:

  - Clone o repositório:
```bash git clone https://github.com/thayanaferreira/buscador-ddd-api.git ```  
  - Acesse o projeto:```bash cd buscador-ddd-api```  
  - Execute a aplicação: ```bash ./gradlew bootRun```
    - ou, se estiver usando Maven: ```bash ./mvnw spring-boot:run```
  - Acesse no navegador: http://localhost:8080/ddd/{codigo}  

### Exemplo de resposta:
Requisição: http://localhost:8080/ddd/61
```json
{
  "state": "DF",
  "cities": [
    "Águas Claras",
    "Brasília",
    "Ceilândia",
    "Taguatinga"
  ]
}
```

### Autora:
  - 👩🏻‍💻 Thayana Ferreira
  - 🔗 https://www.linkedin.com/in/thayana-ferreira-da-silva-2655b861/