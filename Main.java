import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    int n, temp;
    Random rNGesus = new Random();
    Scanner in = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    n = in.nextInt();
    int a[] = new int[n];
    for (int x = 0; x <= (a.length) - 1; x++) {
      a[x] = rNGesus.nextInt(n);
    }
    Arrays.sort(a);
    System.out.println("ascendo:" + Arrays.toString(a));
    System.out.println("descendo:");
    for (int i = a.length - 1; i >= 0; i--) {
      System.out.print(a[i] + " ");
    }
  }
}