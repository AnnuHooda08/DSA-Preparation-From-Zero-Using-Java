import java.util.*;
public class  ProductSum1281{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        int res;
        while(n>0){
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n/=10;
        }

        res = product - sum;
        System.out.println("result is : "+ res);
        sc.close();
    }
}
