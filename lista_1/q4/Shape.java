package lista_1.q4;

public abstract class Shape {
  private Color color;

  public Shape() {
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
      this.color = color;
  }

  public abstract double area();
}
