import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class strobogramatic_number {
    static boolean strobo(int n){
        String s=String.valueOf(n);
        Map<Character,Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');
        map.put('9','6');
        map.put('6','9');
        int left = 0;
        int right = s.length()-1;
        while(left<=right){
            if(map.containsKey(s.charAt(left)) && map.containsKey(s.charAt(right))){
                if(s.charAt(left)!=map.get(s.charAt(right))){
                    return false;
                }
                else{
                    left++;
                    right--;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(strobo(s));
    }
}
