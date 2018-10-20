import java.io.*;
class TestClass {
   static  long a[] = new long[1000000];
    public static void main(String args[] ) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        a[0]=1;
        a[1]=2;
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            System.out.println(no_of_days(n));
        }
    }
        public static long no_of_days(int n){
            if(a[n]!=0)
            return a[n];
            a[n] = (no_of_days(n-1)+no_of_days(n-2))%1000000007;
            
            return a[n];
            
    }
       
    }

