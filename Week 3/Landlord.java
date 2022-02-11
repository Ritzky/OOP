public class Landlord{

    private static final int MAX_SHOPKEEPERS = 5;
    private int numShopKeepers;
    private ShopKeeper list[] = new ShopKeeper[MAX_SHOPKEEPERS];


    public Landlord(){
	this.numShopKeepers = 0;
    }

    public void addShopKeeper(ShopKeeper person){
        if(this.numShopKeepers < 5){
            this.list[numShopKeepers] = person;
            this.numShopKeepers+=1;
        }
        else{
            System.out.println("max reached");
        }
    }

    public ShopKeeper[] getShopKeepers(){
        return this.list;
    }


}
