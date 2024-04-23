
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<Integer> vetor = new ArrayList<Integer>();

    Scanner scan = new Scanner(System.in);
    System.out.printf("Quantidade de números do vetor: ");
    int qtdNumerosALer = scan.nextInt();

    for(int i = 0; i < qtdNumerosALer; i++) {
      int atual = scan.nextInt();
      vetor.add(i, atual);
    }

    boolean vetorOrdenado = verificaOrdenacaVetor(vetor);
    System.out.println("ordenado " + vetorOrdenado);
  }


  private static boolean verificaOrdenacaVetor(List<Integer> vetor) {

    for(int e = 0; e < vetor.size(); e++) {
        if(e > 0) {
            for(int i = 0; i < e; i++) {
                if(vetor.get(i) > vetor.get(e)) {
                    return false;
                }
            }
        }
    }

    return true;


  }

}