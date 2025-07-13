package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자한테 받은 걸 이 안에서 쓰는구나

        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine(); // 입력을 string 으로 가져온다. 그리고 사용자의 입력을 기다림
        System.out.println("입력한 문자열 : " + str);

        // 위에 먼저 실행해서 출력하고 그 후에 밑에 코드 실행

        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수 : " + intValue);


        System.out.print("실수를 입력하세요 : ");
        double douValue = scanner.nextDouble();
        System.out.println("입력한 실수 : " + douValue);
    }
}
