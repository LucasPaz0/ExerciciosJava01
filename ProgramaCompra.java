import java.util.Scanner;

public class ProgramaCompra {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor original do produto: R$");
        double valorOriginal = input.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1. À vista (dinheiro, pix ou débito) - 10% de desconto");
        System.out.println("2. Crédito à vista - preço normal");
        System.out.println("3. Crédito parcelado - aplicado juros simples");
        System.out.print("Opção: ");
        int formaPagamento = input.nextInt();

        double valorFinal = 0;

        switch (formaPagamento) {
            case 1:
                valorFinal = valorOriginal * 0.90;
                break;
            case 2:
                valorFinal = valorOriginal;
                break;
            case 3:
                System.out.print("Digite a quantidade de parcelas: ");
                int quantidadeParcelas = input.nextInt();
                double taxaJuros = 0.10;
                double juros = valorOriginal * taxaJuros * quantidadeParcelas;
                valorFinal = valorOriginal + juros;
                break;
            default:
                System.out.println("Opção inválida.");
                input.close();
                return;
        }

        System.out.printf("O valor final do produto é: R$%.2f%n", valorFinal);

        input.close();
    }
}
