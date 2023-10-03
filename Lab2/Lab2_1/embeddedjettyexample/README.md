# Lab 1.1 Notes

## What is Java Servlet?

O Java Servlet representa a espinha dorsal das especificações web no ambiente Java Enterprise. Um Servlet é, essencialmente, uma classe Java que opera no servidor, encarregando-se das solicitações dos clientes, processando-as e fornecendo respostas apropriadas.

Para que um Servlet seja operacional, ele deve ser implantado em um Container Servlet (que suporta multithreading). Esses containers são responsáveis por lidar com várias solicitações simultaneamente, garantindo a eficiência do processamento.

É importante destacar que o Servlet é uma interface genérica, enquanto o HttpServlet é uma extensão especializada dessa interface e é, de longe, o tipo mais comum de Servlets utilizado.

Quando uma aplicação em execução em um servidor web recebe uma solicitação, o servidor encaminha essa solicitação para o Container Servlet correspondente, que, por sua vez, direciona a solicitação para o Servlet de destino, permitindo o processamento adequado.

## More info about Java Servlet

Aqui está um link com um bom artigo sobre o Java Servlet:

https://medium.com/edureka/java-servlets-62f583d69c7e