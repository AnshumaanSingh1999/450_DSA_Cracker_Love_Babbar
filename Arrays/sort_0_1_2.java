//Accepted
package Arrays;
import java.util.Scanner;
public class sort_0_1_2 {
    public static void sort012(int[] arr)
    {
        int n=arr.length;
        int c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c0++;
            }
            else if(arr[i]==1){
                c1++;
            }
            else if(arr[i]==2){
                c2++;
            }
        }
        int i=0;
        while (i<n) {
            if(i<c0){
                arr[i]=0;
            }
            else if(i>=c0 && i<c0+c1){
                arr[i]=1;
            }
            else if(i>=c0+c1 && i<c0+c1+c2){
                arr[i]=2;
            }
            i++;  
        }
        // for(int x:arr){
        //     System.out.println(x);
        // }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ARR[]=new int[N];
        for(int i=0;i<N;i++){
            ARR[i]=sc.nextInt();
        }
        sort012(ARR);
    }
}