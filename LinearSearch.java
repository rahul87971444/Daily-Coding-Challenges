class LinearSearch{
    public static void main (String args[]){
        int arr[]={3,4,1,5,6};
        int target=6;
        System.out.println(LinSearch(arr,target));
    }
    static int LinSearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
    return -1;
        
    }
}
