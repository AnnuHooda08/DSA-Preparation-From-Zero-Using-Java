public class incrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        if(++a == 6){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
