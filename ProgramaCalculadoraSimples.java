import java.util.Scanner;

public class ProgramaCalculadoraSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;
        String operacao;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextDouble();

        System.out.println("Digite a operação desejada (Soma, Subtracao, Divisao, Multiplicacao): ");
        operacao = input.next();

        switch (operacao.toLowerCase()) {
            case "soma":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "subtracao":
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "divisao":
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            case "multiplicacao":
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        input.close();
    }
}
