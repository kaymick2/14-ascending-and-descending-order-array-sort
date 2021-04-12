import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * This program demonstrates the linear search algorithm.
 */
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random rNGesus = new Random();
    System.out.println("enter array length here:");
    int n = in.nextInt();
    int a[] = new int[n];
    for (int x = 0; x <= (a.length) - 1; x++) {
      a[x] = rNGesus.nextInt(70);
    }
    System.out.println("The unsorted array is: " + Arrays.toString(a));
    Arrays.sort(a);
    System.out.println("the sorted array is:");
    System.out.println("ascending order: "+ Arrays.toString(a));
    System.out.print("descending order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
  }
}
