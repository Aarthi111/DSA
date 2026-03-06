
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class shared{
    public static void main(String[] args) throws Exception{
//        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
//        PrintStream file = new PrintStream("output.txt");
//        System.setOut(file);
//        System.out.println("hello psr");
//        String result =buffer.toString();
//        System.err.println("capture:"+result);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number1=sc.nextInt();
        sc.next();
        String sentence = sc.nextLine();
        System.out.println(number1);
        System.out.println(sentence);
    }
}