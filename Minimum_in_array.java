class Minimum{
    public static void main (String args[]){
        int arr[]={7,4,5,6};
        System.out.println(min(arr));
    }
    static int min(int arr[]){
        int minimum=arr[0];
        if(arr.length==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            if(minimum>arr[i]){
                minimum=arr[i];
                
            }
           
        }
    return minimum; 
        
    }
}
