package Bitmanipulation;

import java.util.Scanner;

public class FindMagicno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ans=0,base=5;
        while (n>0) {
            int last=n&1;
            n=n>>1;
            ans+=(last*base);
            base*=5;
        }
        System.out.println(ans);
        s.close();
    }
}
