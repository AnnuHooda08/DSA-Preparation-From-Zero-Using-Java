import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int n = sc.nextInt();
        System.out.println("table of " + n +" is given below:");
        for(int i = 1; i< 11;i++){
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }
    
}
