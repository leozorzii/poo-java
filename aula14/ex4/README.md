# Aula 14 — Exercício 4: Sistema de Combate RPG

## Proposta

Praticar herança e múltiplas interfaces em um sistema de combate de RPG, onde personagens possuem habilidades distintas (ataque, magia, cura) definidas por interfaces.

## O que o exercício faz

Um guerreiro ataca um mago repetidamente até que um deles morra. Personagens mortos não podem ser atacados novamente; tentar fazê-lo lança `AlvoInvalidoException`. O sistema demonstra polimorfismo por meio de referências à classe abstrata `Personagem`.

## Conceitos praticados

- Classe abstrata (`Personagem`) com pontos de vida e método de receber dano
- Interfaces para habilidades especiais opcionais
- Exceção checked (`AlvoInvalidoException`) ao atacar alvo com vida zero
- Loop de combate com verificação de condição de morte
- Composição de comportamentos via múltiplas interfaces

## Classes e Interfaces

| Tipo | Nome | Responsabilidade |
|---|---|---|
| Classe abstrata | `Personagem` | Base com nome, pontos de vida e método `receberDano()` |
| Interface | `Magico` | Contrato para `lancarMagia(Personagem alvo)` |
| Interface | `Curandeiro` | Contrato para `curar(Personagem alvo)` |
| Classe concreta | `Guerreiro` | Ataque físico de 20 de dano |
| Classe concreta | `Mago` | Implementa `Magico`; ataque mágico com dano variável |
| Classe concreta | `Paladino` | Implementa `Curandeiro`; pode curar e atacar |
| Exceção | `AlvoInvalidoException` | Lançada ao tentar atacar personagem já morto |
| Classe | `Main` | Simula combate entre guerreiro e mago até a morte de um |
