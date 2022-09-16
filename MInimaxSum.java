import java.util.Arrays;

public class MInimaxSum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int arr[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            int sum=0,k=0;
            for(int j=0;j<a.length;j++){
                if(i==j){
                    continue;
                }
                else{
                    sum+=a[j];
                    arr[k++]=sum; 
                }
                 
            }
            
        }
       System.out.print( Arrays.toString(arr));
    }
}
