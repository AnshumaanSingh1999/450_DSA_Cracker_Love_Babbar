//Partially Accepted
package Arrays;
import java.util.*;
public class median_of_two_sorted_arrays {
    public static double median(int[] a, int[] b) {
    	int n=a.length;
        int m=b.length;
        double median=0;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(a[i]);
        }
        for(int i=0;i<m;i++){
            ar.add(b[i]);
        }
        Collections.sort(ar);
        if(ar.size()%2!=0){
            int medi=ar.size()/2;
            median=ar.get(medi);
        }
        else if(ar.size()%2==0){
            int ui=ar.size()/2;
            int li=ui-1;
            double sum=ar.get(ui)+ar.get(li);
            median=sum/2;
        }
        return median;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        double resp=median(a, b);
        System.out.println(resp);
    }
}