import java.util.ArrayList;
import java.util.Arrays;

public class mergesorted4 {
    static ArrayList<Integer> logic2(ArrayList<Integer> arr1,ArrayList<Integer> arr2){

        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        int j=0;

        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<arr2.get(j)){
                res.add(arr1.get(i));
                i++;
            }
            else{
                res.add(arr2.get(j));
                j++;
            }
        }
        while(i < arr1.size()){
            res.add(arr1.get(i++));
        }

        while(j < arr2.size()){
            res.add(arr2.get(j++));
        }
        return res;

    }
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,3,5));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(3,4,6));
        System.out.println(logic2(arr1,arr2));

    }
}
