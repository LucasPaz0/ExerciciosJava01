import java.util.Scanner;

public class ProgramaConverterTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura de origem (Celsius, Fahrenheit ou Kelvin): ");
        String tempOrigem = input.nextLine();

        System.out.println("Digite a temperatura de conversão (Celsius, Fahrenheit ou Kelvin): ");
        String tempDestino = input.nextLine();

        System.out.println("Digite o valor da temperatura de origem: ");
        double valorOrigem = input.nextDouble();

        double valorDestino;

        if (tempOrigem.equalsIgnoreCase("Celsius")) {
            if (tempDestino.equalsIgnoreCase("Fahrenheit")) {
                valorDestino = valorOrigem * 9/5 + 32;
                System.out.println("O valor convertido é: " + valorDestino + " Fahrenheit");
            } else if (tempDestino.equalsIgnoreCase("Kelvin")) {
                valorDestino = valorOrigem + 273;
                System.out.println("O valor convertido é: " + valorDestino + " Kelvin");
            } else {
                System.out.println("Temperatura de destino inválida!");
            }
        } else if (tempOrigem.equalsIgnoreCase("Fahrenheit")) {
            if (tempDestino.equalsIgnoreCase("Celsius")) {
                valorDestino = (valorOrigem - 32) * 5/9;
                System.out.println("O valor convertido é: " + valorDestino + " Celsius");
            } else if (tempDestino.equalsIgnoreCase("Kelvin")) {
                valorDestino = (valorOrigem - 32) * 5/9 + 273;
                System.out.println("O valor convertido é: " + valorDestino + " Kelvin");
            } else {
                System.out.println("Temperatura de destino inválida!");
            }
        } else if (tempOrigem.equalsIgnoreCase("Kelvin")) {
            if (tempDestino.equalsIgnoreCase("Celsius")) {
                valorDestino = valorOrigem - 273;
                System.out.println("O valor convertido é: " + valorDestino + " Celsius");
            } else if (tempDestino.equalsIgnoreCase("Fahrenheit")) {
                valorDestino = (valorOrigem - 273) * 9/5 + 32;
                System.out.println("O valor convertido é: " + valorDestino + " Fahrenheit");
            } else {
                System.out.println("Temperatura de destino inválida!");
            }
        } else {
            System.out.println("Temperatura de origem inválida!");
        }

        input.close();
    }
}
