public class DigitProduct {
    public static void main(String args[]){
        System.out.println(DigitP(232));
    }
    static int DigitP(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*DigitP(n/10);
    }
}
