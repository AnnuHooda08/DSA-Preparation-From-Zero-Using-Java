import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter number : ");
        int num = sc.nextInt();
        int factor_count = 0;

        for(int i=2;i<=num;i++){
            if(num%i==0){
                factor_count++;
            }   
        }

        if(factor_count == 2){
            System.out.println("the given number is prime");
        }else{
            System.out.println("number is not prime");
        }
    }
}
