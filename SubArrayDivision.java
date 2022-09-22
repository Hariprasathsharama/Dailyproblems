import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
         int n=s.size();int count=0;
         if (n==1) {
            return n;
         }
         else{
         for (int i = 0; i < n-m+1; i++) {
            int sum=0;
            for (int j = 0; j < m; j++) {
                sum=sum+s.get(i+j);
            }
            if(sum==d){
                count++;
            }
         }
        }
         return count;
        }
    public static void main(String[] args) {
       List <Integer>arr=new ArrayList<>();
       arr.add(2);
       arr.add(2);
       arr.add(1);
       arr.add(3);
       arr.add(2);
   
       System.out.println(birthday(arr, 4, 2));
    }
}
