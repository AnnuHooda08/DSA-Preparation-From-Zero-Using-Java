import java.util.*;
public class SteptoReduceNumber1342 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        int step = 0;
        while(num > 0){
            if(num % 2 == 0){
                num /= 2;
            }else{
                num -= 1;
            }
            step++;
        }              
        System.out.println("number of steps are: " + step);
    }
}