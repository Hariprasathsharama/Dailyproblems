import java.util.ArrayList;
import java.util.List;

/*
         * Complete the 'aVeryBigSum' function below.
         *
         * The function is expected to return a LONG_INTEGER.
         * The function accepts LONG_INTEGER_ARRAY ar as parameter.
         */
public class Bigsum {
    
      
    
        public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
         long sum = 0;
        
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        
        return sum;
        }
        public static void main(String[] args) {
            List<Long>a=new ArrayList<Long>();
            a.add((long) 1000000001);
            a.add((long) 1000000002);
            a.add((long)1000000003);
            a.add((long)1000000004);
            a.add((long)1000000005);
            
            System.out.println(aVeryBigSum(a));
        }
    }
