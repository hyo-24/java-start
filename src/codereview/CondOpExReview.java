package codereview;

public class CondOpExReview {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // 삼항연산자를 기억을 못함....와

        int max = (a > b) ? a : b; // 참이면 a를 대입, 거짓이면 b를 대입 (조건문에서 변수에 값을 대입할 때 더 간단하게 작성할 수 있다)

        System.out.println("더 큰 숫자는 "+max+"입니다.");
    }
}
