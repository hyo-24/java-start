package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner food = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String name = food.nextLine();

        System.out.print("음식의 가격을 입력해주세요: ");
        int price = food.nextInt();

        System.out.print("음식의 수량을 입력해주세요: ");
        int count = food.nextInt();

        int sum = count * price;

        System.out.println(name+" "+count+"개를 주문하셨습니다. 총 가격은 "+sum+"원입니다.");
    }
}
