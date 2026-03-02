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


}
