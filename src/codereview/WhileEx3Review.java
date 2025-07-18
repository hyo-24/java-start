package codereview;

public class WhileEx3Review {
    public static void main(String[] args) {
        int max = 8;
        int num = 1; // 필요한 변수 : 총 합계, 숫자의 순서, 몇번 누적할건지

        for (int i = 0; i < max; i++) {
            num += num; // 이 코드는 숫자 순서대로 더하는 게 아니라 더해서 나온 값을 더해가는 코드다.
        }
        System.out.println(num);

        int maxx = 20;
        int sum = 0;
        int j = 1;

        while (j <= maxx) { // j가 1부터니까 <= 이어야 한다.
            sum += j; // 숫자 순서대로 더하기 1,2,3,4, ... sum = 0 + 1 , 1 | sum = 1 + 2, 3
            j++; // 더해지는 수가 1씩 커지는 것
        }
        System.out.println(sum);

        int m = 20;
        int total = 0;

        for (int y = 1; y <= m; y++) {
            total += y; // for에 y++ 있는데 밑에 또 적어서 틀림
        }
        System.out.println(total);
    }

}
