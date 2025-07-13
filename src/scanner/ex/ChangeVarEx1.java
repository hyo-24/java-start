package scanner.ex;

import java.util.Scanner;

public class ChangeVarEx1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp; // 잠시 a의 값을 담아두고 b를 받아서 b한테 전달하는 방식
        // 비유하자면 빈 상자와 두 상자를 옆으로 하나씩 전달해서 값을 교체하는 것

        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }
}
