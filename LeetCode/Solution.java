import java.util.HashSet;
import java.util.Set;

public  class Solution {

        static Set<Integer> set = new HashSet<>();
        public static boolean number(int n){

            int num = 0;
            while(n!=1 && set.contains(n)){
                set.add(n);
                int res=0;
                int last = n%10;
                num += last* last;
                n=n/10;
            }
            if(num==1) return true;
            else if(set.contains(num)){
                return false;
            }
            else {
                set.add(num);
                System.out.println(num);
                number(num);
            }
            return true;
        }
        public static boolean isHappy(int n) {

            boolean n1=number(n);
            return n1;

        }
    public static void main(String []args){
        System.out.println(isHappy(2));
    }
    }

