package accessmodifiers;

import accessmodifiers.financials.Balance;

public class Account {
    void displayBalance(){
        Balance balance = new Balance();
//        balance.amount = 1_000_000; //ERROR
//
//        System.out.println(balance.getBalance());
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.displayBalance();
    }
}
