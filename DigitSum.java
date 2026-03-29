public class DigitSum {
    public static void main(String args[]){
        System.out.println(DigitS(12343));
    }
    static int DigitS(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+DigitS(n/10);
    }
}
