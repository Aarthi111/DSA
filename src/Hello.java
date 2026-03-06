import java.io.PrintStream;

public class Hello {
    public static void main(String args[]) throws Exception{
        PrintStream file = new PrintStream("output.txt");
        System.setOut(file);
        System.out.println("Hello PSR");
    }
}
