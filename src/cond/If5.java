package cond;

public class If5 {
    public static void main(String[] args) {
        int money = 100000;
        int age = 3;

        if (money >= 10000) {
            System.out.println("1000원 할인");
        }
        if (age < 10) {
            System.out.println("1000원 할인");
        } // 문제만 보고 내가 쓴 코드 실제 금액에 적용하는 법을 모르겠음


        int price = 10000;
        int age2 = 8;
        int discount = 0; // 할인 된 금액을 출력해야 하니까 빼야하는 값을 담는 변수가 필요함

        if (price >= 10000) {
            discount += 1000; // 조건문 밑에 무조건 출력코드가 있어야하는 건 아님
        }
        if (age2 < 10) {
            discount += 1000;
        }

        int result = price - discount;
        System.out.println("할인된 가격 : " + result + "원"); // 이제 결과 값도 변수에 넣어서 출력해야한다는 게 익숙해짐
    }
}
