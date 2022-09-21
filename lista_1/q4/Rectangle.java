package lista_1.q4;

public class Rectangle extends Shape {
  private double width;
  private double height;

  public void setWidth(double width) {
    this.width = width;
  }
  
  public void setHeight(double height) {
    this.height = height;
  }
  
  @Override
  public double area() {
    return width * height;
  }
}
