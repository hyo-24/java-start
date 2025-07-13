package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 3;
        int coupon = switch (grade) {
            case 1 -> 1000; // 새로운 switch 문에서는 = 이 아니라 -> 을 쓴다! 그리고 break도 없다.
            case 2 -> 2000;
            case 3 ->  3000;
            default -> 500;
        }; // 새로운 switch 문에는 중괄호 뒤에 ; 을 붙여야 하나봄. 명령문이 아니라 표현형이라서.
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
