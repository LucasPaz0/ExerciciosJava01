import java.util.Scanner;

public class ProgramaSoma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int valorA = input.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int valorB = input.nextInt();
        
        int valorC;
        String caminho;
        
        if (valorA > valorB) {
            valorC = valorA + valorB;
            caminho = "soma";
        } else {
            valorC = valorA * valorB;
            caminho = "multiplicação";
        }
        
        System.out.println("O valor de C é: " + valorC);
        System.out.println("O caminho utilizado foi: " + caminho);

        input.close();
    }
}
