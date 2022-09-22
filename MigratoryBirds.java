import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        int n=arr.size();
        int count[]=new int[n+1];
        for (int i = 0; i < arr.size(); i++) {
            count[i]=0;
        }
        for (int i = 0; i < n; i++) {
            count[arr.get(i)]++;
        }
        int max=0,ans=0;
        for (int i = 0; i < n+1; i++) {
            if(count[i]>max){
                max=count[i];
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        List <Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        
        System.out.println(migratoryBirds(arr));
    }
}
