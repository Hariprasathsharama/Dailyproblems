// Staircase detail

// This is a staircase of size :4

//    #
//   ##
//  ###
// ####
// Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

// This is  a program that prints a staircase of size .

public class Pattern {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
