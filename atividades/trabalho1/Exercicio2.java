
import java.util.ArrayList;
import java.util.List;import java.util.Scanner;
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

    System.out.printf("Valor buscado: ");
    int valorBuscado = scan.nextInt();

    int indiceEncontrado = buscaBinariaRecursiva(vetor, valorBuscado);
    System.out.println("indice"+ indiceEncontrado);
  }


  private static int buscaBinariaIterativa(List<Integer> vetor, int valorProcurado) {
    int inicio = 0;
    int fim = vetor.size() - 1;
    int meio;

    while (inicio <= fim) {
      meio = (inicio + fim) / 2;

      if (vetor.get(meio) == valorProcurado) {
        return meio;
      } else if (vetor.get(meio) < valorProcurado) {
        inicio = meio + 1;
      } else {
        fim = meio - 1;
      }
    }

    return -1;
  }

   private static int buscaBinariaRecursiva(List<Integer> vetor, int valorProcurado) {
    int inicio = 0;
    int fim = vetor.size() - 1;

    if (fim < inicio) {
        return -1;
    }

    int meio = (inicio + fim) / 2; 
    int valorMeio = vetor.get(meio); 

    if (valorMeio == valorProcurado) {
        return valorMeio; 
    } else {
        if (valorMeio > valorProcurado) {
            return buscaBinariaRecursiva(vetor.subList(inicio, meio), valorProcurado);
        } else {
            return buscaBinariaRecursiva(vetor.subList(meio + 1, fim + 1), valorProcurado);
        }
    }
}


}