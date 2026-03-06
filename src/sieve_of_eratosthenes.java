import java.util.Arrays;
import java.util.Scanner;
public class sieve_of_eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        arr[0]=arr[1]=false;
        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i)
                    arr[j] = false;
            }

        }
        for (int i = 0; i < n + 1; i++) {
            if (arr[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}

