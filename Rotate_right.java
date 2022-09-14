import java.util.Arrays;

public class Rotate_right {
    public static void rotate(int[] nums, int k) {
        int len=nums.length;
          int b[]=new int[len];
         int index=len-k,j=0;
          for (int i = 0; i < index; i++) {
             b[j++]=nums[index-i-1];
         }
         for (int i = 0; i <k; i++) {
             b[j++]=nums[len-i-1];
         }        
          for (int i = 0; i < b.length; i++) {
             nums[i]=(b[len-i-1]);
         }
         System.out.print(Arrays.toString(nums));
     }
     public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        rotate(a,2);
     }    
 }

