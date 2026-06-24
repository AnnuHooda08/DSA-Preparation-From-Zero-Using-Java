import java.util.*;
public class CountDigitDivide2520{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        int n = num;
        int count = 0;
        while(n>0){
            int digit = n % 10;
            if(num % digit == 0){
                count++;
            }
            n/=10;
        }
        System.out.println("count of digit is : "+count);
        sc.close();
    }
}