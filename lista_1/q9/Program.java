package lista_1.q9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Integer> lista = new ArrayList<>();
    Collections.addAll(lista, 5, 1, 8, 2, 9, -4, 0, 1);

    SortMachine.runSort(lista);
  }
}
