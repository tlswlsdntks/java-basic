package oop1.ex;

public class AmountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000); //입금
        account.withdraw(9000); //출금
        account.withdraw(2000); //잔액 부족
        System.out.println("잔고: " + account.balance);
    }

}
