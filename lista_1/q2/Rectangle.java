package lista_1.q2;

public class Rectangle {
  private double width;
  private double height;

  public Rectangle() {

  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double area() {
		return this.width * this.height;
	}

	public double perimeter() {
		return 2 * (this.width + this.height);
	}
	
	public double diagonal() {
		return Math.sqrt(this.height * this.height + this.width *  this.width);
	}

}
