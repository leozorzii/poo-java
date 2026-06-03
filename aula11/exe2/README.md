# Aula 11 — Exercício 2: Sistema de Pedidos de Restaurante

## Proposta

Praticar herança e polimorfismo modelando o cardápio de um restaurante, onde cada tipo de item possui sua própria regra de precificação.

## O que o exercício faz

Um pedido é montado adicionando itens do cardápio. Ao fechar a conta, o sistema percorre a lista e calcula o preço final de cada item com polimorfismo, exibindo o subtotal de cada um e o total geral.

## Conceitos praticados

- Classe abstrata (`ItemCardapio`) com método abstrato `calcularPrecoFinal()`
- Herança com duas subclasses concretas
- Polimorfismo via lista de `ItemCardapio`
- Regra de negócio simples: bebidas alcoólicas têm 10% de acréscimo

## Classes

| Classe | Responsabilidade |
|---|---|
| `ItemCardapio` | Classe abstrata com nome e preço base |
| `PratoPrincipal` | Retorna o preço base sem alteração; armazena tempo de preparo |
| `Bebida` | Aplica 10% de acréscimo se alcoólica |
| `Pedido` | Agrega itens e calcula o total na chamada de `fecharConta()` |
| `Main` | Cria um pedido com prato, bebida sem álcool e bebida alcoólica |
