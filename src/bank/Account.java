package bank;

/**
 *
 * @author Sujan
 */
/*
    java program to demonstrate the working of a banking sysytem.where we deposit and withdraw amount from account 
    creating account class which has deposit()/and withdraw() methods
*/
public class Account {
    int acc_no;
    String name;
    float amount;
    
    //method to initialize object
    void insert(int a, String n,float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }
    //deposit method
    void diposit(float amt){
        amount=amount+amt;
        System.out.println(amt+" deposited...");
    }
    //widthdraw methods
    void widthdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficent Balance...");
        }
        else{
            amount=amount-amt;
            System.out.println(amt+" Widthdrawn...");
        }
    }
    
    //method to check the balance
    void checkBalance(){
        System.out.println("Balance is :"+amount);
    }
    //display values of an objects
    void display(){
        System.out.println(acc_no+"  "+name+"  "+amount);
    }
}
