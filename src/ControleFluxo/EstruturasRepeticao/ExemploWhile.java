package ControleFluxo.EstruturasRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int doces = 0;

        while(mesada>0) {
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
            doces++;
        }
        System.out.println("Mesada: " + mesada +" reais");
        System.out.println("Joãozinho gastou toda a sua mesada em "+ doces +" doces");

        /*
         * Não se preocupe quanto a formatação de valores
         * Iremos explorar os recursos de formatação em breve !!
         */
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1, 20);
    }
}
