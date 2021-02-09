package com.nishvi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("State Bank of India");
        bank.addBranch("Ooty");
        bank.addBranch("Commercial Road");
        bank.addBranch("Main Bazaar");
        bank.addBranch("Commercial Road");
        bank.addCustomer("Ooty", "Nish", 500);
        bank.addCustomer("Ooty", "Nish", 500);
        System.out.println(bank.getBank_name());
    }
}
