


import java.util.ArrayList;

import java.util.List;


public class Breakingrecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int highscore=scores.get(0);
        int lowscore=highscore;
        int bestrecord=0;
        int worstrecord=0;
        List<Integer>m=new ArrayList<>();
        for (int i = 1; i <= scores.size()-1; i++) {
           if(scores.get(i)>highscore){
            highscore=scores.get(i);
            bestrecord++;
           }  
           if(scores.get(i)<lowscore){
            lowscore=scores.get(i);

            worstrecord++;
           }
        }
       m.add(bestrecord);
       m.add(worstrecord);
       return m;
        }
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        // 10 5 20 20 4 5 2 25 1
        arr.add(10);
        arr.add(5);
        arr.add(20);
        arr.add(20);
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(25);
        arr.add(1);
    
        System.out.println( breakingRecords(arr));
   

    }
    
}
