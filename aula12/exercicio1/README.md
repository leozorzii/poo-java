# Aula 12 — Exercício 1: SmartWatch com Múltiplas Interfaces

## Proposta

Praticar herança múltipla via interfaces em Java, modelando um dispositivo inteligente que combina capacidades de monitoramento de saúde e conectividade Bluetooth.

## O que o exercício faz

Um `SmartWatch` herda de uma classe abstrata `Dispositivo` e implementa simultaneamente duas interfaces: `Monitoramento` (medir batimentos) e `Conectividade` (conectar Bluetooth). O exercício demonstra que Java permite implementar múltiplas interfaces mesmo com herança simples de classe.

## Conceitos praticados

- Classe abstrata (`Dispositivo`) com método abstrato `ligar()`
- Duas interfaces independentes com responsabilidades distintas
- Implementação simultânea de múltiplas interfaces em uma única classe
- Herança de classe + implementação de interfaces na mesma declaração

## Classes e Interfaces

| Tipo | Nome | Responsabilidade |
|---|---|---|
| Classe abstrata | `Dispositivo` | Base com atributo `marca` e método abstrato `ligar()` |
| Interface | `Monitoramento` | Contrato para `medirBatimentos()` |
| Interface | `Conectividade` | Contrato para `conectarBluetooth()` |
| Classe concreta | `SmartWatch` | Herda `Dispositivo`, implementa `Monitoramento` e `Conectividade` |
| Classe | `Main` | Instancia o SmartWatch e demonstra todas as funcionalidades |
