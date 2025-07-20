package codereview;

import java.util.Scanner;

public class MethodEx4R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {

            System.out.println("--------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("--------------------------------------");
            System.out.print("선택: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {

                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    int plus = scanner.nextInt();
                    balance = deposit(balance, plus); // 값을 가져오기만 한거야. 그게 매개변수에 담겨있다고 변수 balance에 들어있는게 아냐 이름만 같은거야. 자리가 중요하다고 했잖아.
                    break;

                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    int minor = scanner.nextInt();
                    if (balance < minor) {
                        System.out.println(minor + "원을 출금하려 했으나 잔액이 부족합니다.");
                    } else {
                        balance = withdraw(balance, minor); // 값을 끌어오면 그걸 대입해줘야 값이 들어가겠지???
                    }
                    break;

                case 3:
                    System.out.println("현재 잔액: " + balance);
                    break;

                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;

                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }

    }

    public static int deposit(int balance, int change) {
        balance += change;
        System.out.println(change + "원을 입금하였습니다. 현재 잔액: " + balance+"원");
        return balance;
    }

    public static int withdraw(int balance, int change) {
        balance -= change;
        System.out.println(change + "원을 출금하였습니다. 현재 잔액 "+balance+"원");
        return balance;
    }
}
