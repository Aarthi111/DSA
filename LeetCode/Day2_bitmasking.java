//To turn of a bit - xor
import java.util.Scanner;
public class Day2_bitmasking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=sc.nextInt();
        int onMask = 1<<i;
        {{System.out.println("Hello");}}
        System.out.println(num ^ onMask);
        //32 -> 0 0 1 0 0 0 0 0
        //Task : Turn on 3 rd bit  (i=3)
        //1  -> 0 0 0 0 0 0 0 1
        //1<<3->0 0 0 0 1 0 0 0

        //perform OR operation (32 | 1<<i) = this gives result
        //32 -> 0 0 1 0 0 0 0 0
        //1<<3->0 0 0 0 1 0 0 0
        //-----------------------
        //      0 0 1 0 1 0 0 0
    }
}