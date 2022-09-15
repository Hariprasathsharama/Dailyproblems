import java.util.Arrays;

public class Rotateusingsingleloop {
    
        public static void rotate(int[] nums, int k) {
            
      int n = nums.length;
            int a[] = nums.clone();
            int i=0,j=0;
            if( k > n){
                k = k%n;
            }
            while(i<n){
                if(k != 0){
                    nums[i] = a[n-k];
                    i++;
                    k--;
                }else{
                    nums[i] = a[j];
                    i++;
                    j++;
                }
        
    }
     System.out.print(Arrays.toString(a));       
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=3;
         rotate(a,k); 
     }
}
