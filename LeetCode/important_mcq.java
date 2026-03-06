import java.io.Console;

public class important_mcq {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int number1 = sc.nextInt();
//        String sentence = sc.nextLine();
//        System.out.println(number1);
//        System.out.println(sentence);

        Console console = System.console();
        System.out.println();
        String a;
        String name = console.readLine("Enter the name");
        System.out.println(name);
    }
}
