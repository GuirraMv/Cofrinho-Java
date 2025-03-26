public class Dolar extends Moeda {
    static final String nome = "Dolar";
    double cotacao = 5.68;
    double valor;

    public Dolar(double valor) {
        super(nome, valor);
    }

    @Override
    public void info(double valor) {
        this.valor = valor;
        System.out.println("Moeda de Dólar no valor de: " + valor);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dolar dolar = (Dolar) o;
        return Double.compare(valor, dolar.valor) == 0;
    }

    public double converter(double valor) {
        this.valor = valor;
        return super.converter(cotacao, valor);
    }
}