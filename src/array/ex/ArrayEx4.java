package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); // 이걸 자꾸 반복문 밖에 작성한다 안에 해야됌
        }

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        double average = (double) total / numbers.length;
        System.out.println("입력한 정수의 합계: "+ total);
        System.out.println("입력한 정수의 평균: "+ average);
    }
}
