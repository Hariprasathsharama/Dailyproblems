import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DivisibleSumPairs {
  
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
            // Map<Integer,Integer>m=new HashMap<>();
            int paircount=0;
            for (int i = 0; i < n; i++) {
             for (int j = i+1; j < n; j++) {
                  if((ar.get(i)+ar.get(j))%k==0 ){
                    paircount++;
                  }
             }   
            }
            return paircount;
        }
        public static void main(String[] args) {
            List <Integer>arr=new ArrayList<>();
       arr.add(1);
       arr.add(2);
       arr.add(3);
       arr.add(4);
       arr.add(5);
       arr.add(6);
       System.out.println(divisibleSumPairs(arr.size(), 3, arr));
        }  
}
