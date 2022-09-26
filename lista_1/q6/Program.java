package lista_1.q6;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o CPF: ");
    PersonIndividual personIndividual = new PersonIndividual(scanner.nextLine());
    System.out.println("O CPF é válido?");
    System.out.println(personIndividual.isValid());
    System.out.print("Digite o CNPJ: ");
    PersonLegal personLegal = new PersonLegal(scanner.nextLine());
    System.out.println("O CNPJ é válido?");
    System.out.println(personLegal.isValid());
    scanner.close(); 
  }
}
