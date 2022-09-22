import java.util.ArrayList;
import java.util.List;

public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int sum=0,sharedbill=0;
       
        for (int i = 0; i < bill.size(); i++) {
            if(bill.get(i)!=k){
                sum+=bill.get(i);
            }
        }
        sharedbill=sum/(bill.size()-1);
        int result=sharedbill-b;
        if(result==0){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(sharedbill);
        }
    }
        public static void main(String[] args) {
         ArrayList<Integer>a=new ArrayList<>();
         a.add(3);
         a.add(10);
         a.add(2);
         a.add(9);
        bonAppetit(a, 10, a.size());
        }
}
