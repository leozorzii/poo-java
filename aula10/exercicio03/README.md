# Aula 10 — Exercício 03: Linha de Produção Industrial

## Proposta

Praticar herança, polimorfismo e múltiplas exceções checked em uma simulação de linha de produção industrial, onde cada máquina possui falhas específicas possíveis.

## O que o exercício faz

Uma fábrica com três máquinas industriais executa lotes de produção em série. Cada máquina pode falhar por razões distintas (desligada, falta de matéria-prima, descalibração, superaquecimento). O sistema executa múltiplos lotes e trata cada alarme separadamente.

## Conceitos praticados

- Classe abstrata (`MaquinaIndustrial`) com método abstrato `produzirLote()`
- Herança com três subclasses concretas
- Quatro exceções checked distintas para tipos de falha diferentes
- `IllegalStateException` (unchecked) para operações inválidas de ligar/desligar
- Relatório final agregando produção e consumo de energia

## Classes

| Classe | Responsabilidade |
|---|---|
| `MaquinaIndustrial` | Classe abstrata com número de série, estado ligado/desligado e totais |
| `InjetoraPlastico` | Consome 0.2 kg de plástico por peça; falha sem matéria-prima |
| `BracoRoboticoMontagem` | Perde calibração a cada lote; falha abaixo de 20% |
| `PrensaHidraulica` | Aquece 1.5°C por peça; falha acima de 90°C |
| `MaquinaDesligadaException` | Lançada ao tentar produzir com máquina desligada |
| `FaltaMateriaPrimaException` | Lançada quando não há plástico suficiente |
| `EquipamentoDescalibradoException` | Lançada quando calibração cai abaixo do mínimo |
| `SuperaquecimentoException` | Lançada quando temperatura excede o limite |
| `Main` | Monta a linha, executa 3 lotes e exibe relatório final |
