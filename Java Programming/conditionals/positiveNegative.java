import java.util.*;
public class positiveNegative {
    public static void main(String[] args) {
        System.out.print("enter number:");
        Scanner sc = new Scanner (System.in);
        int x;
        x = sc.nextInt();
        if(x>0){
            System.out.println("number is positive");
        }else if(x<0){
            System.out.println("number is negative");
        }else{
            System.out.println("its zero");
        }
    }
}
