public class logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        if (a > b && b++ < 5) {
            System.out.println("Inside If");
        }

        System.out.println(b);
    }
}
