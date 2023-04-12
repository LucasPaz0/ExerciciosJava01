import java.util.Scanner;

public class ProgramaHelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite seu nome completo: ");
        String nome = input.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
        
        input.close();
    }
}
