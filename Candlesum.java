import java.util.ArrayList;

import java.util.Collections;

import java.util.List;


public class Candlesum {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        int a[]={4,4,1,3};
        for(int i :a){
            list.add(i);
        }
        int max=Collections.max(list);
        
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (max==list.get(i)) {
                count++;
            }
        }
        System.out.println(count);

    }
}
