# Consulta de feriados nacionais - API REST com Spring Boot

Este projeto é uma API REST construída em Java com Spring Boot, que permite consultar feriados nacionais do Brasil. As informações são obtidas da API externa [BrasilAPI](https://brasilapi.com.br/docs#tag/Feriados-Nacionais).  

O objetivo deste projeto é demonstrar a aplicação das seguintes tecnologias e boas práticas de desenvolvimento:
- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Arquitetura MVC (Model - View - Controller)**
- **API RESTful**
- **Consumo de API externa BrasilAPI: https://brasilapi.com.br**
- **Tratamento de exceções com `try/catch` e `ResponseEntity`**
- **Gradle** como sistema de build e gerenciamento de dependências
- **JUnit 5 e Mockito** para os testes unitários
- **Spring DevTools** para hot reload no desenvolvimento
- **IntelliJ IDEA** como IDE principal
- **Documentação para stakeholders no `README.md`**
- **Swagger** para documentação técnica da API


## Funcionalidades da API:

- Consulta de feriados por ano
- Consulta de feriados por ano e mês

## Planejamento/execução da codificação:
- [x] Definição do tema e objetivo do projeto
- [x] Documentação inicial da API no README
- [x] Criação do projeto com Spring Initializr (Java 17 + Spring Web)
- [x] Criação da estrutura de pacotes em MVC (`model`, `service`, `controller`)
- [ ] Consumo da API externa BrasilAPI
- [ ] Implementação do endpoint REST `/ddd/{codigo}` ????
    - [ ] Model
    - [ ] Service
    - [ ] Controller
- [ ] Testes com requisições reais e tratamento de erros
- [ ] Execução bem-sucedida com Spring Boot
- [ ] Escrita de testes unitários (JUnit + Mockito)
- [ ] Documentação da API via Swagger
- [ ] Deploy em ambiente de teste (ex: Render, Railway ou localhost)
- [ ] Atualização final do repositório no GitHub com README finalizado

## Estrutura do projeto:

```bash
//colocar estrutura no final! ????
```

## Como executar o projeto:
### Pré-requisitos
  - Java 17+
  - Maven ou Gradle
  - IDE (ex: IntelliJ, VSCode)

### Passos:

  - Clone o repositório:
```bash git clone https://github.com/thayanaferreira/buscador-ddd-api.git ```  ????
  - Acesse o projeto:```bash cd buscador-ddd-api```  
  - Execute a aplicação: ```bash ./gradlew bootRun```
    - ou, se estiver usando Maven: ```bash ./mvnw spring-boot:run```
  - Acesse no navegador: ????

### Exemplo de resposta:
Requisição: http://localhost:8080/ddd/61 ????
```json
????

```

## Autora:
  - 👩🏻‍💻 Thayana Ferreira
  - 🔗 https://www.linkedin.com/in/thayana-ferreira-da-silva-2655b861/
