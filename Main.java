import java.util.Arrays;
import java.util.Scanner;

/**
 * This program demonstrates the linear search algorithm.
 */
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random rNGesus = new Random();
    System.out.println("enter array length here:");
    int arrayLength = in.nextInt();
    int a[] = new int[10];
    for (int x = 0; x <= (a.length) - 1; x++) {
      a[x] = rNGesus.nextInt(arrayLength);
    }
    System.out.println("The unsorted array is: " + Arrays.toString(a));
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] < a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    System.out.println("the sorted array is:" + Arrays.toString(a));
  }
}
