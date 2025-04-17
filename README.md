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
- **Documentação de qualidade (no `README.md`)**
- **Swagger** para documentação técnica da API

## Funcionalidades da API:

- Consulta de feriados por ano
- Consulta de feriados por ano e mês

## Planejamento/execução da codificação:
- [x] Definição do tema e objetivo do projeto
- [x] Documentação inicial da API no README
- [x] Criação do projeto com Spring Initializr (Java 17 + Spring Web)
- [x] Criação da estrutura de pacotes em MVC (`model`, `service`, `controller`)
- [x] Consumo da API externa BrasilAPI
- [x] Implementação dos endpoints REST `/feriados/ano` e `/feriados/ano/mes`
    - [x] Model
    - [x] Service
    - [x] Controller
- [x] Execução bem-sucedida com Spring Boot
- [x] Teste manual em ambiente local e tratamento de erros
- [ ] Escrita de testes unitários (JUnit + Mockito)
- [ ] Documentação da API via Swagger
- [ ] Atualização final do repositório no GitHub com README finalizado

## Estrutura do projeto:
Abaixo está a organização dos arquivos principais da aplicação:

```bash
consulta-feriados-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── consultaferiados/
│   │   │       ├── controller/
│   │   │       │   └── FeriadosController.java
│   │   │       ├── model/
│   │   │       │   └── Feriados.java
│   │   │       ├── service/
│   │   │       │   └── FeriadosService.java
│   │   │       └── FeriadosApiApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   └── consultaferiados.FeriadosServiceTest/
│       └── java/
│           └── consultaferiados/
│               └── AplicacaoTests.java
├── README.md
├── build.gradle
├── settings.gradle
```

## Como executar o projeto:

#### Pré-requisitos
  - Java 17+
  - Maven ou Gradle
  - IDE (ex: IntelliJ, VSCode)

#### Passos:

  - Clone o repositório:
```git clone https://github.com/thayanaferreira/consulta-feriados-api ```
  - Acesse o projeto:```cd consulta-feriados-api``` 
  - Execute a aplicação: ```./gradlew bootRun```
    - ou, se estiver usando Maven: ```./mvnw spring-boot:run```
  - Acesse no navegador: http://localhost:8080/feriados/{ano} ou http://localhost:8080/feriados/{ano}/{mes}

#### Exemplo de resposta:
Requisição: http://localhost:8080/feriados/2025
```json
[{"date":"2025-03-04","name":"Carnaval","type":"national"}]
```

### Commitlint + Husky
Este projeto utiliza [**Commitlint**](https://www.conventionalcommits.org/pt-br/v1.0.0/) e [**Husky**](https://typicode.github.io/husky/) para garantir que as mensagens de commit sigam o padrão [**Conventional Commits**](https://www.conventionalcommits.org/pt-br/v1.0.0/).  

#### Por que uso isso:

- Garante mensagens de commit claras e padronizadas
- Facilita a leitura do histórico de mudanças
- Permite geração automática de changelogs no futuro
- Ajuda na integração com ferramentas de CI/CD

#### Como funciona:
Toda vez que um git commit for executado, o Husky aciona automaticamente o Commitlint para validar a mensagem do commit.
Se a mensagem não estiver no padrão, o commit será bloqueado com uma mensagem de erro.

#### Exemplo de commit válido:  
```bash 
feat: adiciona endpoint para buscar feriados por mês
```

#### Exemplo de commit inválido:  

```bash 
ajuste filtro api
```

#### Como ativar os hooks do Husky após clonar o projeto:
Após clonar o repositório, rode os seguintes comandos para instalar as dependências e ativar os hooks do Husky:  

```bash 
npm install
```

O script "prepare" no package.json ativa automaticamente os hooks do Husky ao rodar o npm install.

#### Requisitos:
- Node.js instalado (a versão LTS é recomendada)

## Autora:
  - 👩🏻‍💻 Thayana Ferreira
  - 🔗 https://www.linkedin.com/in/thayana-ferreira-da-silva-2655b861/
