// Given a square matrix, calculate the absolute difference between the sums of its diagonals.

// For example, the square matrix  is shown below:

// 1 2 3
// 4 5 6
// 9 8 9  
// The left-to-right diagonal 1+5+9=15 . The right to left diagonal 3+5+9=17 . Their absolute difference is |15-17|=2.


public class Diagonalsum {
   
    public static int diagonalDifference(int[][] arr){
        int ltor=0,rtol=0;
        int len=arr.length;
        System.out.println(arr.length);
        for (int index = 0; index < arr.length; index++) {
            ltor+=arr[index][index];
        }
        for(int i=0;i<arr[0].length;i++){
            int s=len-i-1;
             rtol+=arr[i][s];
        }
        int res=rtol-ltor;
        return res;
    
    }
public static void main(String[] args) {
    int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
            };
       
    System.out.println(diagonalDifference(arr));
}
}
