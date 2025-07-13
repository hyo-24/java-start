package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("1: 상품입력, 2: 총합, 3: 프로그램 종료");
            int option = scanner.nextInt(); // nextint는 정수만 가져가서 \n 엔터 친게 남는다.

            if (option == 1) {
                scanner.nextLine(); // 앞에 엔터 처리!

                System.out.print("상품명을 입력하시오: ");
                String name = scanner.nextLine();
                System.out.print("상품의 가격을 입력하시오: ");
                int price = scanner.nextInt();
                System.out.print("구매 수량을 입력하시오: ");
                int count = scanner.nextInt();

                sum += price*count;
                System.out.println("상품명: " + name + ", 가격: " + price + ", 수량: " + count);
            } else if (option == 2) {
                System.out.println("총 비용: "+sum);
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }

        }
    }
}
