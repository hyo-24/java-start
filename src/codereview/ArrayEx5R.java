package codereview;

import java.util.Scanner;

public class ArrayEx5R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        int[] numbers = new int[input];
        int sum = 0;
        double average;

        System.out.println(input+"개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / numbers.length;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
