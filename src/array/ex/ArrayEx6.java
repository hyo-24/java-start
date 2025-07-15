package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력받을 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] number = new int[count];
        int small, large;

        System.out.println(count+"개의 정수를 입력하세요: ");

        for (int i = 0; i < count; i++) {
            number[i] = scanner.nextInt();
        }

        small = large = number[0];

        for (int i = 1; i < count; i++) {
            if (number[i] < small) {
                small = number[i];
            }
            if (number[i] > large) {
                large = number[i];
            }
        }
        System.out.println("가장 작은 정수: " + small);
        System.out.println("가장 큰 정수: "+ large);
    }

}
