import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int x=a,y=b;
        while(y!=0){
            int t=y;
            y=x%y;
            x=t;
        }
        int lcm=(a*b)/x;
        System.out.println(lcm);
    }
}
