package ControleFluxo.EstruturasRepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break; // O break realiza a parada do FOR msm que a
                        // condição inicial n tenha se tornado falsa

            System.out.println(numero);

        }

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue; // O continue exclui a regra de negocio mencionada
                            // no IF e continua a execução do FOR

            System.out.println(numero);

        }
    }
}
