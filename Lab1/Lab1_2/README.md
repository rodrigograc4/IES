# Lab 1.2 Notes

## What is POM?

O POM (Project Object Model) é a unidade fundamental de trabalho no Maven. É um arquivo XML que contém informações sobre o projeto e detalhes de configuração usados pelo Maven para construir o projeto. Ele inclui valores padrão, como diretórios de código-fonte e compilação. O Maven procura o POM no diretório atual, lê suas informações de configuração e executa as tarefas correspondentes, como gerenciamento de dependências e compilação. O POM permite especificar dependências, plugins, perfis de construção e outras informações do projeto, como a versão e descrição. É uma parte essencial do processo de construção no Maven.

Os requisitos mínimos para um POM são os seguintes:

project (projeto)
modelVersion (versão do modelo) - deve ser definido como 4.0.0
groupId (ID do grupo) - o ID do grupo do projeto.
artifactId (ID do artefato) - o ID do artefato (projeto).
version (versão) - a versão do artefato sob o grupo especificado.
Outros elementos do POM incluem:

dependências
desenvolvedores e contribuintes
listas de plugins (incluindo relatórios)
execuções de plugins com IDs correspondentes
configuração de plugins
recursos

## API Request

Comece analisando a estrutura das solicitações e das respostas da API (por exemplo, verifique a previsão meteorológica agregada de 5 dias para um local). Você pode usar qualquer cliente HTTP, como o navegador ou a ferramenta curl. Por exemplo, para obter uma previsão de 5 dias para Aveiro (que possui o ID interno 1010500):

curl http://api.ipma.pt/open-data/forecast/meteorology/cities/daily/1010500.json | json_pp

Este comando imprimirá as informações JSON disponíveis nessa URL.
