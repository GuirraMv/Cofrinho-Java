abstract class Moeda {
    double valor;

    public void info () {
//        System.out.println("O cotação da moeda está em R$ " + valor);
    };

    public double converter(double cotacao) {
        return valor * cotacao;
    };
}
