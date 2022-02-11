public class ShopKeeper{

    private Account account;
       
    public Account getAccount(){
	return this.account;
    }

    public void deposit(int amount){
	this.account.deposit(amount);
    }

    public int getBalance(){
	return this.account.getBalance();
    }    
}
