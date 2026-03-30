public class NonDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,3,6,5,3};         
        removeDuplicates(arr);
    }
    public static void removeDuplicates(int[] arr){
        int count =0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i]+" ");
            }
            count=0;

                
            }
            
            
        }
    }
        
