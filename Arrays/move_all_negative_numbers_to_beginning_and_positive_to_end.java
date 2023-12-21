//Accepted
package Arrays;
import java.util.*;
public class move_all_negative_numbers_to_beginning_and_positive_to_end {
    public static int[] separateNegativeAndPositive(int a[]) {
        int r[]=new int[a.length];
        int k=0;
        int neg_count=0;
        int pos_count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                neg_count++;
            }
            else if(a[i]>=0){
                pos_count++;
            }
        }    
        int pos[]=new int[pos_count];
        int neg[]=new int[neg_count];
        int m=0,n=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                neg[m]=a[i];
                m++;
            }
            else if(a[i]>=0){
                pos[n]=a[i];
                n++;
            }
        }    
        for(int nege:neg){
            r[k]=nege;
            k++;
        }
        for(int pose:pos){
            r[k]=pose;
            k++;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ARR[]=new int[N];
        for(int i=0;i<N;i++){
            ARR[i]=sc.nextInt();
        }
        int resp[]=separateNegativeAndPositive(ARR);
        for(int x: resp){
            System.out.println(x);
        }
    }
}