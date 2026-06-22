import java.util.*;
public class ternary {
    public static void main(String[] args) {
        System.out.print("enter x , y :");
        Scanner sc = new Scanner (System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();

        int max = x > y ? x : y;

        System.out.println("Max value is: "+ max);
    }
}
