package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = 0;
        int maxNumber = 0;
        int count;

        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        count = scanner.nextInt();
        int[] numbers = new int[count];

        System.out.println(count + "개의 정수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber = numbers[0];


        for (int i = 0; i < count; i++) { // 나는 각각 for문으로 작셩했었다(범위 지정도 잘못했었다)
            if (minNumber > numbers[i]) { // (이 부분을 범위로 지정했다)
                minNumber = numbers[i];
            }
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }
            // 	for문의 조건 자리에 비교 조건 (min > number[i]) 넣으면 루프 자체가 일찍 끝날 수 있다
            //	항상 배열 전체를 돌고 싶다면 i < 배열.length 형식으로 써야 한다

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
