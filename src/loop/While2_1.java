package loop;

public class While2_1 {
    public static void main(String[] args) {
        int num = 0; // 변수 초기화를 한 번만 했기 때문에 블록이랑 상관 없이 값이 쌓이게 된다.

        if (num == 0) { // 일단 문제 이해를 잘못함. 더하는 수를 1씩 증가시켜서 더하는 문제인데 더하는 수만 증가시켰다.
            num +=1;
            int a = num; // 이건 왜 넣은거....?
            System.out.println(num);
        }
        if (num > 1) { // 이 조건문은 거짓이라 출력 안됨.
            num +=1;
            int b = num;
            System.out.println(num);
        }
        if (num > 2) { // 마찬가지로 거짓이라서 출력안됨.
            num +=1;
            int c = num;
            System.out.println(num);
        }

        int sum = 0;

        sum = sum +1;
        System.out.println("i = " + 1 +", sum = " + sum);
        sum = sum +2;
        System.out.println("i = " + 2 +", sum = " + sum);
        sum = sum +3;
        System.out.println("i = " + 3 +", sum = " + sum);
    } // sum의 값은 초기화를 앞에서 한 번만 했기 때문에 main 블록 안에서 메모리가 계속 쌓이고 그 값을 꺼내 사용한다.
}
