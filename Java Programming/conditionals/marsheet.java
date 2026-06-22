import java.util.*;
public class marsheet {
    public static void main(String[] args) {
        System.out.print("enter marks:");
        Scanner sc = new Scanner (System.in);
        int marks;
        marks = sc.nextInt();
        if(marks>90){
            System.out.println("excellent");
        }
        else if(80<=marks){
            System.out.println("very good");
        }
        else if(60<= marks){
            System.out.println("good");
        }
        else if(45<= marks){
            System.out.println("average");
        }
        else if(33<= marks){
            System.out.println("can do better");
        }else {
            System.out.println("Work hard");
        } 
    }
}
