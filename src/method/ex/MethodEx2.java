package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        printMessage("Hello, world!", 3);
        printMessage("Hello, world!", 5);
        printMessage("Hello, world!", 7);


    }

    public static void printMessage(String message, int times) { // 이 문제는 반환이 필요 없는 메서드다.
        for (int i = 0; i < times; i++) {
            System.out.println(message); // message 같은 메서드 안이 아니라도 매개변수이기 때문에 가능하다.
        }
    }

}
