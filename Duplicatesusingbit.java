import java.util.Scanner;

public class Duplicatesusingbit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int e=0;
        for (int i = 0; i < a.length; i++) {
            a[i]=s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {


            int k=0;
            for (int j = i+1; j < a.length; j++) {
                if((a[i]^a[j])==0){
                    k=1;
                    break;
                }
                
            }
            if(k==0){
                a[e++]=a[i];
            }
        }
        for (int i = 0; i < e; i++) {
            System.out.print(a[i]);
        }
        
       
        s.close();
    }
}
