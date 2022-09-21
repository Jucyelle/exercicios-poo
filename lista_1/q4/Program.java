package lista_1.q4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    ArrayList<Shape> shapeList = new ArrayList<>();

    System.out.print("Enter the number of shapes: ");
    int n = sc.nextInt();
    System.out.println();
    
    int i = 1;
    while(i<=n){
      System.out.printf("**Shape #%d data:**\n", i);
      System.out.print("Rectangle or Circle (r/c)? ");
      String shape = sc.next();
      System.out.print("Color (BLACK/BLUE/RED): ");
      Color color = (Color.valueOf(sc.next()));
      
      if (shape.equals("r")) {
        Rectangle rect = new Rectangle();
        rect.setColor(color);

        System.out.print("Width: ");
        rect.setWidth(sc.nextDouble());

        System.out.print("Height: ");
        rect.setHeight(sc.nextDouble()); 

        shapeList.add(rect);

        System.out.println();
      }
      else {
        Circle circ = new Circle();
        circ.setColor(color);

        System.out.print("Radius: ");
        circ.setRadius(sc.nextDouble());

        shapeList.add(circ);

        System.out.println();
      }
      i += 1;
    }

    System.out.println("SHAPE AREAS:");
    System.out.println();

    for (Shape element: shapeList) {
      System.out.printf("%.2f%n", element.area());
    }

    sc.close();
  }
}
