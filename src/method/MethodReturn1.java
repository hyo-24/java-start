package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true; // 거짓이면 값이 안나오는게 아니라 컴파일 오류가 뜬다.
        } else {
            return false; // else 로 보완하면 return이 실행돼 false를 출력하고 이 메서드를 빠져나간다.
        }
    }
}


