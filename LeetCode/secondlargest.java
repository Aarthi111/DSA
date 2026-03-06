public class secondlargest {
    public static void main(String[] args) {
        int[] nums={53,46,34,97,97,-83,46};
        int max=nums[0];
        int sec = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                sec=max;
                max=nums[i];
            }
            else if(nums[i]>sec && nums[i]!=max){
                sec = nums[i];
            }
        }
        if(sec==Integer.MIN_VALUE){
            System.out.println("No second largest element");
        }
        System.out.println(sec);
        
    }
}