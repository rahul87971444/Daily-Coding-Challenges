class Solution {
    public int secondHighest(String s) {
       
        int largest=-1;
        int secondlargest=-1;
        for(char ch:s.toCharArray() ){
                if(Character.isDigit(ch)){
                int n=ch-'0';
                if(n>largest){
                    secondlargest=largest;
                    largest=n;
                }
                else if(n>secondlargest && n!=largest){
                    secondlargest=n;
            }}}return secondlargest;
        
        
       
    }
}
