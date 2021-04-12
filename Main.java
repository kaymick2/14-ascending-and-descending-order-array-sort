import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args) 
    {
        int n, temp;
        Random rNGesus=new Random();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
    for (int x = 0; x <= (a.length) - 1; x++) {
      a[x] = rNGesus.nextInt(n);
    }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}