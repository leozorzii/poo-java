# Aula 10 — Exercício 02: Folha de Pagamento de Hospital

## Proposta

Praticar herança e polimorfismo modelando diferentes tipos de funcionários de um hospital, cada um com sua própria regra de cálculo de salário final.

## O que o exercício faz

O sistema monta uma folha de pagamento com médicos, enfermeiros e administrativos. Cada funcionário tem um salário base e regras específicas de bônus e adicionais. Validações são feitas nos setters com exceção customizada.

## Conceitos praticados

- Classe abstrata (`FuncionarioHospital`) com método abstrato `calcularSalarioFinal()`
- Herança com três subclasses concretas
- Exceção unchecked (`ValorInvalidoException`) para salário mínimo e carga horária
- Polimorfismo via lista de `FuncionarioHospital`
- Método concreto `exibirResumoMensal()` na classe base

## Classes

| Classe | Responsabilidade |
|---|---|
| `FuncionarioHospital` | Classe abstrata com nome, matrícula, salário base e horas mensais |
| `Medico` | Salário = base + (valor por plantão × quantidade de plantões) |
| `Enfermeiro` | Salário = base + insalubridade + R$ 50 por hora extra (acima de 160h) |
| `Administrativo` | Salário = base + R$ 1.500 se cargo de gestão |
| `ValorInvalidoException` | Lançada quando salário < mínimo legal ou carga horária inválida |
| `Main` | Cria funcionários, testa validações e imprime resumos mensais |
