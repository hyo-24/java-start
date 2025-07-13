package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int sum = 0; // 합계
        int i = 1; // 몇 번
        int max = 100; // ~번 까지

        while (i <= max) {
            sum += i; // += 는 복합대입 연산이다. sum + sum = i; 랑 같다.
            i++; // 몇 번인지 하나씩 늘어나야 하니까
        }
        System.out.println(sum);
    }
}
