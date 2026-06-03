# Aula 11 — Exercício 1: Reserva de Assentos de Voo

## Proposta

Praticar exceções customizadas em um sistema simples de reserva de assentos de avião, diferenciando entre erros de negócio (assento ocupado) e erros de argumento inválido.

## O que o exercício faz

Um objeto `Voo` gerencia um array de booleanos representando 100 assentos. Ao reservar um assento, o sistema verifica se o número é válido e se o assento está disponível, lançando exceções específicas para cada caso.

## Conceitos praticados

- Exceção customizada checked (`AssentoOcupadoException`)
- Diferença entre `Exception` (checked) e `IllegalArgumentException` (unchecked)
- Array de booleanos para controle de estado
- `throws` na assinatura do método

## Classes

| Classe | Responsabilidade |
|---|---|
| `Voo` | Armazena número do voo, destino e estado dos 100 assentos |
| `AssentoOcupadoException` | Lançada quando o assento solicitado já está reservado |
| `MainVoo` | Cria um voo e testa a reserva com número inválido (> 100) |
