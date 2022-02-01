//An account that allows us to add / remove to the amount of fruit or check balance of fruit

public class Inventory{
    private int balance;

    public Inventory(){
        this.balance=0;
    }    

    public Inventory(int balance){
        this.balance = balance;
    }


    public int getBalance(){
        return this.balance;
    }    

    public void setBalance(int amount){
        this.balance = amount;
    }

    public void deposit(int amount){
        this.balance += amount;
    }
    
    public void withdraw(int amount){
	if (amount > this.balance){
	    System.out.println("Error. Not enough fruit.");
	} else{
	    this.balance -= amount;
	}
    }    
}
