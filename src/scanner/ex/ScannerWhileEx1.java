package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // “사용자가 이름/나이를 반복해서 입력하고, ‘종료’ 입력 시 루프 종료되는 예제입니다.”

        /* 내가 혼자 해본 코드
            while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();
            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt();
            System.out.println("입력한 이름: " + name + ", 나이: " + age);

            if (name.equals("종료")) {
                break;
            }
        }
        System.out.println("프로그램을 종료합니다."); */


        while (true) {

            System.out.print("이름을 입력하시오: ");
            String namee = input.nextLine(); // 여기서 내가 직접 엔터를 누르냐 아니냐로 줄바꿈이 결정됨.

            if (namee.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하시오: ");
            int agee = input.nextInt();
            input.nextLine(); // 이 코드를 넣지 않으면 두번째에서 이름 입력문장이랑 나이 입력문장이 같은 줄에 한번에 출력됨

            System.out.println("입력한 이름: "+namee+", 나이: "+agee);
        }
    }
}
