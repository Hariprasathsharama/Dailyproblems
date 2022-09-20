

public class Minimax {

    
    public static void main(String[] args) {
        int a[]={1,3,5,7,9};
        int n=a.length;
        int b[]=new int[n];
        int k=0;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = 0; j < n; j++) {
               

                if(i!=j){
                    sum+=a[j];
                }
            }
            b[k++]=sum;
        }
        
        int max=0;
        for (int i = 0; i < b.length; i++) {
            if(max<b[i]){
                max=b[i];
            }
        }
    
        int min=b[0];
        for (int i = 0; i < b.length; i++) {
         if(min>b[i]){
             min=b[i];
         }
     }
     System.out.println(min+" "+max);
    }
       }
