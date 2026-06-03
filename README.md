# POO Java — Programação Orientada a Objetos

Repositório com exercícios práticos da disciplina de **Programação Orientada a Objetos** em Java. Os exercícios evoluem progressivamente, partindo de classes simples até sistemas com hierarquias de herança, múltiplas interfaces e tratamento de exceções.

---

## Conceitos estudados

### Classes e Objetos
Fundamentos da orientação a objetos: criação de classes, instância de objetos, atributos e uso de `Scanner` para entrada de dados.

```java
Computador meuPc = new Computador();
meuPc.marca = "Acer";
meuPc.preco = 3500.0;
Encapsulamento
Proteção do estado interno das classes com atributos private e acesso controlado por getters e setters, com validação nos setters para garantir integridade dos dados.


public void setSalario(double salario) {
    if (salario < 1412.0) {
        throw new IllegalArgumentException("Salário abaixo do mínimo.");
    }
    this.salario = salario;
}
Herança
Reutilização de código com extends. A subclasse herda atributos e métodos da superclasse e pode sobrescrever comportamentos com @Override. Uso de super() para chamar o construtor da classe pai.


public class Gerente extends Funcionario {
    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
Exemplos: Animal → Cachorro / Gato, Funcionario → Gerente, Pessoa → Aluno, Conta → ContaPoupanca.

Classes Abstratas
Classes que definem um contrato sem implementar completamente o comportamento. Não podem ser instanciadas diretamente; as subclasses concretas são obrigadas a implementar os métodos abstratos.


public abstract class NaveEspacial {
    public abstract double calcularConsumo(double distancia);
}
Exemplos: NaveEspacial, FuncionarioHospital, MaquinaIndustrial, Produto, Personagem.

Polimorfismo
Um mesmo tipo de referência pode apontar para objetos de subclasses diferentes. Permite tratar objetos distintos de forma uniforme através de listas e laços, chamando o método correto para cada tipo em tempo de execução.


List<FuncionarioHospital> folha = new ArrayList<>();
folha.add(new Medico(...));
folha.add(new Enfermeiro(...));

for (FuncionarioHospital f : folha) {
    f.exibirResumoMensal(); // comportamento diferente para cada tipo
}
Interfaces
Definem contratos de comportamento sem implementação. Uma classe pode implementar múltiplas interfaces simultaneamente, algo que a herança simples de classes não permite.


public class SmartWatch extends Dispositivo
        implements Monitoramento, Conectividade {
    // obrigado a implementar todos os métodos das interfaces
}
Uso de instanceof para verificar em tempo de execução se um objeto implementa determinada interface:


if (produto instanceof Tributavel t) {
    totalImpostos += t.calcularImposto();
}
Exceções
Tratamento de erros com try / catch / finally. Criação de exceções customizadas para representar falhas de negócio específicas.

Tipo	Quando usar
RuntimeException (unchecked)	Erro de programação ou validação de argumento; não precisa de throws
Exception (checked)	Falha de negócio esperada; obriga o chamador a tratar com throws ou try/catch

// Unchecked — validação em setter
public class CombustivelInvalidoException extends RuntimeException { ... }

// Checked — falha de operação
public class CombustivelInsuficienteException extends Exception { ... }
Organização das aulas
Pasta	Conteúdo principal
aula04	Classes, objetos, atributos e entrada de dados com Scanner
aula06Heranca	Herança, @Override, super, toString()
aula07Execoes	try/catch/finally, throw/throws, exceções customizadas
aula08	Validação de entrada com exceção customizada e regex
aula10	Classes abstratas, polimorfismo, exceções checked e unchecked
aula11	Interfaces, instanceof, coleções polimórficas
aula12	Implementação de múltiplas interfaces
aula14	Combinação avançada de interfaces, herança e exceções
avalicao	Sistema completo integrando todos os conceitos
Tecnologia
Java 17+
Paradigma orientado a objetos (POO)


---

É só copiar esse bloco inteiro. Cobre tudo que foi estudado com exemplos de código reais tirados dos exercícios.
