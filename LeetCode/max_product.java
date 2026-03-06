import java.util.Scanner;

public class max_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        int Smax = nums[0],max=nums[0],min=nums[0],temp=0;
        for(int i=1;i<n;i++){

            if(nums[i]<0){
                temp = max;
                max=min;
                min=temp;
            }
            max = Math.max(nums[i],max * nums[i]);
            min = Math.min(nums[i],min* nums[i]);
            Smax = Math.max(Smax,max);
//            if(nums[i]>0){
//                max=Math.max(nums[i],max*nums[i]);
//                min=Math.max(nums[i],min*nums[i]);
//            }
//            else if(nums[i]==0){
//                max=0;
//                min=0;
//            }
//            else{
//                temp=max;
//                max=Math.max(nums[i],min*nums[i]);
//                min=Math.min(nums[i],max*nums[i]);
//            }
            Smax = Math.max(Smax,max);
        }
        System.out.println(Smax);
    }
}
