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
    int arrayLength=in.nextInt();
    int a[] = new int[10];
    for (int x = 0; x <= (a.length) - 1; x++) {
      a[x] = rNGesus.nextInt(arrayLength);
    }
    System.out.println("The unsorted array is: " + Arrays.toString(a));
    for (int j = 0; j < a.length - 1; j++) {
      int iMin = j;
      for (int i = j + 1; i < a.length; i++) {
        if (a[i] < a[iMin]) {
          iMin = i;
          System.out.println("Progress: " + Arrays.toString(a));
        }
      } // you need another close } here, must close this loop before the if
      if (iMin != j) {
        int tempVar = a[iMin];
        a[iMin] = a[j];// this i needs to j
        a[j] = tempVar;// this line is backwards
      }
    }
    System.out.println("the sorted array is:" + Arrays.toString(a));
  }
}
