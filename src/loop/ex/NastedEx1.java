package loop.ex;

public class NastedEx1 {
    public static void main(String[] args) {
        int multi = 0;

        for (int a = 1, b = 1; a <= 9; ) {
            for (; b <= 9; ) {
                multi = a * b;
                System.out.println(a + "*" + b + "=" + multi);
                b++;
            }
            a++;
            //int b
            System.out.println(a +"*" + b + "=" + multi);
        }

        System.out.println();
        // 예시 코드 ⬇️

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}
