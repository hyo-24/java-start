package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int productCount = 0;
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];

        Scanner scanner = new Scanner(System.in);
        while (true) { // 반복문 이니까!!! for는 같은 것만 구분해서 안됨
        System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
        System.out.print("메뉴를 선택하세요: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num == 1) {
            if (productCount >= maxProducts) {
                System.out.println("더 이상 상품을 등록할 수 없습니다."); // 한계가 정해져 있으니 한계코드를 먼저 입력해야함
                continue;
            }
            System.out.print("상품 이름을 입력하세요: ");
            productNames[productCount] = scanner.nextLine();

            System.out.print("상품 가격을 입력하세요: ");
            productPrices[productCount] = scanner.nextInt();

            productCount++;
        } else if (num == 2) {
            if (productCount == 0) {
                System.out.println("등록된 상품이 없습니다."); // 앞에서 1을 안하고 2를 눌렀을 경우를 대비
                continue;
            }
            for (int i = 0; i < productCount; i++) { // 여기서는 max가 아니라 count로 해야된다.
                    System.out.println(productNames[i] + " : " + productPrices[i] + "원");
            }
        } else if (num == 3) {
            System.out.println("프로그램을 종료합니다.");
            break;
        } else {
            System.out.println("잘못된 메뉴를 선택하셨습니다.");
        }

        }
    }
}
