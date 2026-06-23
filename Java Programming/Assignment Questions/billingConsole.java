import java.util.*;

public class billingConsole {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of Item 1: ");
        String item1Name = sc.nextLine();
        System.out.print("Enter price of Item 1: ");
        double item1Price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter name of Item 2: ");
        String item2Name = sc.nextLine();
        System.out.print("Enter price of Item 2: ");
        double item2Price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter name of Item 3: ");
        String item3Name = sc.nextLine();
        System.out.print("Enter price of Item 3: ");
        double item3Price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter name of Item 4: ");
        String item4Name = sc.nextLine();
        System.out.print("Enter price of Item 4: ");
        double item4Price = sc.nextDouble();

        double subtotal = item1Price + item2Price + item3Price + item4Price;
        double gst = subtotal * 0.18;
        double totalAmount = subtotal + gst;

        System.out.println("\n========== BILL ==========");
        System.out.println(item1Name + " : " + item1Price);
        System.out.println(item2Name + " : " + item2Price);
        System.out.println(item3Name + " : " + item3Price);
        System.out.println(item4Name + " : " + item4Price);

        System.out.println("--------------------------");
        System.out.println("Subtotal    : " + subtotal);
        System.out.println("GST (18%)   : " + gst);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("==========================");

        sc.close();
    }
}