//Accepted
package Arrays;
import java.util.*;
public class sum_of_max_and_min {
    public static int sumOfMaxMin(int[] arr, int n) {
        int s=0;
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int min=arr[0];
        s=max+min;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ARR[]=new int[N];
        for(int i=0;i<N;i++){
            ARR[i]=sc.nextInt();
        }
        int resp=sumOfMaxMin(ARR, N);
        System.out.println(resp);
    }
}