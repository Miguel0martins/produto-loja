# Produto Loja

Sistema simples de controle de estoque de produtos em Java, desenvolvido durante o curso
**"Java: aplicando a Orientação a Objetos"** da Alura.

O projeto evolui junto com o curso: a cada aula, novos conceitos são aplicados ao mesmo código.

## O que o projeto faz

- Representa um produto de loja com **nome** e **estoque**
- Permite **adicionar** e **remover** unidades do estoque
- Exibe a ficha do produto no console
- Valida as operações:
  - o estoque não pode ser definido como negativo
  - não é possível remover mais unidades do que existem no estoque
- Possui tipos específicos de produto, que herdam de `Produto`:
  - **Padaria:** dias restantes e data de fabricação
  - **Açougue:** tipo de carne, preço por kg e dias restantes
- Emite um **alerta de validade** para os produtos perecíveis (padaria e açougue)

## Conceitos aplicados

- Classes, atributos e métodos
- Criação e uso de objetos (`new`)
- Encapsulamento com `private`
- Getters e setters
- Uso da palavra-chave `this`
- Validação de dados dentro dos métodos
- Herança com `extends`
- Sobrescrita de métodos com `@Override` e uso do `super`
- Interfaces com `implements`
- Polimorfismo, tanto por herança quanto por interface

## Estrutura

```
produto-loja/
└── src/
    ├── Produto.java           # classe base: nome, estoque e métodos de estoque
    ├── ProdutoDePadaria.java  # herda de Produto e implementa Perecivel
    ├── ProdutoDeAcougue.java  # herda de Produto e implementa Perecivel
    ├── Perecivel.java         # interface com o alerta de validade
    └── Principal.java         # classe com o método main, que cria e testa os produtos
```

## Como executar

Na raiz do projeto:

```bash
javac src/*.java
java -cp src Principal
```

Também é possível abrir o projeto no IntelliJ IDEA e executar a classe `Principal`.

## Evolução do projeto

- [x] **Aula 1:** classe `Produto`, atributos, objetos e métodos
- [x] **Aula 2:** encapsulamento, getters e setters, `this` e validações
- [x] **Aula 3:** herança (`extends`), `@Override`, `super` e polimorfismo, com `ProdutoDePadaria` e `ProdutoDeAcougue`
- [x] **Aula 4:** interface `Perecivel` e polimorfismo com interfaces
- [x] **Aula 5:** desafio final do curso, no repositório [musicas-podcasts](https://github.com/Miguel0martins/musicas-podcasts)
## Autor

Miguel Martins — [GitHub](https://github.com/Miguel0martins)