package Bitmanipulation;

import java.util.Scanner;

public class Finddigitinbit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=10110110;
        System.out.println(n & (1<<(n-1)));
        s.close();
    }
}
