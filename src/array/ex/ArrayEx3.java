package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); // 계속 틀리는 부분! 배열의 수를 넣어줘야한다
        }

        for (int i = 4; i >= 0; i--) { // 숫자가 4니까 0도 포함해야한다
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
