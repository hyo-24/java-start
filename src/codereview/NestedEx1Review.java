package codereview;

public class NestedEx1Review {
    public static void main(String[] args) {


        for (int i = 1; i < 10; i++) {
            for (int a = 1; a < 10; a++) {
                int sum = i * a;
                System.out.println(i +" * "+a+" = "+sum);
            }
        }
    }
}
