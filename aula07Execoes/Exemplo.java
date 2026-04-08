//  AULA 07 - TRATAMENTO DE EXCEÇÕES EM JAVA
package aula07Execoes;
public class Exemplo {
    // 1. CONCEITO BÁSICO: try-catch
    //    O bloco "try" tenta executar algo arriscado.
    //    O bloco "catch" captura o erro SE ele acontecer.
    //    O bloco "finally" SEMPRE executa, erro ou não.
    // ----------------------------------------------------------
    public static void exemploBasico() {
        System.out.println("=== 1. try-catch básico ===");

        try {
            int resultado = 10 / 0; // ERRO: divisão por zero
            System.out.println("Resultado: " + resultado); // nunca chega aqui
        } catch (ArithmeticException e) {
            // ArithmeticException é lançada automaticamente pela JVM
            System.out.println("Erro capturado: " + e.getMessage());
            // getMessage() retorna: "/ by zero"
        } finally {
            System.out.println("Finally SEMPRE executa - ideal pra fechar recursos!");
        }
    }

    //
    // 2. MÚLTIPLOS CATCH
    //    Podemos ter vários catch para diferentes tipos de erro.
    //    A JVM usa o primeiro catch que "encaixa" no tipo da exceção.
    // 
   public static void exemploMultiplosCatch(String[] vetor, int indice) {
        System.out.println("\n=== 2. Múltiplos catch ===");

        try {
            String valor = vetor[indice];        // pode lançar ArrayIndexOutOfBoundsException
            int numero = Integer.parseInt(valor); // pode lançar NumberFormatException
            System.out.println("Número convertido: " + numero);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fora do limite! Índice: " + indice);

        } catch (NumberFormatException e) {
            System.out.println("O valor não é um número válido: " + e.getMessage());

        } catch (Exception e) {
            // Exception é a "mãe" de todas — captura qualquer outra coisa
            System.out.println("Erro genérico: " + e.getMessage());
        }
    }

    // ----------------------------------------------------------
    // 3. THROW - lançando exceção manualmente
    //    Usamos "throw" pra forçar um erro quando uma regra de
    //    negócio é violada. Ex: idade negativa não faz sentido!
    // ----------------------------------------------------------
    public static void validarIdade(int idade) {
        System.out.println("\n=== 3. throw manual ===");

        if (idade < 0) {
            // Aqui NÓS lançamos a exceção, não a JVM
            throw new IllegalArgumentException("Idade inválida: " + idade + ". Não pode ser negativa!");
        }
        System.out.println("Idade válida: " + idade);
    }

    // ----------------------------------------------------------
    // 4. THROWS - declarando que um método PODE lançar exceção
    //    Quando usamos "throws" na assinatura, avisamos quem chamar
    //    o método que ele precisa tratar aquela exceção.
    //    (Exceções checadas obrigam isso — ex: IOException)
    // ----------------------------------------------------------
    public static void sacar(double saldo, double valor) throws Exception {
        if (valor > saldo) {
            throw new Exception("Saldo insuficiente! Saldo: R$" + saldo + " | Tentativa: R$" + valor);
        }
        System.out.println("\n=== 4. throws ===");
        System.out.println("Saque de R$" + valor + " realizado. Saldo restante: R$" + (saldo - valor));
    }

    // 5. EXCEÇÃO CUSTOMIZADA
    //    Podemos criar nossas próprias exceções herdando de Exception
    //    ou RuntimeException. Isso torna o código mais expressivo!
    // ----------------------------------------------------------
    public static class SenhaFracaException extends RuntimeException {
        public SenhaFracaException(String mensagem) {
            super(mensagem); // passa a mensagem pra classe pai
        }
    }

    static void validarSenha(String senha) {
        System.out.println("\n=== 5. Exceção customizada ===");

        if (senha.length() < 8) {
            throw new SenhaFracaException("Senha muito curta! Mínimo 8 caracteres. Você usou: " + senha.length());
        }
        System.out.println("Senha aceita!");
    }

    // 6. RE-LANÇANDO EXCEÇÃO (rethrow)
    //    Às vezes capturamos uma exceção pra logar, mas queremos
    //    propagar o erro pra quem chamou o método.
    // ----------------------------------------------------------
    public static void processarDados(String dado) {
        System.out.println("\n=== 6. Re-lançando exceção ===");

        try {
            int numero = Integer.parseInt(dado);
            System.out.println("Dado processado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("[LOG] Falha ao processar dado: " + dado);
            throw e; // relança a mesma exceção pra quem chamou tratar também
        }
    }
    public static void main(String[] args) {

        //Exemplo: divisão por zero
        exemploBasico();

        //Exemplo 2: índice fora do limite
        String[] nomes = {"Ana", "Carlos", "10"};
        exemploMultiplosCatch(nomes, 99);   // indice 99 não existe

        //Exemplo 2.1: valor não é número
        exemploMultiplosCatch(nomes, 0);    // "Ana" não eh número

        //Exemplo 2.2: funcionando normal
        exemploMultiplosCatch(nomes, 2);    // "10" converte normal

        // Exemplo 3: throw com regra de negócio
        try {
            validarIdade(25);   // ok
            validarIdade(-5);   // boom!
        } catch (IllegalArgumentException e) {
            System.out.println("Capturado no main: " + e.getMessage());
        }

        //Exemplo 4: throws (exceção checada)
        try {
            sacar(500.0, 200.0);  // ok
            sacar(500.0, 800.0);  // saldo insuficiente!
        } catch (Exception e) {
            System.out.println("Capturado no main: " + e.getMessage());
        }

        //Exemplo 5: exceção customizada
        try {
            validarSenha("java123");       // curta demais
        } catch (SenhaFracaException e) {
            System.out.println("Capturado no main: " + e.getMessage());
        }
        try {
            validarSenha("javaSegura123"); // ok
        } catch (SenhaFracaException e) {
            System.out.println("Capturado no main: " + e.getMessage());
        }

        //Exemplo 6: rethrow
        try {
            processarDados("abc123"); // não é número puro
        } catch (NumberFormatException e) {
            System.out.println("Main também capturou o rethrow: " + e.getMessage());
        }

        System.out.println("\n=== Fim da aula! Sem crash, tudo tratado. ===");
    }
}
