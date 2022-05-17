import java.util.*;
public class CheckPrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       boolean isPrime = true;
       
       for(int i=2; i<=n; i++){
           if(n%i==0 && i!=n){
               isPrime =false;
               break;
           }
       }
       if(isPrime){
           System.out.println("Given "+n +" number is prime");
       }
       else{
           System.out.println("Given "+n +" number is not prime");
       }
    }
}   
