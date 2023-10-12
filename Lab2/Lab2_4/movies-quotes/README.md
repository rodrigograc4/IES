# Lab 2.4 Notes

## Wrapping-up & Integrating Concepts

Agora, pretendemos criar um servidor web (API REST) que forneça citações aleatórias de filmes e séries a partir de uma API já existente.

Na aula prática, focaremos em aprimorar nossas habilidades em API REST, e para simplificar, adicionaremos as informações das citações e dos filmes de forma estática, sem a necessidade de incluir todas as citações ou programas de TV existentes.


**Funcionalidades da aplicação web:**

api/quote -> Retorna uma citação aleatória de um programa de TV ou filme aleatório.
api/shows -> Lista de todos os programas de TV disponíveis (para os quais existe alguma citação).
api/quotes?show=<show_id> -> Retorna uma citação aleatória para o programa de TV ou filme especificado (show_id é um identificador na faixa de 1-5).
Todas as respostas são apresentadas como dados JSON.

Para este projeto, precisamos de um controlador REST para cada um dos padrões de URL / funcionalidades. O ShowsController retorna todos os programas de TV existentes, o QuoteController exibe uma citação aleatória de um filme ou programa de TV, e, finalmente, o QuoteShowController retorna uma citação aleatória do show id que selecionamos (como um parâmetro GET).

Além disso, criei as classes Show e Quote que representam as entidades.
