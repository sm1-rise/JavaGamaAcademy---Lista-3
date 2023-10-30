package atv7;

import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    palavras("Bom dia!");
  }

  private static void palavras(String string) {
    String[] palavras = string.split(" ");
    Set<String> palavraDiferente = new HashSet<>();
    for (String palavra : palavras) {
      palavraDiferente.add(palavra);
    }

    int quantidadePalavras = palavraDiferente.size();
    System.out.println("O número de palavras " + quantidadePalavras);
  }
}
