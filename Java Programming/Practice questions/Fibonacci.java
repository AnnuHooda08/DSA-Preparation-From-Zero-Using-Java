import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter number :");
        int n = sc.nextInt();

        int secondLast = 0;
        int Last = 1;
        for(int i = 0 ; i <= n-1; i++){
            int current = secondLast + Last;
            secondLast = Last;
            Last = current;
        }
        System.out.println(n+"term of fibonacci is : " + Last);
    }
}
