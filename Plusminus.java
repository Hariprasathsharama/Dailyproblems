// Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with 6 places after the decimal.

// Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to 10-4 are acceptable.

// Example
// arr[]={1,1,0,-1,-1}
// There are n=5 elements, two positive, two negative and one zero. Their ratios are 2/5=0.400000,2/5=0.400000  and 1/5=0.200000. Results are printed as:

// 0.400000
// 0.400000
// 0.200000




import java.util.ArrayList;
import java.util.List;

public class Plusminus {

        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */
    
        public static void plusMinus(List<Integer> arr) {
          float neg=0,pos=0,zero=0;
          for(int i=0;i<arr.size();i++){
              if(arr.get(i)<0){
                  pos+=1;
                }
              if(arr.get(i)>0){
                  neg+=1;
                }
                if(arr.get(i)==0){
                    zero+=1;
                }
            }
              System.out.printf("%1.6f\n",(neg/arr.size()));      
              System.out.printf("%1.6f\n",(pos/arr.size()));
              
               System.out.printf("%1.6f\n",(zero/arr.size()));
                
         
           }

           public static void main(String[] args) {
             List<Integer> a=new ArrayList<Integer>();
            a.add(1);
            a.add(1);
            a.add(0);
            a.add(-1);
            a.add(-1);
            
             plusMinus(a);
           }
    
    }
    
