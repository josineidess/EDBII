import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.printf("Fibo de: ");
    int n = scan.nextInt();

    System.out.println(fibo(n));
    System.out.println(fiboRecursivo(n));
  }

  private static int fibo(int n) {
      //1 1 2 3 5 ...
      if(n <= 1) {
          return 1;
      }

      int cont = n;
      int antipenultimo = 0;
      int penultimo = 1;
      int sequ = 1;

      while(cont > 1) {
         antipenultimo = penultimo;
         penultimo = sequ;
         sequ = antipenultimo + penultimo;
         cont--;
      }

      return sequ;
  }

  private static int fiboRecursivo(int n) {

     if(n <= 1) {
         return 1;
     }

     return fiboRecursivo(n - 1) + fiboRecursivo(n - 2);
  }
}