//Accepted
package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class rotate_array {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> resp=new ArrayList<>();
        int l=arr.size();
        for(int i=k;i<l;i++){
            resp.add(arr.get(i));
        }
        for(int i=0;i<k;i++){
            resp.add(arr.get(i));
        }
        return resp;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int k=sc.nextInt();
        ArrayList<Integer> al=rotateArray(arr, k);
        for(int r: al){
            System.out.println(r);
        }
    }
}