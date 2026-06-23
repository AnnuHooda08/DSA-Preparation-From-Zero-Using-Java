import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter number :");
        int fact = sc.nextInt();
        int res =1;
        for(int i=1;i<=fact;i++){
            res = res*i;
            if(fact == 0){
                System.out.println("1");
            }
        }
        System.err.println("Fctorial of "+ fact +" is: "+res);
    }
}
