package Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class find_the_union_and_intersection_of_the_two_sorted_arrays {
    public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
        ArrayList<Integer> result=new ArrayList<>();
        HashSet<Integer> union=new HashSet<>();
        HashSet<Integer> intersection=new HashSet<>();
        if(n>m){
            for(int i=0;i<m;i++){
                if(arr1.contains(arr2.get(i))){
                    intersection.add(arr2.get(i));
                }
            }
        }
        else if(m>n){
            for(int i=0;i<n;i++){
                if(arr2.contains(arr1.get(i))){
                    intersection.add(arr1.get(i));
                }
            }
        }
        int intersection_size=intersection.size();
        result.add(intersection_size);
        for(int i=0;i<n;i++){
            union.add(arr1.get(i));
        }
        for(int i=0;i<m;i++){
            union.add(arr2.get(i));
        }
        int union_size=union.size();
        result.add(union_size);
        return result;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        ArrayList<Integer> ARR1=new ArrayList<>();
        ArrayList<Integer> ARR2=new ArrayList<>();
        for(int i=0;i<N;i++){
            ARR1.add(sc.nextInt());
        }
        for(int i=0;i<M;i++){
            ARR2.add(sc.nextInt());
        }
        ArrayList<Integer> response=findSimilarity(ARR1, ARR2, N, M);
        System.out.println(response);
    }
}