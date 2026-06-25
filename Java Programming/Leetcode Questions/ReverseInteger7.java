import java.util.*;
public class ReverseInteger7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number");
        int num = sc.nextInt();
        int ans = 0;
        while (num != 0){
            int digit = num % 10;
            ans = ans*10 + digit;
            if(ans> Integer.MAX_VALUE/10 || ans <Integer.MIN_VALUE/10){
                return ;
            }
            num/=10;    
        }
        System.out.println("reverse of number is: " + ans);
    }
}