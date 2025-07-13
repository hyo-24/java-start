package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = number.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = number.nextInt();

        if (num1 > num2) {
            int box = num1;
            num1 = num2;
            num2 = box;
        } // 첫번째가 더 큰 수 일때는 바꿔서 그 사이의 정수를 출력

        for( ; num1 <= num2 ; num1++) {
            System.out.println(num1);
        }
    }
}
