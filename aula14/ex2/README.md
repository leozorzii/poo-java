# Aula 14 — Exercício 2: Frota com Rastreamento e Refrigeração

## Proposta

Praticar herança múltipla via interfaces em um sistema de frota de veículos, onde veículos especializados combinam capacidades de rastreamento e controle de temperatura.

## O que o exercício faz

A frota contém um caminhão padrão (somente rastreamento) e uma van refrigerada (rastreamento + controle de temperatura). A van valida a temperatura ao ser ajustada: valores fora do intervalo -20°C a 10°C lançam `TemperaturaCriticaException`.

## Conceitos praticados

- Classe abstrata (`Veiculo`) com placa, capacidade e método de viagem
- Duas interfaces com responsabilidades distintas de equipamento
- Implementação simultânea de múltiplas interfaces
- Exceção checked (`TemperaturaCriticaException`) para violação de temperatura
- Polimorfismo: caminhão e van compartilham comportamento de `Veiculo`

## Classes e Interfaces

| Tipo | Nome | Responsabilidade |
|---|---|---|
| Classe abstrata | `Veiculo` | Base com placa, capacidade e método de iniciar jornada |
| Interface | `Rastreador` | Contrato para localização em tempo real |
| Interface | `Refrigerado` | Contrato para ajuste de temperatura |
| Classe concreta | `CaminhaoPadrao` | Implementa `Rastreador` |
| Classe concreta | `VanRefrigerada` | Implementa `Rastreador` e `Refrigerado`; temperatura entre -20°C e 10°C |
| Exceção | `TemperaturaCriticaException` | Lançada quando temperatura está fora do intervalo permitido |
| Classe | `Main` | Testa ajuste de temperatura válido e inválido na van |
