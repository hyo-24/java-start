package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 8;

        for (int i = 1; i <= endNum; i++) { // 중 괄 호 까먹지마!! 그리고 i 에 1을 증감하는 코드랑
            sum = sum + i; // sum에 1을 증감하는 코드 헷갈리지말기
            System.out.println("i = " + i + ", sum = " + sum);
        }
    }
}
