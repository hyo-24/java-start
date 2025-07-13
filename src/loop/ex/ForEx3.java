package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
        int max = 100;

        int sum = 0;
        for (int i = 1; i <= max; i++) { // 조건에 참일 때 증가해야하는 건 횟수 i 라서 for 안에 위치
            sum += i; // 정신차리자  sum = sum + i 다. = 을 기준으로 대입하는자리 : 계산하는자리
        }
        System.out.println(sum);
    }
}
