package com.nishvi;

import java.util.ArrayList;

public class Branch {
    public ArrayList<Customer>customers;
    public String branch_name;

    public Branch(String branch_name) {
        this.branch_name = branch_name;
        this.customers = new ArrayList<Customer>();
    }
    public void addCustomer(String name, double initialAmount){
        if(findCustomer(name)==null){
            Customer newCustomer = new Customer(name,initialAmount);
            customers.add(newCustomer);
            System.out.println(newCustomer.getCustomer_name()+" is added successfully");
        }
        else{
            System.out.println("Customer "+name+" is already existing");
        }
    }
    public void addTransaction(String name1,double amount){
        Customer customer = findCustomer(name1);
        if(customer == null){
            System.out.println("Customer "+name1+" is not found");
        }
        else{
            customer.addTransactions(amount);
            System.out.println("Rupees "+amount+" is added successfully in the account "+name1);
        }
    }
    public void printTransactions(String name2){
        Customer customer2 = findCustomer(name2);
        if(customer2!=null){
            System.out.println("The transactions of "+name2 + " is "+customer2.getTransactions());
        }
        else{
            System.out.println("Customer yet to open the account");
        }
    }
    public Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer existingCustomer = customers.get(i);
            if(existingCustomer.getCustomer_name() == name){
                return existingCustomer;
            }
        }
        return null;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranch_name() {
        return branch_name;
    }
}
