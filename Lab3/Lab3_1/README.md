# Lab 3.1 Notes

## Accessing databases in SpringBoot

**JPA**, ou **Java Persistence API**, é o padrão Java ORM (Object-Relational Mapping) para armazenar, acessar e gerenciar objetos Java em um banco de dados relacional.

Existem vários frameworks que implementam a especificação JPA, como o framework Hibernate. Devido à história interligada, Hibernate e JPA são frequentemente confundidos. No entanto, assim como a especificação Java Servlet, o JPA gerou muitas ferramentas e frameworks compatíveis; o Hibernate é apenas um deles. Hibernate é uma biblioteca ORM para Java.

O Spring Data usa e aprimora o JPA. Ao utilizar o Spring Data, seu código Java é independente da implementação específica do banco de dados.



## Questions

### The “UserController” class gets an instance of “userRepository” through its constructor; how is this new repository instantiated?

A instância do userRepository é instanciada pela anotação @Repository. Essa anotação é usada para indicar que a classe fornece o mecanismo para armazenamento, recuperação, busca, atualização e exclusão de objetos.


### List the methods invoked in the “userRepository” object by the “UserController”. Where are these methods defined?

Os métodos invocados no objeto userRepository são findAll(), findById(), save() e delete().

findAll() - retorna todas as instâncias do tipo.
findById() - retorna a entidade com o id fornecido.
save() - salva uma entidade fornecida.
delete() - deleta a entidade fornecida.
Esses métodos são definidos na interface CrudRepository, a qual é estendida pela interface UserRepository.


### Where is the data being saved?

Os dados estão sendo salvos na interface UserRepository, a qual estende a interface CrudRepository.


### Where is the rule for the “not empty” email address defined?

The rule for the "not empty" email address is defined in the User class.

´´´java
  @NotBlank(message = "Email is mandatory")
    private String email;
´´´