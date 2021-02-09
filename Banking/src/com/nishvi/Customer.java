package com.nishvi;

import java.util.ArrayList;

public class Customer {
    public ArrayList<Double> transactions;
    public String Customer_name;
    public int i;

    public Customer(String customer_name,double initialAmount) {
        this.Customer_name = customer_name;
        this.transactions= new ArrayList<Double>();
        addTransactions(initialAmount);
    }
    public void addTransactions(double amount){
        transactions.add(amount);
    }
    public String getCustomer_name(){
        return Customer_name;
    }
    public ArrayList<Double> getTransactions(){
        return transactions;
    }

}
