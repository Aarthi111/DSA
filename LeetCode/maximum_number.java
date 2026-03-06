import java.util.Scanner;

public class maximum_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=arr[0];
        int count =1;
        for(int i=1;i<arr.length;i++){
            if(count ==0){
                num = arr[i];
            }
            if(arr[i]==num){
                count++;
            }
            else if(arr[i]!=num) {
                count--;
            }

        }
        if(count>0){
            System.out.println(num);
        }

    }
}
