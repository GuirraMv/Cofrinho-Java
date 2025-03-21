public class Dolar extends Moeda {
    double cotacao = 5.68F;
    double valor;

    public Dolar(double valor) {
        super(valor);

    }

    @Override
    public void info() {
        System.out.println("Dolar com sucesso");
    }


    public double converter(double valor) {
        this.valor = valor;
        return super.converter(cotacao, valor);
    }
}