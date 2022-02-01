public class Inventory{
    private int balance;
    private int uniqueIdentifier;
    private int identifierCount = 0;
    private double interestRate =0.01;

    public Inventory(){
        this.balance=0;
        this.uniqueIdentifier = identifierCount++ ;
    }    

    public Inventory(int balance){
        this.balance = balance;
        this.uniqueIdentifier = identifierCount++;
    }

    public Inventory(int balance, double interest){
        this.balance = balance;
        this.interestRate = interest;
        this.uniqueIdentifier = identifierCount++;
    }

    public int getUniqueId(){
        return this.uniqueIdentifier = identifierCount++;
    }

    public double getInterestRate() {
        return this.interestRate;
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
