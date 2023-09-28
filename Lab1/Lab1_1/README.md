# Lab 1.1 Notes

## What is Maven?

O Maven é uma ferramenta de construção amplamente utilizada em projetos profissionais para automatizar tarefas de desenvolvimento, como compilação, gerenciamento de dependências, empacotamento e implantação de aplicativos Java. Ele coordena essas tarefas complexas em projetos de médio a grande porte, economizando tempo e facilitando o desenvolvimento. 

## Creating a Maven Project
``` bash
$ mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app - DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

- archetype - modelo ou padrão de como tudo é feito.
- groupId - identificador único de cada projeto, este deve seguir as "Java's package name rules"
- artifactId - nome do arquivo jar que será gerado após a compilação 
- archetypeArtifactId - modelo ou padrão de como tudo é feito.


## Run the Project

``` bash
java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App
```