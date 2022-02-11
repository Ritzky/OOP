public class BigCorp extends ShopKeeper{

    private static final double BONUS_RATE=0.001;
    private double bonus;

    public BigCorp(String name){
        super(name);
        this.bonus = 0;
    }

    public void deposit(int amount){
        super.deposit(amount);
        this.bonus += (BONUS_RATE * amount);
    }

    public double getEarnedBonus(){
	return this.bonus;
    }
}
