package codereview;

public class MethodEx3R {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);
        System.out.println("최종잔액: "+balance+"원");
    }

    public static int deposit(int balance, int plus) { // 최종잔액 넘겨주려면 return해야지? 그럴려면 반환변수 넣아야지?
        balance += plus;
        System.out.println(plus+"원을 입금하였습니다. 현재 잔액 "+balance+"원");
        return balance;
    }

    public static int withdraw(int balance, int minus) {
        if (balance < minus) {
            System.out.println(minus+"원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= minus;
            System.out.println(minus+"원을 출금하였습니다. 현재 잔액 "+balance+"원");
        }
        return balance;

    }
}
