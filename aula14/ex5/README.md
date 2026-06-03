# Aula 14 — Exercício 5: Playlist de Mídia com Download e Compartilhamento

## Proposta

Praticar interfaces em um sistema de playlist de mídia, onde cada tipo de conteúdo pode suportar download, compartilhamento ou ambos, dependendo de quais interfaces implementa.

## O que o exercício faz

Uma playlist contém músicas, filmes e podcasts. O sistema percorre a lista e, para cada mídia, verifica quais capacidades estão disponíveis via `instanceof`. Downloads podem falhar e lançar `FalhaNoDownloadException`. Cada tipo de mídia gera um link de compartilhamento diferente.

## Conceitos praticados

- Classe abstrata (`Midia`) com título e duração
- Duas interfaces com capacidades independentes de distribuição
- Verificação de capacidade em tempo de execução com `instanceof`
- Exceção checked (`FalhaNoDownloadException`) para falha no download
- Polimorfismo via lista de `Midia`

## Classes e Interfaces

| Tipo | Nome | Responsabilidade |
|---|---|---|
| Classe abstrata | `Midia` | Base com título e duração |
| Interface | `Baixavel` | Contrato para `baixar()` |
| Interface | `Compartilhavel` | Contrato para `gerarLink()` |
| Classe concreta | `Musica` | Implementa `Baixavel` e `Compartilhavel` |
| Classe concreta | `Filme` | Implementa apenas `Baixavel` |
| Classe concreta | `Podcast` | Implementa apenas `Compartilhavel` |
| Exceção | `FalhaNoDownloadException` | Lançada quando o download não pode ser concluído |
| Classe | `Main` | Monta playlist e demonstra download e compartilhamento |
