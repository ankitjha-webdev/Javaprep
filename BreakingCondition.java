import java.util.*;
public class BreakingCondition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0; i<=n; i++){
            if(n%5==0){
                System.out.println(n + " is divisible by 5");
                System.out.println("Please enter another number");
                break;
            }
        }
    }
}
