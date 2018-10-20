import java.util.*;
class TestClass {
   static  long[] a;
    static int m ;
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
         a = new long[n];
        long ans =0;
        long l =0,r=0;;
        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();
            if(a[i]>l) 
            l=a[i];
            r = r+a[i];
        }
        while(l<=r){
            long mid = l+(r-l)/2;
            if(solve(mid)){
                ans = mid;
                r = mid-1;
            }
            else
            l= mid+1;
        }
        System.out.print(ans);
        
        
    }
    public static boolean solve(long mid){
        long requireddays = 1;
        long temp=mid;
        boolean ans = false;
        for(long l:a){
            if(temp>=l)
             temp-=l;
             else{
                 requireddays++;
                 temp=mid;
                 temp-=l;
             }
        }
     if(requireddays<=m) ans = true;
     return ans;
    }
}
