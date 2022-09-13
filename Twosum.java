import java.util.*;

public class Twosum{
            class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map <Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer no=(Integer)(target-nums[i]);
            if(m.containsKey(no)){
                   int retno[]={m.get(no),i};
                    return retno;
            }
            m.put(nums[i],i);
        }
        return null;
        
    }
} 
}
    

