import java.util.*;
class TestClass {
     static long factorial[]  = new long[10000000];;
    public static void main(String args[] ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    
    while(t-->0){
        int n = sc.nextInt();
        
        factorial[0] =1;
        System.out.println(fac(n));
    }
    }
    public static long fac(int n){
             
                if(factorial[n]==0)
                factorial[n] = (n*fac(n-1))%1000000007;
                 return factorial[n];
                  }
}
