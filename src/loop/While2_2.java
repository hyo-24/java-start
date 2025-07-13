package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        i = i + 1;
        sum = i + sum;
        System.out.println("i = " + i + ", sum = " + sum);
        i = i + 1;
        sum = i + sum;
        System.out.println("i = " + i + ", sum = " + sum);
        i = i + 1;
        sum = i + sum;
        System.out.println("i = " + i + ", sum = " + sum);
        // 내가 입력한 코드! 앞에서와 달리 더하는 수를 하나하나 바꾸지 않고 i 값 하나만 바꿔도 가능하다!


        int sum2 = 0;
        int i2 = 1;

        sum2 = sum2 + i2;
        System.out.println("i2 = " + i2 + ", sum2 = " + sum2);
        i2++;
        sum2 = sum2 + i2;
        System.out.println("i2 = " + i2 + ", sum2 = " + sum2);
        i2++;
        sum2 = sum2 + i2;
        System.out.println("i2 = " + i2 + ", sum2 = " + sum2);
    } // 예시 코드 증감 연산자를 쓰는게 더 간단하다.
}
