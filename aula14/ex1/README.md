# Aula 14 — Exercício 1: Avaliação de Produtos com Nota

## Proposta

Praticar o uso combinado de herança, interface e exceção customizada em um sistema de avaliação de produtos, diferenciando produtos físicos (com frete) de produtos digitais (sem frete).

## O que o exercício faz

O sistema permite adicionar produtos a uma lista, aplicar descontos e registrar avaliações com nota de 0 a 10. Produtos que implementam `Avaliavel` podem receber notas; notas fora do intervalo lançam `NotaInvalidaException`. A exibição mostra preço, frete e avaliação de cada produto.

## Conceitos praticados

- Classe abstrata (`Produto`) com método abstrato de cálculo de frete
- Interface (`Avaliavel`) como contrato para produtos que aceitam nota
- Exceção checked (`NotaInvalidaException`) ao registrar nota inválida
- `IllegalArgumentException` para desconto fora do intervalo permitido
- Menu interativo com `Scanner` para entrada do usuário

## Classes e Interfaces

| Tipo | Nome | Responsabilidade |
|---|---|---|
| Classe abstrata | `Produto` | Base com nome, preço e método abstrato `calcularFrete()` |
| Interface | `Avaliavel` | Contrato para `avaliar(double nota)` |
| Classe concreta | `ProdutoFisico` | Frete = 10% do preço; implementa `Avaliavel` |
| Classe concreta | `ProdutoDigital` | Frete = 0; implementa `Avaliavel` |
| Exceção | `NotaInvalidaException` | Lançada para notas fora do intervalo 0–10 |
| Classe | `Main` | Menu para adicionar produtos e registrar avaliações |
