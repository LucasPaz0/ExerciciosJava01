import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = input.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2*2 + nota3*3) / 6;

        String conceito;
        if (media >= 90) {
            conceito = "A";
        } else if (media >= 75 && media < 90) {
            conceito = "B";
        } else if (media >= 60 && media < 75) {
            conceito = "C";
        } else if (media >= 40 && media < 60) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
        
        input.close();
    }
}
