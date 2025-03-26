public class Euro extends Moeda {
    static final String nome = "Euro";
    double cotacao = 6.16;
    double valor;

    public Euro(double valor) {
        super(nome, valor);
    }

    @Override
    public void info(double valor) {
        this.valor = valor;
        System.out.println("Moeda de Euro no valor de: " + valor);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Euro euro = (Euro) o;
        return Double.compare(valor, euro.valor) == 0;
    }

    public double converter(double valor) {
        this.valor = valor;
        return super.converter(cotacao, valor);
    }
}