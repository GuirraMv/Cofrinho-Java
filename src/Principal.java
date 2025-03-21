public class Principal {
    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);

//        System.out.println("Digite o valor do dolar: ");
//        float valor = teclado.nextFloat();
//        Dolar dolar = new Dolar(valor);
//        Euro euro = new Euro(valor);
//        Real real = new Real(valor);
        Cofrinho cofrinho = new Cofrinho();
//        System.out.println(dolar.converter(valor));
        cofrinho.adiconar(new Dolar(3));
//        cofrinho.adiconar(dolar);
    }
}