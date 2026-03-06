import java.util.Scanner;

public class decimaltobinary {
    static int convertBinaryToDecimal(String num){
        int power=0;
        int number = 0;
        for(int i=num.length()-1; i>=0; i--){
            //char s=num.charAt(i);
            //int n = Integer.valueOf(s);
            int n = Character.getNumericValue(num.charAt(i));

            number += n* Math.pow(2,power);
            power++;
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num=sc.nextLine();
        int result = convertBinaryToDecimal(num);
        System.out.println(result);
    }
}
