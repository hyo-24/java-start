package codereview;

import java.util.Scanner;

public class ScannerWhileEx4R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int total = 0;


        while (true) {
            System.out.println("1. 상품 입력, 2. 결제, 3. 프로그램 종료");
            int menu = scanner.nextInt();
            scanner.nextLine(); // 여기를 까먹었다 항상 처리

            switch (menu) {
                case 1:
                    System.out.print("상품명을 입력하세요: ");
                    String productName = scanner.nextLine();
                    System.out.print("상품의 가격을 입력하세요: ");
                    int productPrices = scanner.nextInt();
                    total += productPrices;
                    System.out.print("구매 수량을 입력하세요: ");
                    int productCount = scanner.nextInt();
                    scanner.nextLine(); // nextInt처리
                    count += productCount;
                    total = count * productPrices;
                    continue;

                case 2:
                    System.out.println("총 비용: " + total);
                    continue;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("올바른 옵션을 선택해주세요.");
            }
            break; // switch문만 하지말고 밖에 while문도 break해줘야 한다.
        }
    }
}
