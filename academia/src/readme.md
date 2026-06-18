# 🏋️‍♂️ Sistema de Gerenciamento de Academia

Projeto acadêmico desenvolvido em **Java** com o objetivo de consolidar e aplicar os principais conceitos da **Programação Orientada a Objetos (POO)**.

O sistema simula o funcionamento operacional de uma academia, contemplando o cadastro de alunos e profissionais, gerenciamento de planos, criação de fichas de treino e controle de acesso por meio de regras de negócio e tratamento de exceções.
---

# Objetivo

Desenvolver uma aplicação orientada a objetos capaz de representar processos reais de uma academia, aplicando conceitos fundamentais da engenharia de software como:

* Abstração
* Herança
* Encapsulamento
* Polimorfismo
* Interfaces
* Sobrecarga e Sobrescrita
* Tratamento de Exceções
* Organização em Camadas

---

# Motivação do Projeto

A escolha do tema **Gestão de Academia** foi baseada em três fatores principais:

### 1. Abstração de Processos Reais

O sistema representa um fluxo comum encontrado em academias:

```text
Inscrição
   ↓
Matrícula
   ↓
Ativação do Plano
   ↓
Criação da Ficha de Treino
   ↓
Controle de Acesso
```

### 2. Relacionamentos Naturais

O domínio permite modelar relacionamentos reais entre objetos:

* Um Aluno possui uma Ficha de Treino.
* Um Personal prescreve treinos.
* Uma Recepcionista controla acessos e planos.
* A Ficha conecta Aluno e Personal.

### 3. Aplicação dos Conceitos de POO

O cenário foi ideal para demonstrar:

* Herança
* Encapsulamento
* Polimorfismo
* Interfaces
* Exceções personalizadas

---

# Arquitetura do Sistema

O projeto segue uma estrutura organizada em pacotes, buscando:

* Alta coesão
* Baixo acoplamento
* Separação de responsabilidades
* Facilidade de manutenção

---

# 📁 Estrutura de Pastas

```text
PROJETO_ACADEMIA/
│
├── src/
│
├── app/
│   └── Main.java
│
├── exception/
│   └── AcessoNegadoException.java
│
├── interfaces/
│   └── GeradorDeRelatorio.java
│
├── models/
│   ├── Pessoa.java
│   ├── Aluno.java
│   ├── Personal.java
│   ├── Recepcionista.java
│   └── FichaDeTreino.java
│
└── service/
    └── AcademiaService.java
```

---

# Pilares de POO Aplicados

## 1. Abstração e Herança

A classe `Pessoa` foi definida como abstrata, servindo como base para todas as demais entidades do sistema.

### Responsabilidades

* Centralizar atributos comuns:

  * id
  * nome
  * cpf
  * idade

* Definir o método abstrato:

```java
public abstract void exibirDados();
```

### Benefícios

* Evita duplicação de código.
* Garante padronização entre as subclasses.
* Impede instanciação de objetos genéricos.

### ID Automático

O identificador é gerado automaticamente por um contador estático presente na superclasse.

---

## 2. Encapsulamento

Todos os atributos do sistema são declarados como:

```java
private
```

O acesso é realizado exclusivamente por métodos públicos controlados.

### Exemplo

Na classe `Personal`, a lista de alunos fica protegida:

```java
private ArrayList<Aluno> alunos;
```

Novos alunos são adicionados apenas por:

```java
adicionarAluno(Aluno aluno);
```

Isso evita modificações indevidas por outras classes.

---

## 3. Consistência Referencial

Ao criar uma ficha de treino, o relacionamento entre aluno e personal é estabelecido automaticamente.

```java
FichaDeTreino ficha = new FichaDeTreino(aluno, personal);
```

Garantindo sincronização dos objetos envolvidos.

---

## 4. Sobrecarga (Overload)

A classe `Aluno` possui múltiplos construtores.

### Exemplo

```java
Aluno(String nome, String matricula);
```

```java
Aluno(String nome,
      String cpf,
      int idade,
      String matricula,
      boolean planoAtivo);
```

Permite diferentes formas de cadastro conforme a necessidade.

---

## 5. Sobrescrita (Override)

As subclasses redefinem o comportamento do método:

```java
@Override
public void exibirDados()
```

Cada classe apresenta suas informações específicas.

Exemplos:

* Aluno
* Personal
* Recepcionista

---

## 6. Polimorfismo e Interfaces

A interface:

```java
GeradorDeRelatorio
```

define um contrato comum para geração de relatórios.

### Implementações

* Aluno
* Personal

### Exemplo

```java
GeradorDeRelatorio gerador = personal;

gerador.gerarRelatorio();
```

O método executado dependerá do objeto concreto associado à interface.

---

# Tratamento de Exceções

O sistema implementa exceções personalizadas para representar regras de negócio.

## Classe de Exceção

```java
AcessoNegadoException
```

### Regra de Negócio

Quando um aluno tenta acessar a academia com plano inativo:

```java
throw new AcessoNegadoException(
    "Acesso negado: Plano inativo."
);
```

### Captura da Exceção

```java
try {
    recepcionista.verificarAcesso(aluno);
}
catch (AcessoNegadoException e) {
    System.out.println(e.getMessage());
}
```

### Benefícios

* Evita encerramento inesperado do sistema.
* Mantém o menu funcionando.
* Isola regras de negócio da interface.

---

# Funcionalidades

O menu principal disponibiliza:

### 👤 Gestão de Alunos

* Cadastrar aluno
* Ativar plano
* Cancelar plano

### 🏋️ Gestão de Personais

* Cadastrar personal trainer

### 📋 Treinamentos

* Criar ficha de treino
* Associar aluno ao personal

### 🚪 Controle de Acesso

* Verificar acesso do aluno
* Bloquear alunos com plano inativo

### 📊 Relatórios

* Gerar relatório de aluno
* Gerar relatório de personal

### 🔚 Sistema

* Encerrar aplicação

---

# 🚀 Como Executar

## Pré-requisitos

* JDK 11 ou superior
* Terminal ou IDE Java

---

## Clonar o Repositório

```bash
git clone https://github.com/leozorzii/poo-java/src/academia.git
```

---

## Compilar

```bash
javac src/app/Main.java -d bin
```

---

## Executar

```bash
java -cp bin app.Main
```

---

# ⚙️ Tecnologias Utilizadas

* Java 11+
* Programação Orientada a Objetos
* Collections Framework
* Tratamento de Exceções
* Interface de Console (CLI)

---

# 📚 Conceitos Demonstrados

✅ Abstração

✅ Herança

✅ Encapsulamento

✅ Polimorfismo

✅ Interfaces

✅ Sobrecarga

✅ Sobrescrita

✅ Exceções Personalizadas

✅ Organização em Camadas

✅ Relacionamentos entre Objetos

---

# 🎓 Autor

**Leonardo Montagner de Zorzi**

Desenvolvedor Full Stack
Bacharel em Sistemas de Informação – UFN

GitHub: **@Leozorzii**
