import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao;
        int moedaSelecionada;
        double valor = 0;

        Scanner teclado = new Scanner(System.in);

        Cofrinho cofrinho = new Cofrinho();

        System.out.println("Bem vindo ao cofrinho! Escolha uma das opções abaixo: ");
        System.out.println("1 - Adicionar uma moeda.");
        System.out.println("2 - Remover uma moeda.");
        System.out.println("3 - Listar moedas.");
        System.out.println("4 - Calcular total convertido para real.");
        System.out.println("0 - Encerrar.");
        opcao = teclado.nextInt();

        while (opcao != 0) {
            switch (opcao) {
                // adicionar moedas
                case 1:
                    System.out.println("Escolha uma moeda: ");
                    System.out.println("1 - Real: ");
                    System.out.println("2 - Dólar: ");
                    System.out.println("3 - Euro: ");
                    System.out.println("0 - Voltar para o menu: ");
                    moedaSelecionada = teclado.nextInt();

                    while (moedaSelecionada != 0) {
                        switch (moedaSelecionada) {
                            case 1:
                                System.out.println("(Real) Digite um valor: ");
                                valor = teclado.nextDouble();
                                cofrinho.adicionar(new Real(valor));
                                break;
                            case 2:
                                System.out.println("(Dólar) Digite um valor: ");
                                valor = teclado.nextDouble();
                                cofrinho.adicionar(new Dolar(valor));
                                break;
                            case 3:
                                System.out.println("(Euro) Digite um valor: ");
                                valor = teclado.nextDouble();
                                cofrinho.adicionar(new Euro(valor));
                                break;
                            default:
                                System.out.println("Opção inválida! Digite um número presente no menu.");
                        }
                        System.out.println("Escolha uma moeda: ");
                        System.out.println("1 - Real: ");
                        System.out.println("2 - Dólar: ");
                        System.out.println("3 - Euro: ");
                        System.out.println("0 - Voltar para o menu: ");
                        moedaSelecionada = teclado.nextInt();
                    }
                    break;

                // remover moedas
                case 2:
                    System.out.println("Escolha uma moeda: ");
                    System.out.println("1 - Real: ");
                    System.out.println("2 - Dólar: ");
                    System.out.println("3 - Euro: ");
                    moedaSelecionada = teclado.nextInt();

                    while (moedaSelecionada != 0) {
                        switch (moedaSelecionada) {
                            case 1:
                                System.out.println("(Real) Digite um valor: ");
                                valor = teclado.nextDouble();
                                cofrinho.remover(new Real(valor));
                                break;
                            case 2:
                                System.out.println("(Dólar) Digite um valor: ");
                                valor = teclado.nextDouble();
                                cofrinho.remover(new Dolar(valor));
                                break;
                            case 3:
                                System.out.println("(Euro) Digite um valor: ");
                                valor = teclado.nextDouble();
                                cofrinho.remover(new Euro(valor));
                                break;
                            default:
                                System.out.println("Opção inválida! Digite um número presente no menu.");
                        }
                        System.out.println("Escolha uma moeda: ");
                        System.out.println("1 - Real: ");
                        System.out.println("2 - Dólar: ");
                        System.out.println("3 - Euro: ");
                        System.out.println("0 - Voltar para o menu: ");
                        moedaSelecionada = teclado.nextInt();
                    }
                    break;
                //listar moedas
                case 3:
                    cofrinho.listagemMoedas();
                    break;

                //converter para real
                case 4:
                    cofrinho.totalConvertido();
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
            // repete opções quando sair do switch
            System.out.println("1 - Adicionar uma moeda");
            System.out.println("2 - Remover uma moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total convertido para real");
            System.out.println("0 - Encerrar");
            opcao = teclado.nextInt();
        }
    }
}