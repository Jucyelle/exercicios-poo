package lista_1.q6;

public class Person implements IEntityValidator {
  @Override
  public String toString() {
    return "Type: Person";
  }

  @Override
  public boolean isValid() {
    return false;
  }
}
