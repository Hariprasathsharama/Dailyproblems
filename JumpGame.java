public class JumpGame {
    public  static boolean canJump(int[] a){
        int temp=a[0];
        int len=a[0];
        int i=0;
        while (true){
            i=a[i];
            if(a[i]==0)return false;
            if(a[i]==a[len-1])return true;
            i=a[i];
        }
    }
    public static void main(String[] args) {
        int a[]={2,3,1,1,4};
        System.out.println(canJump(a));
    }
}
