import java.util.*;
public class optimizedprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter number : ");
        int num = sc.nextInt();

        boolean isPrime = true;
        if(num == 1){
            System.out.println("number is neither prime not composite");
        }    
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime == true){
            System.out.println("this number is prime ");
        }else{
            System.out.println("number is not prime ");
        }
    }
}
