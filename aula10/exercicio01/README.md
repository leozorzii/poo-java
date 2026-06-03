# Aula 10 — Exercício 01: Hierarquia de Naves Espaciais

## Proposta

Praticar herança, polimorfismo e tratamento de exceções em um sistema de frota de naves espaciais. Cada tipo de nave possui uma fórmula de consumo de combustível diferente e pode lançar exceções específicas ao tentar realizar viagens.

## O que o exercício faz

Uma frota composta por diferentes tipos de naves realiza viagens medidas em anos-luz. O sistema valida o combustível antes de cada viagem e lança exceções caso os valores sejam inválidos ou insuficientes.

## Conceitos praticados

- Classe abstrata (`NaveEspacial`) com método abstrato `calcularConsumo()`
- Herança com três subclasses concretas
- Exceção unchecked (`CombustivelInvalidoException`) nos setters
- Exceção checked (`CombustivelInsuficienteException`) no método `viajar()`
- Polimorfismo via lista de `NaveEspacial`

## Classes

| Classe | Responsabilidade |
|---|---|
| `NaveEspacial` | Classe abstrata com estado de combustível e lógica de viagem |
| `NaveCombate` | Consumo 0.8/ano-luz; +15% com escudo ativado |
| `NaveExploracao` | Consumo 0.3/ano-luz; +50 fixo se sensores avançados ativos |
| `NaveCargueiro` | Consumo 0.5/ano-luz + 0.2 por kg de carga |
| `CombustivelInvalidoException` | Lançada em setters quando o valor de combustível é inválido |
| `CombustivelInsuficienteException` | Lançada em `viajar()` quando o combustível é insuficiente para a distância |
| `Main` | Monta a frota, testa validações e executa viagens |
