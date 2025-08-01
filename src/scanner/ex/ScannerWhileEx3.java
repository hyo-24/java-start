package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        int sum = 0;
        int count = 0;
        int input = 0;

        while (true) {
            input = scanner.nextInt(); // 여기서 input의 값이 쌓이는 줄 알았다.

            if (input == -1) {
                break;
            }
            sum += input;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: "+average);

        /* while (true) {
            int num1 = input.nextInt();
            System.out.println();
            System.out.println(num1);

            if (num1 == -1) {
                break;
            }
        } */
    }
}
