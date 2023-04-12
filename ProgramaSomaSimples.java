import java.util.Scanner;

public class ProgramaSomaSimples {

   public static void main(String[] args) {
      Scanner banana = new Scanner(System.in);

      int n1, n2, total;

      System.out.println("Informe o primeiro valor: ");
      n1 = banana.nextInt();

      System.out.println("Informe o segundo valor: ");
      n2 = banana.nextInt();

      total = n1 + n2;

      System.out.println("A soma dos valores é: " + total);
      
      banana.close();
   }
}