public class Test4 extends Test{
    public boolean test() throws ClassNotFoundException{		
	print("**************************************************");
	print("Running test 4");
	print("Expecting 1 error message");

	boolean success = true;

	//--------------------------------------------------
	// Tests for Agent
	Agent agent = new Agent("M. Smart");
	agent.addClient(new Client("Don"));
	agent.addClient(new PremiumClient("Barbara"));
	
	if (arrayLength(agent.getClients())!=2){
	    success = false;
	}
		
	agent.addShopKeeper(new ShopKeeper("Edward"));
	agent.addShopKeeper(new FirstTimeShopKeeper("Robert"));
	agent.addShopKeeper(new BigCorp("Bernie", 12345));
	
	if (arrayLength(agent.getShopkeepers())!=5){
	    success = false;
	}
	
	agent.addShopKeeper(new ShopKeeper("Hymie"));
	if (arrayLength(agent.getShopkeepers())!=5){
	    success = false;
	}
	
	//--------------------------------------------------
	// Reflection tests for Agent
	String[] illegalFields = {};
	String[] illegalMethods = {};
	if (!reflectionTest("Landlord", 3, illegalFields, 2, illegalMethods)){
	    success = false;
	}	

	return success;
    }	
}
