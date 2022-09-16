
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
        {9},
       { 6 ,6, 7, -10 ,9 ,-3, 8, 9 ,-1},
       {9 ,7 ,-10 ,6 ,4 ,1 ,6 ,1 ,1},
        {-1, -2, 4 ,-6 ,1 ,-4, -6 ,3 ,9},
            {-8 ,7 ,6 ,-1 ,-6 ,-6 ,6 ,-7 ,2},
                {-10 ,-4, 9, 1 ,-7, 8 ,-5, 3, -5},
                    {-8 ,-3 ,-4 ,2 ,-3 ,7 ,-5 ,1 ,-5},
                        {-2, -7, -4, 8 ,3, -1, 8, 2, 3},
                            {-3 ,4 ,6 ,-7 ,-7 ,-8 ,-3 ,9 ,-6},
                                {-2 ,0 ,5, 4, 4, 4 ,-3, 3 ,0}
            };
       
    System.out.println(diagonalDifference(arr));
}
}
