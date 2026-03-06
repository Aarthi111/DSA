public class BubbleSort {
    static void bubble(int[] a){
        int n= a.length;
        for(int i=0;i<n-1;i++){
            boolean swap = false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {23,45,2,67,4,21,7};
        bubble(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
