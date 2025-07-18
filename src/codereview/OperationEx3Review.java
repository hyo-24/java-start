package codereview;

public class OperationEx3Review {
    public static void main(String[] args) {
        int score = 9;
        if (score >= 80 && score <= 100) {
            boolean a = true;
            System.out.println(a);
        } else {
            boolean b = false; // 내가 아직 boolean 변수를 쓸줄 모르는 걸 확인했다.
            System.out.println(b);
        }

        boolean result = score >= 80 && score <= 100;
        System.out.println(result); // 이게 훨씬 간편한 코드! true, false를 직접 안쳐 넣어도 판단해서 알려준다!
    }
}
