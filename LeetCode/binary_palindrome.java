import java.util.Scanner;

public class binary_palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int og = n;
        int rev=0;
        while(n>0){
            rev = (rev<<1) | (n&1);
            n = n>>1;
        }
        if(rev == og){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
