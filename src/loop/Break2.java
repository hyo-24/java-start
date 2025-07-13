package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; ; i++) {
            sum = sum + i;
            System.out.println("i = " + i + ", sum = " + sum); // 이 코드를 밑에 넣어야 조건에 맞을 때 출력이 됌
            if (sum > 10) {
                break; // 나는 10 이상이 나올 때까지 값을 계속 구하는 코드
            }
        }

        int bum = 0;
        int l = 1;

        for (; ; ) {
            bum += l;
            if (bum > 10) {
                System.out.println("합이 10보다 크면 종료: l= " + l + ", bum = " + bum);
                break;
            }
            l++; // if 문이 거짓일 때 이쪽으로 넘어와서 증감되고 다시 반복
        } // 문제에서 말한 합이 10이 넘어가는 때 l이랑 bum의 값을 구하는 코드
    }
}
