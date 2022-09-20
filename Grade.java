import java.util.ArrayList;
import java.util.List;

public class Grade {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        int temp,test;
        int n=grades.size();
        for(int i=0; i<n; i++){
        test = grades.get(i);
        if(test>37 && (test%5)>2){
            temp = grades.get(i);
            temp += (5-temp%5);
            grades.remove(i); 
            grades.add(i, temp);
    
        }
    }
    return grades;
        
    }
    public static void main(String[] args) {
      List<Integer>grades=new ArrayList<>();
      grades.add(73);
      grades.add(67);
      grades.add(38);
      grades.add(33);
     
      System.out.println( gradingStudents(grades));



    }
}
