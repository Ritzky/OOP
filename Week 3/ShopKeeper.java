public class ShopKeeper extends User{

    private Account account;

    public ShopKeeper(String name){
        super(name);
        Account defaultAccount = new Account();
    }

    public Account getAccount(){
	return this.account;
    }

    public void deposit(int amount){
        if(account != null){
            this.account.deposit(amount);
        }

    }

    public int getBalance(){
        if(account != null){
            return this.account.getBalance();
        }
        else{
            return 0;
        }

    }    
}
