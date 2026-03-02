package exercicio02;

public class Main {

    public static void main(String[] args) {
        SenhaAtendimento senha1 = new SenhaAtendimento("Selmini");
        SenhaAtendimento senha2 = new SenhaAtendimento("Patrícia");
        SenhaAtendimento senha3 = new SenhaAtendimento("Miguel");

        System.out.println(senha1.getDados());
        System.out.println(senha2.getDados());
        System.out.println(senha3.getDados());

    }

}
