public class Real extends Moeda {
    static final String nome = "Real";
    double valor;
    double cotacao = 1;

    public Real(double valor) {
        super(nome, valor);
    }

    @Override
    public void info(double valor) {
        this.valor = valor;
        System.out.println("Moeda de Real no valor de: " + valor);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Real real = (Real) o;
        return Double.compare(valor, real.valor) == 0;
    }

    public double converter(double valor) {
        this.valor = valor;
        return super.converter(cotacao, valor);
    }
}