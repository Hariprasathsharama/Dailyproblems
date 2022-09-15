import java.util.List;

public class Diagonalsum {
    public static int diagonalDifference(List<List<Integer>> arr){
        int ltor=0,rtol=0;
        int size=arr.get(0).size();
        for(int i=0;i<size;i++){
            int len=size-i-1;
            for(int j=0;j<size;i++){
                if(i==j){
                    ltor+=arr.get(i).get(j);
                }
                if(j==len){
                       rtol+=arr.get(i).get(j);
                }
            }
            
        }
        return ltor-rtol;
}
}
