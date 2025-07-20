package codereview;

import java.util.Scanner;

public class ArrayEx6R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max;
        int min;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] number = new int[count];
        System.out.println(count + "개의 정수를 입력하세요: ");

        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }

        max = min = number[0];

        for (int i = 1; i > number.length; i++) { // 범위를 i > max로 했었다. 아님!
            if (i > max) {
                max = number[i]; // 이 두개를 if가 아니라 for로 두개 만들었다. 저번에도 이렇게 했었는데 이건 비효율적이다.
            }
            if (i < min) { // 이 두개를 같이 루프하게 해야 동시에 비교가 가능하다!
                min = number[i];
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
