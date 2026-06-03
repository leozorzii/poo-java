# Aula 14 — Exercício 3: Membros Acadêmicos com Pesquisa e Avaliação

## Proposta

Praticar herança e interfaces diferenciando papéis acadêmicos: professores podem pesquisar e avaliar alunos, enquanto alunos de pós-graduação podem apenas pesquisar.

## O que o exercício faz

O sistema modela professores e alunos de pós-graduação como membros acadêmicos. Professores implementam `Pesquisador` e `Avaliador`, podendo publicar artigos e atribuir notas. Alunos de pós apenas publicam artigos. Dados inválidos (título inválido, nota fora do intervalo) lançam `DadosAcademicosInvalidosException`.

## Conceitos praticados

- Classe abstrata (`MembroAcademico`) como base comum
- Duas interfaces com papéis acadêmicos distintos
- Exceção unchecked (`DadosAcademicosInvalidosException`) para validação
- `Professor` implementando duas interfaces simultâneas
- Polimorfismo por tipo de membro na lista

## Classes e Interfaces

| Tipo | Nome | Responsabilidade |
|---|---|---|
| Classe abstrata | `MembroAcademico` | Base com nome, matrícula e instituição |
| Interface | `Pesquisador` | Contrato para `publicarArtigo(String titulo)` |
| Interface | `Avaliador` | Contrato para `atribuirNota(double nota)` |
| Classe concreta | `Professor` | Implementa `Pesquisador` e `Avaliador`; valida título e nota |
| Classe concreta | `AlunoPosGraduacao` | Implementa apenas `Pesquisador` |
| Exceção | `DadosAcademicosInvalidosException` | Lançada para título vazio ou nota fora de 0–10 |
| Classe | `Main` | Testa publicação de artigos, avaliação e tratamento de erros |
