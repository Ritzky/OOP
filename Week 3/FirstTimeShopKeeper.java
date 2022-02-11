public class FirstTimeShopKeeper extends ShopKeeper{
    private int NID;

    public FirstTimeShopKeeper(String name, int NID){
        super(name);
        this.NID = NID;
    }

    public int getNID(){
	return NID;
    }
}
