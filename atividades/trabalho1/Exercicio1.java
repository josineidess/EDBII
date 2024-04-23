
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
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
    
    System.out.println(LocalDateTime.now().toString());
    int encontrou = buscaSequencialIterativa(vetor, valorBuscado);
    System.out.println(LocalDateTime.now().toString());
    System.out.println(encontrou);

    System.out.println(LocalDateTime.now().toString());
    int encontrouRecursivo = buscaSequencialRecursiva(vetor, valorBuscado, 0);
    System.out.println(LocalDateTime.now().toString());
    System.out.println(encontrouRecursivo);
  }

  
  private static int buscaSequencialRecursiva(List<Integer> vetor, int valor, int indice) {
    if(vetor.size() == indice) {
      return -1;
    }
    
    if(vetor.get(indice) == valor) {
      return indice;
    }

    return buscaSequencialRecursiva(vetor, valor, indice + 1);
  }

  private static int buscaSequencialIterativa(List<Integer> vetor, int valor) {
     for(int i = 0; i < vetor.size(); i++) {
       if(vetor.get(i) == valor) {
         return i;
       }
     }
    return -1;
  }
}