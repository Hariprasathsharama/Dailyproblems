


    public class Numberjump{
    public static  String Number(int x1,int v1,int x2,int v2) {
        
        for (int i = 0; i < 10000; i++) {
            x1+=v1;
            x2+=v2;
            if (x1==x2) {
               return "YES";
            }
    
        }
        return "No";
    }
    public static void main(String[] args) {
        int x1=0;
        int v1=3;
        int x2=4,v2=2;
       
        System.out.println( Number(x1, v1, x2, v2));
}
}