package loop.ex;

public class NastedEx2 {
    public static void main(String[] args) {

        int rows =6;
        int star = 1;

        while (star <= rows) {
            // for ()
            System.out.println("*");
            star++;
        }

        // 예시 코드
        int row = 7;

        for (int i = 1; i <= row; i++) { // for 문의 로직을 잘못 알고 있었다...
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
