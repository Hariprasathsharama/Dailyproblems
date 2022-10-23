import java.util.ArrayList;
import java.util.List;

public class MaximumThreeproduct {
    public static int maximum(int a[]){
    int n=a.length;int max=0;
    List<Integer>result=new ArrayList<>();
    int sum=0;
        List<Integer>arr=new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            sum=a[i];
            for (int j = i+1; j < n; j++) {
                    sum=sum*a[j];

            }
            result.add(sum);

        }
        for (Integer i:
             result) {

            if(i>max){
                max=i;
            }
            else{
                return i;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int a[]={-1,-2,-3};
        System.out.println(maximum(a));
    }
}
