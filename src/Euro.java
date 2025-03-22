public class Euro extends Moeda {
    static final String nome = "Euro";
    double cotacao = 6.16;
    double valor;

    public Euro(double valor) {
        super(nome, valor);
    }

    @Override
    public void info() {
    }

    public double converter(double valor) {
        this.valor = valor;
        return super.converter(cotacao, valor);
    }
}