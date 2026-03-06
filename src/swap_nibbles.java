import java.util.Scanner;

public class swap_nibbles {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((n&240)>>4 | (n& 15)<<4);
        //System.out.println((n&0xF0)>>4 | (n& 0x0F)<<4);
        //240 = 0xF0 , 15 = 0x0F
        //F0 means four 1's then four 0's ==> 11110000
    }
}
