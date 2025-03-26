import java.util.Objects;

public abstract class Moeda {
    String nome;
    double valor;
    double cotacao;

    public Moeda(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    abstract public void info(double valor);

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(valor, moeda.valor) == 0 && Objects.equals(nome, moeda.nome);
    }

    public double converter(double cotacao, double valor) {
        this.valor = valor;
        this.cotacao = cotacao;
        return valor * cotacao;
    }
}