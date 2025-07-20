package codereview;

public class NestedEx2Review {
    public static void main(String[] args) {
        String star = "*";
        int rows = 7;

        for (int i = 1; i <= rows; i++) { // 7번 도는 거랑 하나씩 추가로 쌓는 거 두 반복문
            for (int j = 1; j <= i ; j++) { // 증감해서 2가 되면 거짓이라서 빠져나옴. 줄 수랑 별 수가 같으니까 별의 반복출력수가 줄수랑 같아질 때까지 반복하게
                System.out.print(star);
            }  // j만큼 출력하고 빠져나가게
            System.out.println();
        }
    }
}
