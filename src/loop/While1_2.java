package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 3) {
            count++; // 이게 1씩 더하는 코드니까 더하다가 3보다 크거나 같아지면 조건문이 거짓이 돼서 멈춘다!
            System.out.println("현재 숫자는 " + count);
        }
    }
}
