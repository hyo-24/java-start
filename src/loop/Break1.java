package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i; // 1씩 더하는 걸 반복하는데
            if (sum > 10) { // 만약 sum이 10보다 커지면
                System.out.println("합이 10보다 크면 종료: i=" + i + ", sum=" + sum);
                break; // 종료하고 i 값이랑 sum 값을 출력한다.
            }
        }
    }
}
