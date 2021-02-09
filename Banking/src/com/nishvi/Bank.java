package com.nishvi;

import java.util.ArrayList;

public class Bank {
    public ArrayList<Branch> branches;
    public String bank_name;

    public Bank(String bank_name) {
        this.bank_name = bank_name;
        this.branches = new ArrayList<Branch>();
    }
    public void addBranch(String name){
        Branch branch = findBranch(name);
        if(branch == null){
            Branch newBranch = new Branch(name);
            branches.add(newBranch);
            System.out.println("New Branch is added "+name);
        }
        else
            System.out.println("Branch is already existing");
    }
    public void addCustomer(String branchName, String customerName,double InitialAmount){
        Branch isBranch = findBranch(branchName);
        if(isBranch != null){
            isBranch.addCustomer(customerName,InitialAmount);
        }
        else
            System.out.println("not available");
    }
    public void addTransactions(String BranchName, String customerName, double Value){
        Branch isBranch1= findBranch(BranchName);
        if(isBranch1 != null){
            isBranch1.addTransaction(customerName,Value);
        }
        else
            System.out.println("No branch");
    }
    public void printCustomers(String name1){
        Branch branch1 = findBranch(name1);
        if(branch1==null)
            System.out.println("Branch with the name of "+name1+" is not available ");
        else{
            System.out.println("The list of customers : "+branch1.getCustomers());
        }
    }
    public Branch findBranch(String branchName){
        for (int i=0;i<branches.size();i++){
            Branch existingBranch = branches.get(i);
            if(existingBranch.getBranch_name() == branchName){
                return existingBranch;
            }
        }
        return null;
    }
    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public String getBank_name() {
        return bank_name;
    }
}
