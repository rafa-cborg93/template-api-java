# template-api-java
Projeto base para utilizar em aplicações spring boot

## Estrutura de pastas

#### constants:
responsável por conter as constantes utilizadas na aplicação.
#### domain: 
será o núcleo de negócio da aplicação, nela serão inseridos os contextos da aplicação(validaroes, conversores e serviços), 
assim como requests e responses e DTOs utilizadas com os clientes.
#### controller: 
utilizada para chamadas rest vindas do client. Nela não será tratada nenhuma regra de negócio, deve apenas devolver o retorno dos services.
#### service: 
responsável por controlar as regras de negócio da aplicação.
#### entity:
responsável por conter as entidades e o mapeamento JPA
#### utils:
classe de utilitarios utilizados por toda a aplicação(validsdores e conversores).

