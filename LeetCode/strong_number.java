import java.util.Scanner;

public class strong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fact =1;
        int sum=0;
        while(n>=1){
            int i=n%10;
            for(int j=1;j<=i;j++) {
                fact *= j;
            }
            sum+=fact;
            n=n/10;
        }
        System.out.println(sum);
    }
}
