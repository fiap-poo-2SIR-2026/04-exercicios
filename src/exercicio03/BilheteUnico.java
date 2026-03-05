package exercicio03;

import java.util.Random;

public class BilheteUnico {
    int numero;
    double saldo;
    String usuario;
    String tipoTarifa;
    final static double tarifaBase = 5.40;

    public BilheteUnico(String usuario, String tipoTarifa) {
        Random rd = new Random();
        this.numero = rd.nextInt(1000, 9999);
        this.usuario = usuario;
        this.tipoTarifa = tipoTarifa;
        this.saldo = 0.0;
    }

    public void carregar(double valor) {
        this.saldo += valor;
    }

    public void passarNaCatraca() {
        double valor = tarifaBase;
        if(tipoTarifa.equalsIgnoreCase("professor") ||
                tipoTarifa.equals("estudante")) {
            valor = tarifaBase / 2;
        }

        if(saldo < valor) {
            return;
        }

        saldo -= valor;

    }

}
