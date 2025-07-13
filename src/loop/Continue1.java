package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) { // 5보다 같거나 작은 정수
            if (i == 3) { // i 가 1이면 if 문에서 거짓이니까 빠져나가 출력되고 다시 돌아옴
                i++;
                continue; /* i 가 3일 때는 if 문이 참이 되서 밑에 증감코드를 실행하고
                 continue는 다시 while 조건문으로 보내는 명령어라서 출력되지 않고 증감만 한 뒤 다시 반복 */
            }
            System.out.println(i);
            i++;
        }
    }
}
