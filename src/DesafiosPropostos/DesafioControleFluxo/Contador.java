package DesafiosPropostos.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);

        boolean parametrosValidos = false;

        while (!parametrosValidos){
            System.out.println("Digite o primeiro parâmetro.");
            int parametro1 = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro.");
            int parametro2 = terminal.nextInt();

            try{
                contar(parametro1,parametro2);
                parametrosValidos = true;

            } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
            }
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{

            if (parametro1 < parametro2){
                int contagem = parametro2 - parametro1;
                for (int i=1; i<=contagem; i++ ){
                    System.out.println("Imprimindo o número 1: " + parametro1);
                    System.out.println("Imprimindo o número 2: " + parametro2);
                }
            }else {
                throw new ParametrosInvalidosException();

            }
    }
}
