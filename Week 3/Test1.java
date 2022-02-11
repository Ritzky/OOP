public class Test1 extends Test{
    public boolean test() throws ClassNotFoundException{			    
	print("**************************************************");
	print("Running test 1");	
	    
	boolean success = true;
	    
	//--------------------------------------------------
	// Tests for Client
	ShopKeeper c = new ShopKeeper("Bob");
	success = c.getName().equals("Bob");	    
	if (c.getBalance() != 0){
	    success = false;
	}
	
	//--------------------------------------------------
	// Reflection tests for Client
	String[] illegalFields = {"String"};
	String[] illegalMethods = {"getName"};
	if (!reflectionTest("ShopKeeper", 1, illegalFields, 3, illegalMethods)){
	    success = false;
	}	
	    
	return success;
    }	
}