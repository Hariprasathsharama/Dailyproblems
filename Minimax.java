// Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
// Then print the respective minimum and maximum values as a single line of two space-separated long integers.

// Sum everything except 1, the sum is 2+3+4+5=14 .
// Sum everything except 2, the sum is 1+3+4+5=13.
// Sum everything except 3, the sum is 1+2+4+5=12.
// Sum everything except 4 , the sum is 1+2+3+5=11.
// Sum everything except 5 , the sum is 1+2+3+4=10.

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
