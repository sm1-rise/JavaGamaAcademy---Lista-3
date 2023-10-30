package atv2;

public class Main {

  static final double VELOCIDADE_FINAL = 80;

  public static void main(String[] args) {
    radar(86);
  }

  public static void radar(double kmH) {
    double excessoVelocidade = (0.2 * VELOCIDADE_FINAL) + VELOCIDADE_FINAL;

    if (kmH <= VELOCIDADE_FINAL) {
      System.out.println("Sem multa");
    } else if (kmH <= excessoVelocidade) {
      System.out.println("Multa leve");
    } else {
      System.out.println("Multa pesada");
    }
  }
}
