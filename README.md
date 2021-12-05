# Desafio QA - Accenture

**Pré-requisitos:** Computador com acesso à internet, IDE (Eclipse ou IntelliJ IDEA), Maven, Java JDK 8.

**Cenário:** Cadastro bem sucedido

Essa é uma automação Front-End que visa o preenchimento de um formulário por completo e, por fim, valida o resultado de sucesso.

Este projeto utiliza *Selenium*, *Cucumber* e *JUnit*.

_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

### Configurando o Ambiente

Para rodar os testes sem problemas em qualquer IDE é necessário alguns procedimentos:

1. Importe as dependências do arquivo pom.xml com o Maven;

2. Instale os Plugins *Gherkin* e *Cucumber for Java*.

   2.1. Para IDE Intelijj é possível encontrar e baixar os plugins através do marketplace, no caminho files > Settings > Plugins;

   2.2. Para IDE Eclipse é necessário clicar em **help > Install New Software > Add >** É preciso criar um nome de sua preferência para o seu Plugin > **Digitar a URL 'https://cucumber.github.io/cucumber-eclipse/update-site' no Location Field > Clicar Ok > Seguir as instruções dos Prompts.**

### Rodando os Testes

Existem duas formas de rodar os testes, seguem elas:

1. Acesse a classe CadastroRunner localizada em `test/java/features/runner`  e executar como "JUnit test";
2. Acesse a feature do Cucumber localizada em `test/java/features/cadastro` e executar como "Cucumber feature".

