public class InsertionSort {
    public static void main(String[] args) {
        int[] a={23,34,6,45,22,7};
        insertion_sort(a);
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
    static void insertion_sort(int[] a) {
        int n=a.length;
        for(int i=1;i<n;i++){
            int pivot = a[i];
            int j=i-1;
            while(j>=0 &&a[j]>pivot ){
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=pivot;
        }
    }
}
