package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double average = 0;

        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        count = scanner.nextInt();
        int[] numbers = new int[count];

        System.out.println(count+"개의 정수를 입력하세요: ");

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt(); // 입력을 count 번 받아야 하니까 안에!
            sum += numbers[i];
        } // 이 문제는 결과로 출력해야하는 코드 개수가 정해져 있으니까 출력부분에 for문 안해도 된다.

        average = (double) sum / count;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
