public class leaders_in_array {
    static void leader(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(arr[i] + " ");

            }
        }
    }
    public static void main(String[] args){
        int arr1[] = {2,45,16,3,6,7,1,0};
        int arr[] = {10,4,3,6,7,2};
        leader(arr);

    }
}
