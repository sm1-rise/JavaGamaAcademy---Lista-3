package atv1;

import java.lang.Math;

public class Main {

  public static void main(String[] args) {
    raizQuadrada(5);
  }

  public static void raizQuadrada(double num) {
    if (raizExata(num)) {
      System.out.println("Exata");
    } else {
      System.out.println("Não exata");
    }
  }

  public static boolean raizExata(double num) {
    double raizQuadrada = Math.sqrt(num);
    int raizInteira = (int) raizQuadrada;

    return raizQuadrada - raizInteira == 0;
  }
}
