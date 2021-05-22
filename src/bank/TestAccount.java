package bank;
/**
 *
 * @author Sujan
 */
public class TestAccount {
    public static void main(String[] args) {
        Account a1=new Account();
        Account a2=new Account();
        
        a1.insert(178200222, "Dhanusha",20000);
        a2.insert(789200255, "Sujan", 20000);
        
        a1.display();
        a2.display();
        
        a1.checkBalance();
        a2.checkBalance();
        
        a1.diposit(55000);
        a2.diposit(56000);
        
        a1.checkBalance();
        a2.checkBalance();
        
        a1.widthdraw(25000);
        a2.widthdraw(30000);
        
        a1.checkBalance();
        a2.checkBalance();
        
        a1.display();
        a2.display();
        
    }
}
/* OUT-PUT
178200222  Dhanusha  20000.0
789200255  Sujan  20000.0
Balance is :20000.0
Balance is :20000.0
55000.0 deposited...
56000.0 deposited...
Balance is :75000.0
Balance is :76000.0
25000.0 Widthdrawn...
30000.0 Widthdrawn...
Balance is :50000.0
Balance is :46000.0
178200222  Dhanusha  50000.0
789200255  Sujan  46000.0
*/