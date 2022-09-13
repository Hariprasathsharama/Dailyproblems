package Bitmanipulation;

import java.util.Scanner;

public class Poweroftwo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         if((n &(n-1))==0){
            System.out.println("power of 2");
         }
         else{
            System.out.println("Not a power of 2");
         }
         s.close();
    }
}