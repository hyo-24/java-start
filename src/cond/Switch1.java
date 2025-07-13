package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 3;
        int coupon = 0;

        if (grade == 1) { // = 은 '같다' 가 아니고 '대입' 이다!!!! 동급은 == 이다!!!
            coupon+=1000;
        }
        if (grade == 2) { // if else 로 작성할 수도 있다!
            coupon+=2000;
        }
        if (grade == 3) {
            coupon+=3000;
        } else {
            coupon+=500;
        }

        int result = coupon;
        System.out.println("발급받은 쿠폰 "+coupon);
    }
}
