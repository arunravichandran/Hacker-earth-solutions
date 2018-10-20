import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int count =0;
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                int temp =a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                count++;
            }
        }
    }
    System.out.print(count);
    }
}