import java.util.Scanner;

public class ProgramaParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        input.close();
    }
}
