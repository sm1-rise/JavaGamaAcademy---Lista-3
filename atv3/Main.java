package atv3;

public class Main {

  static final int FUSO_FRANCA = 5;

  public static void main(String[] args) {
    fusoHorario(78);
  }

  public static void fusoHorario(int horaBrasil) {
    if (horaBrasil > 24) {
      System.out.println("Informe um valor até 24h");
    }

    int horaFranca = horaBrasil + FUSO_FRANCA;
    int aux = 0;

    if (horaBrasil <= 17) {
      System.out.println("HORA BRASIL: " + horaBrasil + "h");
      System.out.println("HORA FRANÇA: " + horaFranca + "h");
    } else if (horaBrasil == 18) {
      System.out.println("HORA BRASIL: " + horaBrasil + "h");
      horaBrasil = 0;
      System.out.println("HORA FRANÇA: " + (horaFranca + 1) + "h");
    } else if (horaBrasil >= 19 & horaBrasil < 25) {
      for (int i = horaFranca; i >= 24; i--) {
        aux++;
      }
      System.out.println("HORA BRASIL: " + horaBrasil + "h");
      horaFranca = aux;
      System.out.println("HORA FRANÇA: " + horaFranca + "h");
    }
  }
}
