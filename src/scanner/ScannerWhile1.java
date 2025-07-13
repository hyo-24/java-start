package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) { // 항상 참이니까 계속 반복

        System.out.println("문자열을 입력하세요(exit:종료) : ");
        String str = scanner.nextLine();
        if (str.equals("exit")) {
            System.out.println("프로그램을 종료합니다.");
            break; // 프로그램 종료하는 장치 넣어두고 무한반복
        }
            System.out.println("입력한 문자열 : " + str); // exit 조건문에 참이 아니면 입력한거 그대로 출력하고 반복
        }
    }
}
