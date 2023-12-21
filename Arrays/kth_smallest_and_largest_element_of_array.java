//Accepted
package Arrays;
import java.util.*;
public class kth_smallest_and_largest_element_of_array {
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        Collections.sort(arr);
        al.add(arr.get(k-1));
        al.add(arr.get(n-k+1-1));
        return al;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        ArrayList<Integer> ARR=new ArrayList<>();
        for(int i=0;i<N;i++){
            ARR.add(sc.nextInt());
        }
        ArrayList<Integer> resp=kthSmallLarge(ARR,N,K);
        for(int x: resp){
            System.out.println(x);
        }
    }
}