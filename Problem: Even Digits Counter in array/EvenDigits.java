class EvenDigits {
    public static void main (String args[]){
        int nums[]={22,44,346,4532};
        System.out.println(findnums(nums));
    }    
    public static int findnums(int nums[]){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }return count;
    }
    public static boolean even(int num){
        int numofdigits=digits(num);
        return numofdigits%2==0;
    }
    public static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }return count;
    }    
}
