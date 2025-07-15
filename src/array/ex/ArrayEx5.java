package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] number = new int[count]; // 입력받은 수로 배열 생성
        int sum = 0;
        double average = 0;

        System.out.println(count+ "개의 정수를 입력하세요: ");

        for (int i = 0; i < count; i++) {
            number[i] = scanner.nextInt(); // 정수 입력하는 코드를 안 넣음
            sum += number[i];
        }

        average = (double) sum/count;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: "+average);
    }
}
