import java.util.*;
public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0){
            int digit = n % 10;
            n /=10;
            count++;
        }
        System.out.println("number of digit are : " + count);
        sc.close();
    }
}
