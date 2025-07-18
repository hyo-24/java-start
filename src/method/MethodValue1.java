package method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전. num1: " + num1); // 5
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1); // 이 부분이 틀렸다. 10 이 아니라 5다.

    }

    public static void changeNumber(int num2) { // 변수타입이 void 인데 메서드에 들어가는 값은 또 변수 지정을 했네?
        System.out.println("2. changeNumber 변경 전, num2: " + num2); // 5
        num2 = num2 * 2; // 10
        System.out.println("3. changeNumber 변경 후, num2: " + num2); // 10
        // return 이 없어서 값 10이 num1에 반환되지 않는다! 그래서 명령 흐름만 넘어가고 num1은 원래의 5가 출력된다.
    }
}
