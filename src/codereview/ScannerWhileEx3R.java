package codereview;

import java.util.Scanner;

public class ScannerWhileEx3R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int count = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            // System.out.println(number); 저번에도 이걸 틀렸었는데 입력하는 수들은 자동으로 콘솔에 뜨기때문에 출력할 필요 없다.
            sum += number;
            count++;
        }

        average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: "+ average);
    }
}
