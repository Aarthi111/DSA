import java.util.Scanner;

public class on_or_off {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = sc.nextInt();
        int onMask = 1 << i;
        int result = num & onMask;
        if (result == 0)
            System.out.println("OFF");
        else
            System.out.println("ON");
    }
}
