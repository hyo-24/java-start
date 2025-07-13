package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 { // 내가 바로 만들기 성공했다!!!ㅠㅠ
    public static void main(String[] args) {
        Scanner multi = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int num = multi.nextInt();

        System.out.println(num+"단의 구구단:");
        int num3 = 10;
        int sum = 0;

        for (int num2 = 1; num2 < num3; num2++) {
            sum = num * num2;
            System.out.println(num+" X "+num2+" = "+ sum);
        }
    }
}
