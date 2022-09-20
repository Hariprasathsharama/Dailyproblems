import java.util.ArrayList;
import java.util.List;

public class Appleorange {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int apcount=0,orcount=0;
         for(int i=0;i<apples.size();i++){
             int pos=apples.get(i)+a;
             if(pos>=s && pos<=t){
                 apcount++;
             }
         }
          for(int i=0;i<oranges.size();i++){
             int pos=oranges.get(i)+b;
             if(pos>=s && pos<=t){
                 orcount++;
             }
         }
         System.out.println(apcount);
           System.out.println(orcount);
        }
        public static void main(String[] args) {
            List<Integer>apples=new ArrayList<>(); 
            apples.add(-2);
            apples.add(2);
            apples.add(1);
            List<Integer>oranges=new ArrayList<>(); 
            oranges.add(5);
            oranges.add(-6);
            int s=7;
            int t=11;
            int a=5;
            int b=15;
            countApplesAndOranges(s, t, a, b, apples, oranges);
        }
}
