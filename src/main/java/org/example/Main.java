package org.example;

public class Main {
    public static void main(String[] args){

        Account bobsAccount = new Account();
        bobsAccount.setNumber("1234");
        bobsAccount.setBalance(1000.00);
        bobsAccount.setCustomerEmail("Bob Brown");
        bobsAccount.setCustomerPhone("123-555-7890");
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);
        bobsAccount.withdrawFunds(200);
        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);
        bobsAccount.withdrawFunds(54.45);
    }
}
