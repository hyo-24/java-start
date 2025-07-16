package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productCount = 0; // 인덱스 초기화 (상품 등록 시 1씩 증가)
        int productMax = 10;
        String[] productNames = new String[productMax]; // 초기화는 안함 배열 지정만!
        int[] productPrices = new int[productMax];


        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                if (productCount == productMax) { // 10개 이상이면
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue; // 다시 돌아가 번호 선택
                }
                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine(); // productCount가 인덱스 역할을 함
                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();
                productCount++; // 인덱스 역할 i++

            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }


            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }

    }

}

