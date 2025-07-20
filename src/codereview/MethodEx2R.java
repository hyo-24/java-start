package codereview;

public class MethodEx2R {
    public static void main(String[] args) {

        repeat("Hello, world!",3);
        repeat("Hello, world!",5);
        repeat("Hello, world!",7);

    }
    public static void repeat(String message,int count) { //매개변수타입 무조건 입력해야함
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
