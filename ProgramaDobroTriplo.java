import java.util.Scanner;

public class ProgramaDobroTriplo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double numero = input.nextDouble();

        
        if (numero > 0) {
            
            double resultado = numero * 2;
            System.out.println("O dobro de " + numero + " é " + resultado);
        } else if (numero < 0) {
            
            double resultado = numero * 3;
            System.out.println("O triplo de " + numero + " é " + resultado);
        } else {
            
            System.out.println("O número é igual a 0.");
        }

        input.close();
    }
}
