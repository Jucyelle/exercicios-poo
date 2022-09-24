package lista_1.q9;

import java.util.List;

public class SortMachine {

  public static void bubbleSort(List<Integer> lista) {

    for(int i = 0; i < lista.size(); i++) {
      for(int j = 0; j < (lista.size() - 1 - i); j++) {
        if(lista.get(j) > lista.get(j + 1)) {
          Integer aux = lista.get(j);
          lista.set(j, lista.get(j + 1));
          lista.set(j + 1, aux);
        }
      }
    }
    System.out.println("BUBBLE SORT: " + lista);
  }

  public static void selectionSort(List<Integer> lista) {
    for (int i = 0; i < lista.size(); i++) {
      int posicaoMenor = i;
      for (int j = (i + 1); j < lista.size(); j++) {
        if (lista.get(j) < lista.get(posicaoMenor)) {
          posicaoMenor = j;
        }
      }
      if (lista.get(i) != lista.get(posicaoMenor)) {
        int temp = lista.get(i);
        lista.set(i, lista.get(posicaoMenor));
        lista.set(posicaoMenor, temp);
      }
    }
    System.out.println("SELECTION SORT: " + lista);
  }

  public static void runSort(List<Integer> lista) {
    bubbleSort(lista);
    selectionSort(lista);
  }
}
