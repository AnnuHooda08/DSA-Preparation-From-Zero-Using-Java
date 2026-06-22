import java.util.*;
public class average {
    public static void main(String[] args) {
        System.out.print("enter value:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        double avg = (x+y+z)/3.0;
        System.out.println("value of avg is:" + avg);
    }
}