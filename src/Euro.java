public class Euro extends Moeda {
    double cotacao = 6.16F;
    double valor;

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {

    }

    public double converter(double valor) {
        this.valor = valor;
        return super.converter(cotacao, valor);
    }
}