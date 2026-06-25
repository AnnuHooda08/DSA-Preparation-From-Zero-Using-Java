import java.util.*;
public class Palindrome9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0 ;
        while(num>0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num /= 10;
        }
         if(reverse == original){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }        
    }   
}
