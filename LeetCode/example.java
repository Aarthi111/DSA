import java.util.ArrayList;
import java.util.Arrays;

public class example {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,3,5));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2,6,7,6,7,8));
        ArrayList<Integer> res = new ArrayList<>();
        res.addAll(0,b);
        System.out.println(res);
    }
}
