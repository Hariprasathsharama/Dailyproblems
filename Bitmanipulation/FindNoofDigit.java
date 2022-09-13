package Bitmanipulation;

import java.util.Scanner;

public class FindNoofDigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int baseno=s.nextInt();
        System.out.println((int)(Math.log(n)/Math.log(baseno))+1);  
        s.close(); 
    }
}
