import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class First_Nonrepeating {
   static int FirstNonRepeatingChar(String s){
       Map<Character,Integer> map = new LinkedHashMap<>();
       for(int i=0;i<s.length();i++){
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }
       System.out.println(map);
       int count=0;
       for(Map.Entry<Character,Integer> entry :map.entrySet()){
           if(entry.getValue()==1) return s.indexOf(entry.getKey());
       }

       return -1;
   }
    public static void main(String[] args) {
        System.out.println(FirstNonRepeatingChar("ApppppxpleA"));
    }
}
