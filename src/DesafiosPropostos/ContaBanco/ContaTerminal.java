package DesafiosPropostos.ContaBanco;

import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia, nome, sobreNome;


        System.out.println("Por favor, digite o número da conta.");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência.");
        agencia = scanner.next();

        System.out.println("Por favor, digite seu nome e sobrenome.");
        nome = scanner.next();
        sobreNome = scanner.next();
        String nomeCliente = nome +" "+sobreNome;

        System.out.println("Por final digite o saldo disponivel.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia +  " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
