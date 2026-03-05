package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, tipoTarifa;

        System.out.print("Usuário do bilhete único --> ");
        usuario = sc.next();
        System.out.print("Tipo de Tarifa: Professor ou Estudante ou Normal --> ");
        tipoTarifa = sc.next();

        BilheteUnico bilhete = new BilheteUnico(usuario, tipoTarifa);

        System.out.println("Saldo atual R$ " + bilhete.saldo);
        bilhete.passarNaCatraca();
        System.out.println("Saldo atual R$ " + bilhete.saldo);
        bilhete.carregar(10);
        bilhete.passarNaCatraca();
        System.out.println("Saldo atual R$ " + bilhete.saldo);

    }
}
