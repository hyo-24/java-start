package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon = 0;

        switch (grade) {
            case 1 : // case 뒤의 값이 switch 조건문인 grade와 같을 때 밑의 명령어를 실행한다
                coupon = 1000;
                break; // 앞의 else if 처럼 실행이 되면 바로 빠져나가게 하는 코드다.
            case 2 :
                coupon = 2000;
                break;
            case 3 :
                coupon = 3000;
            break;

            default: // if 문의 else 와 같다. 선택사항이다.
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
