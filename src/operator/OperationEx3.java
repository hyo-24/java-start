package operator;

public class OperationEx3 {
    public static void main(String[] args) {
        int score = 85;

        boolean result = 80 <= score && score <= 100; // && 를 까먹고 80 <= score <= 100 으로 작성함...수학이랑 다르다!
        System.out.println(result);
    }
}
