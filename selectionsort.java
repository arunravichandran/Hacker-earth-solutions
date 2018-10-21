import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        a[i] = sc.nextInt();
     
        for(int i=0;i<t-1;i++){
               int minimum=i;
               for(int j=i+1;j<n;j++){
                   if(a[j]<a[minimum])
                   minimum = j;
               }
               int temp = a[i];
               a[i] = a[minimum];
               a[minimum] = temp;
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
  
}
}
