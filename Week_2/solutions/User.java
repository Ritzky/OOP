public class User{

    private String name;
    private Inventory inventory;
    int length = 3;
    private Inventory inventories[] = new Inventory[length];
    private int inventCounter = 0;


    public User(String name){
	this.name = name;
    }
    
    public void setName(String name){
	this.name = name;
    }

    public String getName(){
	return this.name;
    }    

    public void addInventory(Inventory inventory){
        if(inventCounter <= 2){ //inventories are indexed 0-2
            inventories[inventCounter] = inventory;
            inventCounter++;
        }

        else{
            System.out.println("error");
        }
    }

    public int getFunds(){
        int total = 0;
        for(int i=0; i< length; i++){
            if(inventories[i] == null){
                System.out.println("error");
            }
            else{
                total += inventories[i].getBalance();
            }
        }
        return total;
    }

    public void deposit(int iCounter, int amount){
        if(iCounter < 3 && inventories[iCounter] != null){
            inventories[iCounter].deposit(amount);
        }

        else{
            System.out.println("error");
        }
    }

    public void withdraw(int iCounter, int amount){
        if(iCounter < 3 && inventories[iCounter] != null){
            inventories[iCounter].withdraw(amount);
        }

        else{
            System.out.println("error");
        }
    }

    public String generateReport(){
        return "Name: " + this.name + ". Funds " + getFunds();
    }

    public double calculateEarnings(){
        double totalEarnings = 0;
        for(int i=0; i < length; i++){
            Inventory invent1 = inventories[i];
            if(invent1 == null){
                System.out.println("error");
            }
            else{
                int balance = invent1.getBalance();
                double interest = invent1.getInterestRate();

                totalEarnings += balance * interest; // percentage is already converted to decimal in the interest rate so dont worry

            }
        }
        return totalEarnings;

    }


}
