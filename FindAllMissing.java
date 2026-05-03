import java.util.*;
class FindAllMissing {
    public static void main(String args[]) {
        int arr[] = {2, 4, 5, 3, 8};
        System.out.println(findAllMissing(arr));
    }
    public static List<Integer> findAllMissing(int arr[]) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for (int num : arr) {
            set.add(num);
            max = Math.max(max, num);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}

#
//by cyclic sort 1 to n
//by hashset 1 to max 
