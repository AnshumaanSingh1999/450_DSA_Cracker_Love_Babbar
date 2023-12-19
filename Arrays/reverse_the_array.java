//Accepted
package Arrays;
import java.util.*;
class reverse_the_array {
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int l=arr.size();
        ArrayList<Integer> nw=new ArrayList<>();
        for(int i=0;i<=m;i++){
            nw.add(arr.get(i));
        }
        for(int i=l-1;i>m;i--){
            nw.add(arr.get(i));
        }
        arr.clear();
        for(int i=0;i<nw.size();i++){
            arr.add(nw.get(i));
        }
        // System.out.println(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ARR=new ArrayList<>();
        int N=sc.nextInt();
        int M=sc.nextInt();
        for(int i=0;i<N;i++){
            ARR.add(sc.nextInt());
        }
        reverseArray(ARR, M);
    }   
}