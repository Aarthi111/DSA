import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    static Map<Integer,Integer> freq(int[] a){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i], map.getOrDefault(a[i],0)+1);
        }
        return map;
    }

    public static void main(String[] args) {

    }
}
