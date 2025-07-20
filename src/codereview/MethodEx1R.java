package codereview;

public class MethodEx1R {
    public static void main(String[] args) {

        score(1,2,3);
        score(15,25,35); // 메서드 요청법 까먹지 마렴 😊
    }

    public static void score(int a,int b,int c) { // 메서드는 자리가 중요!
        int sum = a+b+c;
        double average = (double) sum / 3;
        System.out.println("평균값: "+average);
    }
}
