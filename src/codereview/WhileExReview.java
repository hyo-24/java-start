package codereview;

public class WhileExReview {
    public static void main(String[] args) {
        int num = 0;
        int i = 0;

        while (i < 10) {
            num = num + 2; // num+=2; 이게 더 간단한 코드다.
            System.out.println(num);
            i++;
        }

        int number = 0;

        for (int j = 0; j < 10; j++) {
            number += 2;
            System.out.println(number);
        }
    }
}
