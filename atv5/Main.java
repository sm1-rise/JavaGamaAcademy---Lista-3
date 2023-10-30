package atv5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    ordemAlfabetica();
  }

  private static void ordemAlfabetica() {
    String nomes[] = { "Pedro", "Felipe", "Alisson" };
    Arrays.sort(nomes);
    for (String nome : nomes) {
      System.out.println(nome);
    }
  }
}
