# Consulta de feriados nacionais - API REST com Spring Boot

Este projeto é uma API REST desenvolvida em Java com Spring Boot, que permite consultar os feriados nacionais do Brasil. Os dados são obtidos da API externa BrasilAPI.  
O objetivo deste projeto é aplicar conceitos sólidos de backend, arquitetura MVC, testes automatizados e documentação com Swagger, servindo como portfólio técnico para minha transição de carreira para desenvolvimento de software.    

## Tecnologias e boas práticas aplicadas
- Java 17
- Spring Boot + Spring Web
- Arquitetura MVC (Model - View - Controller)
- API RESTful
- Consumo de API externa (BrasilAPI: https://brasilapi.com.br)
- Tratamento de exceções com `try/catch` e `ResponseEntity`
- Gradle como sistema de build e gerenciamento de dependências
- JUnit 5 e Mockito para os testes unitários
- Spring DevTools para hot reload no desenvolvimento
- Swagger para documentação técnica dos endpoints
- IntelliJ IDEA** como IDE principal
- Documentação clara no `README.md`
- Commitlint + Husky para padronização de commits (`Conventional Commits`)

## Funcionalidades da API
- Consulta de feriados por ano
- Consulta de feriados por ano e mês

## Planejamento/execução da codificação
- [x] Definição do escopo e tema do projeto
- [x] Documentação inicial do projeto (README)
- [x] Criação do projeto inicial via Spring Initializr (Java 17 + Spring Web)
- [x] Estruturação dos pacotes respeitando a arquitetura MVC (`model`, `service`, `controller`)
- [x] Teste execução bem-sucedida (até este ponto)
- [x] Implementação dos endpoints `/feriados/{ano}` e `/feriados/{ano}/{mes}`
- [x] Consumo da API externa (BrasilAPI)
- [x] Tratamento de erros e respostas
- [x] Execução de testes manuais em ambiente local + tratamento de erros
- [x] Escrita de testes unitários (JUnit + Mockito)
- [x] Integração do Swagger para documentação interativa
- [x] Atualização final do repositório com README e testes funcionando

## Estrutura do projeto
Abaixo está a organização dos arquivos **principais** da aplicação:

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
│   └── test/
│       └── java/
│           └── consultaferiados/
│               ├── FeriadosControllerTest.java
│               └── FeriadosServiceTest.java
├── build.gradle
├── commitlint.config.js
├── gradlew
├── README.md
├── settings.gradle

```

## Como executar o projeto

### Pré-requisitos
- Java 17+
- Gradle ou Maven
- IDE (ex: IntelliJ, VS Code, etc)
- Node.js (para rodar Husky)

### Passos
- Clone o repositório:
```git clone https://github.com/thayanaferreira/consulta-feriados-api ```
- Acesse o projeto:```cd consulta-feriados-api``` 
- Execute a aplicação: ```./gradlew bootRun```
  - ou, se estiver usando Maven: ```./mvnw spring-boot:run```
- Acesse no navegador: http://localhost:8080/feriados/{ano} ou http://localhost:8080/feriados/{ano}/{mes}

### Endpoints disponíveis
- GET /feriados/{ano}
- GET /feriados/{ano}/{mes}

### Exemplo de resposta
Requisição: http://localhost:8080/feriados/2025/03

```json
[
  {
    "date": "2025-03-04",
    "name": "Carnaval",
    "type": "national"
  }
]
```

## Swagger
Documentação disponível após rodar a aplicação: http://localhost:8080/swagger-ui/index.html

## Commitlint + Husky
Este projeto utiliza [**Commitlint**](https://www.conventionalcommits.org/pt-br/v1.0.0/) e [**Husky**](https://typicode.github.io/husky/) para garantir mensagens de commit padronizadas (seguindo o padrão de [**Conventional Commits**](https://www.conventionalcommits.org/pt-br/v1.0.0/)).  

### Porque usar
- Melhora a clareza no histórico de commits
- Facilita a integração com ferramentas de CI/CD
- Permite geração automática de changelogs

### Como funciona
Toda vez que um git commit for executado, o Husky aciona automaticamente o Commitlint para validar a mensagem do commit.
Se a mensagem não estiver no padrão, o commit será bloqueado com uma mensagem de erro.

### Exemplo de commit válido
```bash 
feat: adiciona endpoint para buscar feriados por mês
```

### Exemplo de commit inválido

```bash 
ajuste filtro api
```

### Como ativar os hooks do Husky após clonar o projeto
Após clonar o repositório, execute o comando a seguir para instalar as dependências e ativar os hooks do Husky:  

```bash 
npm install
```

(O script "prepare" no package.json ativa automaticamente os hooks do Husky ao rodar o npm install.)

### Requisitos do Husky
- Node.js instalado (a versão LTS é recomendada)

## Autora
  - 👩🏻‍💻 Thayana Ferreira
  - 🔗 Linkedin: https://www.linkedin.com/in/thayana-ferreira-da-silva-2655b861/
