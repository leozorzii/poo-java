# Aula 12 — Exercício 2: Conta Bancária com Interfaces e Exceção

## Proposta

Praticar herança, múltiplas interfaces e exceção checked em um sistema de conta bancária, onde a conta corrente possui regras específicas de saque, tributação e transferência via Pix.

## O que o exercício faz

Uma `ContaCorrente` herda de `ContaBancaria` e implementa duas interfaces: `Tributavel` (cálculo de imposto) e `TransacaoOnline` (Pix). O saque cobra taxa fixa de R$ 5,00 e lança exceção se o saldo for insuficiente. O sistema testa depósito válido, saque com saldo insuficiente, depósito inválido, Pix e cálculo de imposto.

## Conceitos praticados

- Classe abstrata (`ContaBancaria`) com método abstrato `sacar()`
- Duas interfaces com responsabilidades distintas de negócio
- Exceção checked (`SaldoInsuficienteException`) na assinatura de `sacar()`
- `IllegalArgumentException` para depósito com valor negativo
- Encapsulamento com `protected debitar()` na classe base

## Classes e Interfaces

| Tipo | Nome | Responsabilidade |
|---|---|---|
| Classe abstrata | `ContaBancaria` | Base com titular, saldo, `depositar()` e `sacar()` abstrato |
| Interface | `Tributavel` | Contrato para `calcularImpostos()` |
| Interface | `TransacaoOnline` | Contrato para `fazerPix()` |
| Classe concreta | `ContaCorrente` | Taxa de R$ 5 no saque; imposto de 1% sobre saldo; suporte a Pix |
| Exceção | `SaldoInsuficienteException` | Lançada quando saldo + taxa é insuficiente para o saque |
| Classe | `Main` | Testa todas as operações e tratamentos de erro |
