package codereview;

import java.util.Scanner;

public class ArrayEx3R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("5개의 정수를 입력하세요.");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt(); // number[5] 아니다!!!! 5번째 배열에만 들어가버림

        }

        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", "); // println 아니고 print
            }
        }
    }
}
