
public class Palindromearray {
    public static int palinArray(int[] a, int n)
    {
           //add code here.
         int flag=0;
         
           for(int i=0;i<n;i++){
               
                int r=0, sum = 0;
                
                int temp=a[i];
                 while(a[i]>0){
                   r=a[i]%10;
                   sum=(sum*10)+r;
                   a[i]=a[i]/10;
               }
               if(sum==temp){
                   flag=1;
                   
               }
               else{
                   flag=0;
                   break;
             
           }
           }
           return flag;
         
    }    
    public static void main(String[] args) {
        int a[]={111,222,333,444,555};
        int n=a.length;
        System.out.println(palinArray(a, n));
        
        
    }
}
