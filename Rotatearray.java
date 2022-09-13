import java.util.*;
public class Rotatearray {
    public static void main(String[] args) {
       
        System.out.println("Enter the element of the array");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int first=0,j;
        int []a=new int[n];
       
        System.out.println("Enter element one by one");
     
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        System.out.println("Enter how much to rotate");
        int num=s.nextInt();
        s.close();
        for (int i = 0; i < num; i++) {
            first=a[0];
            for (j = 0; j < a.length-1; j++) {
                a[j]=a[j+1];
                
            }
            a[j]=first;
        }
        for ( j = 0; j < a.length; j++) {
            System.out.print(a[j]);
        }
      
    }
}
