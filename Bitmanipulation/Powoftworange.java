package Bitmanipulation;

import java.util.Scanner;

public class Powoftworange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 1; i <= n; i++) {
            if((i & (i-1))==0){
                System.out.println(i);
            }
        }
        s.close();
    }
}
