package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("숫자 0 을 입력하면 프로그램이 종료됩니다.");
        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요 : ");
            int num = input.nextInt();

            if (num == 0) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
            sum +=num;
            System.out.println("입력한 정수의 합 : " + sum);
        }

    }
}
