import java.util.*;

public class hashset {
    public static void main(String args[]){
        int arr[]={2,4,1,3,5,8};
        System.out.println(firstmissing(arr));
    }
    
    public static ArrayList<Integer> firstmissing(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int max=arr[0];
        for(int num:arr){
            set.add(num);
            if(num>max){
                max=num;
            }
        }
        for(int i=1;i<max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;

    }

    
}
