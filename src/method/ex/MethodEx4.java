package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            menu();
            int menuNum = scanner.nextInt();
            if (menuNum == 1) {
                if (menuNum >= 4) { // 그런데 menuNum == 1이면 menuNum >= 4는 항상 false 그래서 아예 실행이 안된다.
                    System.out.println("잘못된 메뉴를 선택하였습니다.");
                    continue;
                }
                System.out.print("입금액을 입력하세요: ");
                int amount = scanner.nextInt();
                depositAmount(balance,amount); // 메서드에서 값이 반환됐다고 해도 계산결과를 돌려줬을 뿐 어디에 저장한다는 코드가 없음!
                continue;                         // 그래서 balance = depositAmount(balance,amount); 라고 해야 값이 반영된다.
            } else if (menuNum == 2) {
                System.out.print("출금액을 입력하세요: ");
                int amount = scanner.nextInt();
                withdraw(balance,amount); // 그러니까 이건 호출만! 한 것! 결과를 받지도 저장도 안함.
                continue;
            } else if (menuNum == 3) {
                System.out.println(balance);
                continue;
            } else if(menuNum == 4){
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }

    public static void menu() {
        System.out.println("--------------------------------------");
        System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
        System.out.println("--------------------------------------");
    }

    public static void depositAmount(int balance, int amount) {
        balance += amount;
        System.out.println(amount+"를 입금하였습니다. 현재 잔액: "+ balance); // 여기서 return을 하지 않아서 원래 변수에는 아무 영향이 없음
    }
    public static void withdraw(int balance, int amount) {
        balance -= amount;
        System.out.println(amount+"를 출금하였습니다. 현재 잔액: "+ balance);
    }

} // 입금, 출금해도 잔액이 바뀌지 않는다. balance가 복사만 되고 원래 값이 안바뀌어서 그렇다.
