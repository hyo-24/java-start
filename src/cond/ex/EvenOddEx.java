package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 2;

        String result = (x % 2 == 0) ? "짝수" : "홀수"; // 변수에 담는 값이 문자열인데 int를 썼었다. == 조심

        System.out.println("x = " + x + ", " + result);
    }
}
