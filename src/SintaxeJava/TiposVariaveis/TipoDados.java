package SintaxeJava.TiposVariaveis;

public class TipoDados {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo, possivelmente String
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo, possivelmente String
                                // o tipo long precisa do L ao final do numero para ser identificado corretamente
        float pi = 3.14F; //precisa do F no final para ser identificado corretamente como float
        double salario = 1275.33;

        /*
         * esta linha é considerada como declaração de variável iniciamos a existência
         * variavel numero com valor 5 regra: tipo + nome + valor
         */
        int numero = 5;

        /*
         * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
         * não é mais necessário, pois a variável já foi declarada anteriormente
         */
        numero = 10;

        System.out.print(numero);

        /*
         * ao usar a palavra reservada final, você determina que jamais
         * esta variavel poderá obter outro valor
         * isso é considerado uma CONSTANTE na linguagem Java
         */
        final double VALOR_DE_PI = 3.14;

    }
}
