import java.util.*;
public class billingConsole{
    public static void main(String[] args) {
        System.out.print("Enter cost of 1st item :");
    
        Scanner sc = new Scanner(System.in);
        int item1,item2,item3,item4;

        item1 = sc.nextInt();
        System.out.print("Enter cost of 2nd item :");
        item2 = sc.nextInt();
        System.out.print("Enter cost of 3rd item :");
        item3 = sc.nextInt();
        System.out.print("Enter cost of 4th item :");
        item4 = sc.nextInt();

        int total_cost = item1+item2+item3+item4;
        System.out.println("total cost :" + total_cost);

        double GST = total_cost*0.18;
        System.out.println("total GST :" + GST);

        double total_amount = total_cost + GST;
        System.out.println("Total amount to be paid:"+ total_amount);

    }
}