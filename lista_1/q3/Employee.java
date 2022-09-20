package lista_1.q3;

public class Employee {
  private String name;
  private double grossSalary;
  private double tax;

  public void setName(String name) {
    this.name = name;
  }

  public void setGrossSalary(double grossSalary) {
    this.grossSalary = grossSalary;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }

  public double netSalary() {
    return this.grossSalary - this.tax;
  }

  public void increaseSalary(double percentage) {
    this.grossSalary += this.grossSalary * percentage / 100.0;
  }

  public String toString() {
    return name + ", $ " + String.format("%.2f", netSalary());
  }
}
