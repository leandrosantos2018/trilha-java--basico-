import models.ContaTerminal;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ContaTerminal conta = new ContaTerminal();

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, Digite Numero da Agênncia! ");
        conta.setAgencia(sc.nextLine());

        System.out.println("Por favor, Digite Numero da conta! ");
       conta.setNumero(sc.nextInt());

        System.out.println("Por favor, Digite Numero da Agênncia!");
        conta.setNomeCliente(sc.nextLine());

        System.out.println("Por favor, Digite Saldo!");
        conta.setSaldo(sc.nextFloat());

        conta.toString();



    }
}