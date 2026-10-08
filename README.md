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

## Conceitos aplicados

- Classes, atributos e métodos
- Criação e uso de objetos (`new`)
- Encapsulamento com `private`
- Getters e setters
- Uso da palavra-chave `this`
- Validação de dados dentro dos métodos

## Estrutura

```
produto-loja/
└── src/
    ├── Produto.java     # classe com atributos, getters, setters e métodos de estoque
    └── Principal.java   # classe com o método main, que cria e testa o produto
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
- [ ] **Aula 3 em diante:** a ser atualizado conforme o curso avança

## Autor

Miguel Martins — [GitHub](https://github.com/Miguel0martins)