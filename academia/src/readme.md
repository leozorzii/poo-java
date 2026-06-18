# 🏋️‍♂️ Sistema de Gerenciamento de Academia (Gym Management System)

[cite_start]Este é um projeto acadêmico desenvolvido em **Java** para consolidar e aplicar na prática os pilares fundamentais da **Programação Orientada a Objetos (POO)**[cite: 12]. [cite_start]O sistema simula o fluxo operacional real de uma academia[cite: 13, 14], contemplando o cadastro de alunos e personais, criação de fichas de treino, ativação/cancelamento de planos e validação crítica de acesso (controle de catraca).

---

## 🎯 Motivação do Tema

[cite_start]A escolha do tema **Gestão de Academia** baseia-se em três fatores estratégicos de engenharia de software[cite: 14]:
1. [cite_start]**Abstração Concreta de Processos Reais:** Mapeia um fluxo operacional cotidiano e dinâmico (*Inscrição ➔ Matrícula ➔ Prescrição de Treino ➔ Validação na Portaria*) diretamente para o paradigma de objetos[cite: 13].
2. **Complexidade Semântica Ideal:** Exige relacionamentos naturais e consistentes entre entidades (um `Aluno` possui uma `FichaDeTreino` que é prescrita por um `Personal` e validada por uma `Recepcionista`).
3. [cite_start]**Aplicação Rígida dos Pilares de POO:** O ecossistema fornece o cenário perfeito para demonstrar regras de negócio usando Herança estrutural, Polimorfismo de inclusão, Contratos de comportamento (Interfaces) e blindagem de estados via Encapsulamento[cite: 13, 17].

---

## 📁 Estrutura de Pastas e Arquitetura

[cite_start]O projeto foi organizado em pacotes lógicos bem definidos para garantir a **alta coesão**, **baixo acoplamento** e a clara separação de responsabilidades[cite: 51]:

```text
PROJETO_ACADEMIA/src/
│
├── app/
│   └── Main.java                      # Ponto de entrada (Inicialização do Sistema)
│
├── exception/
│   └── AcessoNegadoException.java     # Exceção customizada para regras de negócio
│
├── interfaces/
│   └── GeradorDeRelatorio.java        # Contrato polimórfico para relatórios
│
├── models/
│   ├── Pessoa.java                    # Superclasse Abstrata (Abstração & Herança)
│   ├── Aluno.java                     # Subclasse (Sobrecarga de construtores)
│   ├── Personal.java                  # Subclasse (Encapsulamento de coleções)
│   ├── Recepcionista.java             # Subclasse (Dona das regras operacionais)
│   └── FichaDeTreino.java             # Associação e Consistência Referencial
│
└── service/
    └── AcademiaService.java           # Orquestrador do Menu Interativo (Console)
🛠️ Pilares de POO Aplicados no Projeto1. Abstração e Herança (Pessoa.java)A classe Pessoa foi definida como abstract, funcionando como a fundação estrutural do projeto (É-UM). Ela impede a instanciação genérica e centraliza os atributos comuns (id, nome, cpf, idade), além do método abstrato obrigatório exibirDados().  Geração de ID Único: A lógica de autoincremento de ID foi centralizada em um contador estático dentro do construtor de Pessoa, eliminando duplicação de código e garantindo integridade a todas as subclasses.2. Encapsulamento AvançadoTodos os atributos do sistema são estritamente private, acessados apenas por Getters e Setters quando necessário.  Proteção de Coleções: Na classe Personal, a lista ArrayList<Aluno> é encapsulada. Nenhuma classe externa pode modificá-la diretamente via .add(). A inserção é blindada através do método de negócio adicionarAluno(Aluno aluno).Consistência Referencial: No construtor de FichaDeTreino, o relacionamento bidirecional é sincronizado automaticamente, vinculando o aluno ao personal de forma transparente no momento da criação do treino.3. Sobrecarga (Overload) vs. Sobrescrita (Override)Sobrecarga (Mesma Classe): Aplicada na classe Aluno com múltiplos construtores. O primeiro inicializa o aluno completo com plano e matrícula. O segundo recebe apenas nome e matricula, ideal para cenários de diárias avulsas.  Sobrescrita (Classes Diferentes): Aplicada com a anotação @Override no método exibirDados(). Cada classe filha (Aluno, Personal, Recepcionista) reescreve o comportamento para renderizar seus dados específicos em tela.  4. Polimorfismo e InterfacesA interface GeradorDeRelatorio define um contrato de comportamento. Tanto Aluno quanto Personal implementam essa interface. Na camada de serviço, objetos são tratados de forma uniforme sob o tipo da interface (Polimorfismo de Inclusão):  JavaGeradorDeRelatorio gerador = personalRelatorio;
gerador.gerarRelatorio(); // Executa o comportamento polimórfico específico
🛡️ Robustez e Tratamento de ExceçõesO sistema implementa uma política rígida de falhas estruturadas, dividindo o fluxo de exceção em duas camadas bem distintas:  Lançamento (Regra de Negócio - Recepcionista): A classe Recepcionista é a fiscal do sistema. No método verificarAcesso(Aluno aluno), se o plano do aluno estiver inativo (false), ela interrompe o fluxo imediatamente disparando uma exceção customizada de negócio:  Javathrow new AcessoNegadoException("Acesso negado: Plano inativo.");
Captura e Tratamento (Interface/Menu - AcademiaService): A camada de controle intercepta a exceção usando blocos try-catch. Isso isola o erro de negócio, exibe uma mensagem amigável ao operador no console e impede que a aplicação sofra um crash, mantendo o menu em loop operando normalmente.  💻 Funcionalidades do Menu (Console)O sistema possui uma interface CLI rica no método iniciarSessao() da AcademiaService com as seguintes opções:  Cadastrar Aluno (Suporta múltiplos tipos de matrícula via sobrecarga)Cadastrar PersonalAtivar Plano (Operação exclusiva e auditada pela Recepcionista)Cancelar PlanoCriar Ficha de Treino (Estabelece consistência referencial automática)Verificar Acesso Aluno (Portaria protegida por try-catch e AcessoNegadoException)Gerar Relatório (Polimorfismo puro via Interface)Sair🚀 Como Executar o ProjetoCertifique-se de ter o JDK 11 ou superior instalado em sua máquina.Clone este repositório:Bashgit clone [https://github.com/seu-usuario/nome-do-repositorio.git](https://github.com/seu-usuario/nome-do-repositorio.git)
Navegue até a pasta raiz do projeto e compile os arquivos:Bashjavac src/app/Main.java -d bin
Execute a aplicação:Bashjava -cp bin src.app.Main
🎓 AutorLeonardo Montagner de Zorzi (Leozorzii)Desenvolvedor Full Stack & Bacharel em Sistemas de InformaçãoUniversidade Franciscana (UFN)   
