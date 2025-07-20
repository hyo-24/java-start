package codereview;

import java.util.Scanner;

public class ArrayProductEx {
    public static void main(String[] args) {
        int productCount = 0;
        int productMax = 10;


        Scanner scanner = new Scanner(System.in);
        int[] productPrices = new int[productMax];
        String[] productNames = new String[productMax]; // 배열 공간은 상품 등록마다 늘리는게 아니라 최대로 미리 만들어둠


        while (true) { // 종료일 때까지 반복하기위해서 넣은 코드!

            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료"); // 메뉴가 실행 되고 계속 반복해서 떠야하니까 for 안에!
            System.out.print("메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // 밑에 입력하는 코드가 있음!

            switch (menu) {
                case 1:
                    if (productCount >= productMax) {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        break;
                    } else {
                        System.out.print("상품 이름을 입력하세요: ");
                        productNames[productCount] = scanner.nextLine(); // 배열의 인덱스는 productCount 로 하면 되는구나!
                        System.out.print("상품 가격을 입력하세요: ");
                        productPrices[productCount] = scanner.nextInt();
                        productCount++;
                        //continue; -> 반복문에서 이번 반복만 넘어가고 다음 반복을 이어나간다.
                        break; // 현재 반복문에서 나간다. (while이 기준이 아니라 현재 반복문 기준)
                    }

                case 2:
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                        continue;
                    } else {
                        for (int j = 0; j < productCount; j++) {
                            System.out.println(productNames[j] + ": " + productPrices[j]);
                        }
                     break; // switch문은 조건이 맞은 case부터 아래로 쭉 실행되기 때문에, 그 밑에 있는 다른 case들이 조건에 안 맞아도 그냥 실행된다.
                            // 이걸 “fall-through” 현상이라고 함.
                    }

                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("메뉴를 다시 입력해주세요.");
                    continue;
            }
            break;
        }

        /*while (true) {
            for (int i = 0; productCount <= productMax; i++) { // 이렇게 뼈대를 먼저 잡고 코드 만드는 연습하자
                // 메뉴 출력
                // 메뉴 선택 후 switch문

                switch (menu) {
                    case 1:
                        // 상품 등록
                        productCount++;
                        continue;
                    case 2:
                        // 목록 출력
                        continue;
                    case 3:
                        // 종료
                        break;
                    default:
                        // 잘못된 메뉴
                        continue;
                }
                break; // for문 탈출
            }
            break; // while문 탈출
        }*/
    }

}
