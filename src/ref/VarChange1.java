package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a); //10
        System.out.println("b = " + b); //10

        a = 20;
        System.out.println("a = " + a); //20
        System.out.println("b = " + b); //10

        b = 30;
        System.out.println("a = " + a); //20
        System.out.println("b = " + b); //30
    }
}
