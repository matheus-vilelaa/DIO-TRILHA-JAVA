package ControleFluxo.EstruturasRepeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        //Utilizando FOR com ARRAY
        String[] alunos = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

       for (int x = 0; x < alunos.length; x++) {
           System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
       }

        // Outra maneira de utilizar o FOR com ARRAY é utulizando o FOR EACH que faz
        // a interação baseada nos elementos do ARRAY/Coleção de forma mais abrevida que um for comum.
        for(String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
