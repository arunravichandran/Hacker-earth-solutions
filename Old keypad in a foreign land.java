import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     Scanner sc = new Scanner(System.in);
     int sum =0;
     int factor =0;
     int temp;
     int f = sc.nextInt();
     int[] freq = new int[f];
     for(int i =0;i<f;i++)
     freq[i] = sc.nextInt();
     int n = sc.nextInt();
     long maxKeys = 0;
     int[] keys = new int[n];
     for(int i=0;i<n;i++){
         keys[i] = sc.nextInt();
         maxKeys+=keys[i];
     }
     Arrays.sort(freq);
     if(maxKeys < f)
     System.out.println(-1);
     else{
     for(int i =f-1;i>=0;){
         factor++;
         temp=0;
         for(int j=0;j<n;j++){
             if(keys[j]>=factor){
                 temp+=freq[i];
                 i--;
             }
            if(i<0)
            break;
         }
         sum+=factor*temp;
     }
     System.out.print(sum);
     }
    }
}
