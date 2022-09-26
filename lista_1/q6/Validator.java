package lista_1.q6;

public class Validator {
  public static void runValidation(IEntityValidator e) {
    if(e.isValid()) {
      System.out.println("A entidade é valida.");
    } else {
      System.out.println("A entidade é inválida.");
    }
  }
}
