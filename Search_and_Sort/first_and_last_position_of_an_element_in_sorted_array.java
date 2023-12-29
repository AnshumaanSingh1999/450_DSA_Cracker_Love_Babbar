//Partially Accepted
package Search_and_Sort;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class first_and_last_position_of_an_element_in_sorted_array {
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int fp=-1;
        int lp=-1;
        if(arr.contains(k)){
            fp=arr.indexOf(k);
            lp=arr.lastIndexOf(k);
        }
        // HashMap<Integer, Integer> hp=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     if(k==arr.get(i)){
        //         if(hp.isEmpty()){
        //             hp.put(k, i);
        //             fp=i;
        //         }
        //         else if(hp.isEmpty()==false){
        //             hp.put(k, i);
        //         }
        //     }
        // }
        // if(hp.containsKey(k)){
        //     lp=hp.get(k);
        // } 
        int resp[]={fp,lp};
        return resp;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();        
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int r[]=firstAndLastPosition(arr, n, k);
        for(int x:r){
            System.out.println(x);
        }
    }
}