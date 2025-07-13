package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;


        if (sum < endNum + 1) {
            sum = i + sum;
            System.out.println("i = " + i + ", sum = " + sum);
            i++;
        } // 내가 해보다가 포기...나는 while문 안쓰고 endNum 써야하는 줄 알았어;;

        int sum0 = 0;
        int i0 = 1;
        int endNum0 = 10;

        while (i0 <= endNum0) {
            sum0 = sum0 + i;
            System.out.println("i = " + i0 + ", sum = " + sum0);
            i0++;
        }
    }
}
