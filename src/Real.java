public class Real extends Moeda {
    double valor;
    double cotacao = 0;

    public Real(double valor) {
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