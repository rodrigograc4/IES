# Lab 2.2 Notes

## What is Apache Tomcat?

O Apache Tomcat é um container de código aberto para Java servlets e páginas Java Server Page (JSP) que permite aos desenvolvedores criar aplicativos Java empresariais. Ele também atua como um servidor web HTTP onde o código Java pode ser executado.

Para executar o Apache Tomcat, basta executar um script na pasta "bin". Existem três maneiras de verificar se o servidor Tomcat está em execução: usando a ferramenta Curl, acessando a página padrão no navegador ou observando o log do servidor.

O Tomcat oferece exemplos de servlets que demonstram como lidar com solicitações HTTP. Esses servlets estendem a classe HttpServlet, que fornece uma estrutura para criar servlets da web. Os servlets devem substituir pelo menos um dos métodos, como doGet e doPost, para processar solicitações.

Além disso, o resumo aborda os métodos HTTP GET e POST e como eles diferem na solicitação de dados e no envio de dados para o servidor.

Por fim, a explicação menciona o uso do servidor Jetty incorporado como uma alternativa eficaz para desenvolver aplicativos da web sem a necessidade de implantá-los separadamente. Isso é feito configurando o Jetty no arquivo "pom.xml" e criando um servidor Jetty embutido que lida com solicitações HTTP, permitindo um desenvolvimento mais eficiente e flexível.

## Create Web Application

O processo começa com a criação de um projeto de aplicação web baseado no Maven, usando o arquétipo adequado para projetos web. O Maven é uma ferramenta de automação de compilação e gerenciamento de projetos em Java.

Após criar o projeto, é possível construí-lo executando o comando mvn install, que compila o código e verifica a presença de erros. O resultado da compilação é um arquivo .war, que é o aplicativo da web empacotado em formato de Arquivo da Web.

Para implantar o aplicativo .war em um servidor de aplicativos, a interface de gerenciamento do Tomcat pode ser usada para fazer upload e implantação. No entanto, essa abordagem tem algumas desvantagens, pois não está integrada ao ambiente de desenvolvimento (IDE) e é específica para o Tomcat.

Uma alternativa mais produtiva é usar o suporte de implantação integrado do IDE, como no Visual Studio Code, onde você pode gerenciar servidores Tomcat locais e facilmente depurar e executar seu aplicativo .war diretamente a partir do IDE.

Finalmente, no contexto de um exercício específico, o parâmetro "name" deve ser passado como parte da consulta na URL. Por exemplo, "http://localhost:8080/welcome?name='Rodrigo'". Isso é útil para passar informações para o aplicativo web e pode ser tratado no código usando exceções, como NullPointerException, caso os parâmetros não sejam preenchidos adequadamente.