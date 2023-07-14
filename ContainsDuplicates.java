import java.util.*;

class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
     if(nums.length==1) return false;
     else{
     Arrays.sort(nums);
     
     for(int i=0;i<nums.length-1;i++){
         if(nums[i] == nums[i+1])
         {
            return true;
         }
     }
     return false;
    }
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            System.out.println(containsDuplicate(nums));
        }
    }
}