public class unit_digit_sort {
    public static void main(String[] args) {
        int[] arr = {21,74,75,16,18,33,72,90};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int n1 = arr[i]%10, n2=arr[j]%10;
                if(n1>n2){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
