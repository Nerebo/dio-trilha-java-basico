package edu.andre.primeirasemana;
import java.util.Enumeration;
import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agência");
        String nome_cliente = scan.nextLine();

        System.out.println("Por favor, digite o numero da Agência");
        String agencia = scan.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        int num_agencia = scan.nextInt();

        System.out.println("Por favor, digite o numero da Agência");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + num_agencia + " e seu saldo de " + saldo + " já está disponível para saque");
    }
}
