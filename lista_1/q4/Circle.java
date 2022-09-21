package lista_1.q4;

public class Circle extends Shape {
  private double radius;

  public void setRadius(Double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}
