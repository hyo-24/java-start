package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         // 변수 선언은 = 안씀
        int [] numbers = new int[5]; // 배열 지정은 new int[] !!

        System.out.println("5개의 정수를 입력하세요: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); // nextInt라고 무조건 nextLine을 넣어야하는게 아니다!
        }
        System.out.println("출력");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
