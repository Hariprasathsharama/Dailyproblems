public class DivisiblePair {
    public static boolean divisible(int a[]){
        boolean flag=false;

        int k=3;
        int n=a.length;
        for(int i=0;i<a.length/2;i++){
            if ((a[i]+a[n-i-1])%k==0) {
                flag = true;
            }
            else {
                flag=false;
                break;
            }
        }
       if(flag)return  true;
       return false;
    }
    public static void main(String[] args) {
        int a[]={-1,1,-2,2,-3,3,-4,4};

        System.out.println(divisible(a));
    }
}
