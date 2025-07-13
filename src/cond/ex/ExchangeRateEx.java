package cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollor = 8;
        int rate = 1300;

        if (dollor < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollor == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("환전 금액은 "+dollor*rate+ "원입니다.");
        } // 내가 작성한 코드

        int dollor2 = 9;

        if (dollor2 < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollor2 == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollor2 * 1300;
            System.out.println("환전 금액은 "+ won + "원입니다.");
        } // 답으로 나와 있는 코드. 조건문 안에 변수 지정을 해서 출력하는 방법도 있구나.
    }
}
