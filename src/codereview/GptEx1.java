package codereview;

import java.util.Scanner;

public class GptEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int consumerCount = 0;
        int consumerMax = 10;

        /*System.out.println("등록할 인원 수를 입력하세요: "); // 등록할 사람 수 & 등록된 사람 수 & 최대 등록 수....?
        int count = scanner.nextInt();  // 내가 문제를 잘못 이해함. 등록할 사람 수 지정이랑 등록된 사람 수를 카운트 하는건 중복임!!!
        scanner.nextLine();*/

        String[] name = new String[consumerMax];
        int[] age = new int[consumerMax];

        while (true) {
            System.out.println("1. 고객 등록 | 2. 고객 목록 | 3. 종료");
            System.out.print("메뉴를 입력하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    if (consumerCount >= consumerMax) {
                        System.out.println("더 이상 등록을 할 수 없습니다.");
                        break; // break는 반복문(for, while)이나 switch문에서만 작동하는 키워드. switch가 종료된다.
                    } else  {
                            System.out.print("이름을 입력하세요: ");
                            name[consumerCount] = scanner.nextLine();
                            System.out.print("나이를 입력하세요: ");
                            age[consumerCount] = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println(name[consumerCount]+"("+age[consumerCount]+")이 등록되었습니다.");
                            consumerCount++;
                    }
                    break;

                case 2:
                    if (consumerCount == 0) {
                        System.out.println("등록된 고객이 없습니다.");
                        break;
                    }
                    System.out.println("[고객 목록]");
                    for (int i = 0; i < consumerCount; i++) {
                        System.out.println(name[i]+"("+age[i]+")");
                    }
                    break;

                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default: // continue는 같은 뜻이라 필요 없음.
                    System.out.println("잘못된 메뉴입니다. 다시 입력해주세요.");

            } //2차원 배열 문제: 구조 고정됨 → 반복 수 필요
		      //등록형 관리 프로그램: 개수는 계속 누적됨 → count++로 해결 => 이 두개가 헷갈렸다.

        }
    }
}
