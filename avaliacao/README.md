# Avaliação — Sistema de Gestão do Clube "Los Cabreros FC"

## Proposta

Avaliação prática integrando herança, polimorfismo, interfaces e exceções em um sistema completo de gestão de um clube de futebol. O sistema deve controlar o cadastro de profissionais, o registro de desempenho e o cálculo da folha de pagamento.

## O que o exercício faz

Um menu interativo permite cadastrar atletas e membros da comissão técnica, registrar gols e vitórias, e visualizar a folha de pagamento mensal. O salário total não pode ultrapassar R$ 100.000; violações lançam `ViolacaoOrcamentoException`. Bônus são acumulados por desempenho e pagos mensalmente.

## Conceitos praticados

- Classe abstrata (`Profissional`) com salário, bônus acumulado e pagamento mensal
- Herança com duas subclasses concretas de tipos de profissional
- Exceção checked (`ViolacaoOrcamentoException`) para violação de teto salarial
- Polimorfismo via lista de `Profissional`
- Menu interativo com `Scanner` e estrutura de controle com `switch`

## Classes

| Classe | Responsabilidade |
|---|---|
| `Profissional` | Classe abstrata com nome, salário (máx. R$ 100.000) e acúmulo de bônus |
| `Atleta` | Posição e contador de gols; bônus de R$ 500 por gol marcado |
| `ComissaoTecnica` | Cargo e contador de vitórias; bônus de R$ 1.200 por vitória |
| `ViolacaoOrcamentoException` | Lançada quando o salário ultrapassa o teto do clube |
| `Main` | Menu com cadastro, registro de desempenho e exibição da folha de pagamento |
