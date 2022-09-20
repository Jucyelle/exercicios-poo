package lista_1.q2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Rectangle rect = new Rectangle();

    System.out.println("Enter rectangle width and height:");
    double width = sc.nextDouble();
    rect.setWidth(width);
    double height = sc.nextDouble();
    rect.setHeight(height);

    System.out.printf("AREA = %.2f%n", rect.area());
    System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
    System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
    sc.close();
}
}
