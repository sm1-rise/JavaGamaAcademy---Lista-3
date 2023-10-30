package atv4;

import java.util.Scanner;

public class Main {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    copa();
  }

  public static void copa() {
    int ano = 1;
    while (ano != 0) {
      System.out.println("Informe um ano: ");
      ano = scanner.nextInt();

      if (
        ano >= 1930 && (ano - 1930) % 4 == 0 && (ano != 1942) && (ano != 1946)
      ) {
        System.out.println("ANO DE COPA");
      } else {
        System.out.println("Nao tem COPA");
      }
    }
  }
}
