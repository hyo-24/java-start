package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 23;

       boolean b = a >10;
       boolean c = a <20;

        System.out.println(b);
        System.out.println(c); // 내가 안보고 만든 코드. &&을 까먹었다 하하

        int d = 23;

        boolean result = d > 10 && d < 20;

        System.out.println("result = " + result);
    }
}
