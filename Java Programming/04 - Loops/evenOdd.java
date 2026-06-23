import java.util.*;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number of integer you want to know about:");

        int a = sc.nextInt();

        while (a>0){
            System.out.println("enter number:");

            int num = sc.nextInt();
            if(num % 2 == 0){
                System.out.println("number is even");
            }else{
                System.out.println("number is odd");
            }
            a--;
        }
    }
}
