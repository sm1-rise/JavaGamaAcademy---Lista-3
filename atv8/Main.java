package atv8;

import javax.sound.midi.Soundbank;

public class Main {

  public static void main(String[] args) {
    etiqueta();
  }

  private static void etiqueta() {
    String nome = "Batata Frita";
    int quantidadeEtiqueta = 7;
    int quantidadeLinha = 2;

    for (int i = 1; i <= quantidadeEtiqueta; ++i) {
      System.out.print(nome + " ");

      if ((i + 1) % quantidadeLinha == 0) {
        System.out.println();
      }
    }

    if (quantidadeEtiqueta % quantidadeLinha != 0) {
      System.out.println();
    }
  }
}
