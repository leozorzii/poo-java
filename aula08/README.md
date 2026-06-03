# Aula 08 — Validação de Entrada com Exceção Customizada

## Proposta

Praticar a criação de exceções customizadas para validar entradas do usuário antes de realizar conversões numéricas.

## O que o exercício faz

O sistema lê uma entrada via teclado e valida se ela contém apenas caracteres numéricos. Caso o usuário digite palavras por extenso (ex.: "vinte e dois"), é lançada a `EntradaPorExtensoException`, uma exceção do tipo `RuntimeException` com mensagem explicando que o sistema não suporta linguagem natural.

Se a entrada for válida, o valor é tratado como número hexadecimal e convertido para decimal. Caso a conversão falhe (dígito inválido para base 16), o programa informa qual caractere causou o problema.

## Conceitos praticados

- Criação de exceção customizada estendendo `RuntimeException`
- Uso de `try/catch/finally`
- Validação com expressões regulares (`matches`)
- Conversão numérica com `Integer.parseInt(valor, 16)`
- Herança entre classes (`Conversoes extends ValidadorDeEntrada`)

## Classes

| Classe | Responsabilidade |
|---|---|
| `EntradaPorExtensoException` | Exceção lançada quando a entrada contém letras |
| `ValidadorDeEntrada` | Valida a string e executa a conversão hexadecimal |
| `Conversoes` | Ponto de entrada (`main`), lê do teclado e chama o validador |
