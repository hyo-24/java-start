package operator;

public class OperatorAdd {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a);
        a = a + 1;
        System.out.println("a = " + a);

        ++a;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);
    }
}
