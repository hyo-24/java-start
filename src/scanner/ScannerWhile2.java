package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🚨 첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");
        System.out.println(); // 줄 띄우기

        while (true) {
            System.out.print("첫 번째 숫자을 입력하세요:");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int sum = num1 + num2;
            System.out.println("두 수의 합계:" + sum);
        }
    }  // 바로 내가 만들었어!!! 성공!!! ><
}
