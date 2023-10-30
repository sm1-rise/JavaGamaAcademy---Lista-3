package atv6;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    for (int i = 1; i < 50; i++) {
      primo(i);
    }
  }

  private static void primo(int num) {
    int aux = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        ++aux;
      }
    }
    if (aux == 2) {
      System.out.println(num);
    }
  }
}
