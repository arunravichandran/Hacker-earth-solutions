import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean result= true;
        int n = sc.nextInt();
        int[] v = new int[n];
        int[] m = new int[n];
        for(int i=0;i<n;i++)
          v[i] = sc.nextInt();
          for(int i=0;i<n;i++){
              m[i] = sc.nextInt();
              if(v[i]<m[i]){
                  result = false;
                  break;
              }
          }
          if(result)
          System.out.print("Yes");
          else
          System.out.print("No");
          
    }
}
