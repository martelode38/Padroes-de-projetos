# Padrões de Projeto | Trabalho N1

## Comparação dos Padrões de Persistência em nével conceitual((1º) - item a).

### Padrão DAO(Data Access Object)

O padrão DAO faz parte dos Core J2EE Patterns e tem o objetivo de separar o acesso ao banco de dados da lógica de negócio.
Ele cria uma camada intermediária que contém métodos para salvar, atualizar, buscar e excluir dados, evitando que a aplicação lide diretamente com SQL ou conexões.
O foco do DAO é técnico. Ele se preocupa em como os dados são acessados, não com as regras de negócio.

#### Características principais:

- Trabalha com entidades (como User).
- Executa operações CRUD.
- Centraliza o código de persistência.
- Ainda mantém acoplamento com o modelo relacional.

### Padrão Data Mapper

O Data Mapper, descrito por Martin Fowler, é usado para desacoplar o modelo de domínio da camada de persistência.
Ele atua como um tradutor entre objetos e dados armazenados, convertendo, por exemplo, um User em UserDTO e vice-versa.

O domínio não precisa saber como os dados são salvos, e o banco não precisa conhecer as regras de negócio.

#### Características principais:

- Faz a conversão entre camadas (entidade - DTO).
- Mantém o domínio puro e independente.
- Facilita a integração com diferentes bancos e APIs.

### Padrão Repository

O Repository, do Domain-Driven Design (DDD) de Eric Evans, representa uma coleção de objetos do domínio, como se fossem guardados em memória, mas de fato persistidos no banco.
Ele trabalha com agregados, que são conjuntos de entidades relacionadas, garantindo consistência e regras de negócio (chamadas invariantes).
Enquanto o DAO e o Mapper são mais técnicos, o Repository é voltado ao nível de domínio.

#### Características principais:

- Gerencia agregados (entidades e seus objetos relacionados).
- Garante regras de consistência.
- Abstrai completamente o acesso ao banco.
