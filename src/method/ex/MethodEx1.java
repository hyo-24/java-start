package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {

        System.out.println(average(1,2,3));
        System.out.println(average(15,25,35)); // 메서드 호출 방식 기억하자
    }

    public static double average(int a, int b, int c) { // 메서드 하나로 여러 값 처리!
        int sum = a + b + c;
        return sum / 3.0 ; // 나는 평균 변수에 결과 값을 넣어서 반환했는데 이게 더 간단하네. 반환변수가 double 이니까 실수로 만들어줘야한다.
    }
}
