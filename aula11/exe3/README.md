# Aula 11 — Exercício 3: Cálculo de Impostos com Interface

## Proposta

Praticar o uso de interfaces como contrato de comportamento, separando produtos tributáveis de produtos isentos e calculando o total de impostos de uma lista mista.

## O que o exercício faz

Uma lista de produtos de diferentes tipos é percorrida. Para cada produto que implementa `Tributavel`, o imposto é calculado e somado ao total. Produtos sem a interface são marcados como isentos.

## Conceitos praticados

- Interface (`Tributavel`) definindo contrato de `calcularImposto()`
- Classe abstrata (`Produto`) com `aplicarDesconto()` validado
- Herança e implementação de interface simultâneas
- Verificação com `instanceof` e cast para interface
- `IllegalArgumentException` para desconto fora do intervalo 0–50%

## Classes

| Classe | Responsabilidade |
|---|---|
| `Tributavel` | Interface com método `calcularImposto()` |
| `Produto` | Classe abstrata com descrição, valor e `aplicarDesconto()` |
| `Eletronico` | Imposto de 15% sobre o valor atual |
| `Vestuario` | Imposto de 5% sobre o valor atual |
| `Alimento` | Não implementa `Tributavel`; isento de imposto |
| `Main` | Monta a lista, aplica desconto em um item e calcula total de impostos |
