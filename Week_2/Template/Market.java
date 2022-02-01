//This is the test file to use as test cases

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Market{

    private static boolean test1(){
	System.out.println("**************************************************");
	System.out.println("Running test 1");
        int numAccounts = 70;
        Inventory[] invents = new Inventory[numAccounts];
        
        for (int i = 0; i < numAccounts; i++){
            invents[i] = new Inventory();
        }

	boolean success = true;	
        for (int i = 0; i < numAccounts; i++){
            for (int j = 0; j < numAccounts; j++){
                if (i != j){
                    success = success && (invents[i].getUniqueId() != invents[j].getUniqueId());
                }
            }
        }
	return success;
    }


  private static boolean test2(){		
	System.out.println("**************************************************");
	System.out.println("Running test 2");
	System.out.println("Expecting 2 error messages.");
	User u1 = new User("Riz");
	boolean success = true;
	success = success && u1.getFunds() == 0;
	u1.addInventory(new Inventory(10));
	success = success && u1.getFunds() == 10;
	u1.addInventory(new Inventory(5));
	success = success && u1.getFunds() == 15;
	u1.addInventory(new Inventory(2));
	success = success && u1.getFunds() == 17;
	u1.addInventory(new Inventory(2));
	success = success && u1.getFunds() == 17;

	User u2 = new User("Alice");
	success = success && u2.getFunds() == 0;
	u2.addInventory(new Inventory(1));
	success = success && u2.getFunds() == 1;
	u2.addInventory(new Inventory(1));
	success = success && u2.getFunds() == 2;
	u2.addInventory(new Inventory());
	success = success && u2.getFunds() == 2;
	u2.addInventory(new Inventory(1));
	success = success && u2.getFunds() == 2;
	
	return success;
    }

    private static boolean test3(){		
	System.out.println("**************************************************");
	System.out.println("Running test 3");
	System.out.println("Expecting 6 error messages.");
	User u1 = new User("Bongo");
	boolean success = true;
	for (int i=0; i < 4; i++){
	    u1.deposit(i,10);
	    success = success && u1.getFunds() == 0;
	}

	u1.addInventory(new Inventory(10));
	success = success && u1.getFunds() == 10;
	u1.addInventory(new Inventory(1));
	success = success && u1.getFunds() == 11;
	u1.withdraw(2,1);
	success = success && u1.getFunds() == 11;
	u1.withdraw(1,10);
	success = success && u1.getFunds() == 11;
	u1.withdraw(1,1);
	success = success && u1.getFunds() == 10;

       
	return success;
    }


    private static boolean test4(){
	System.out.println("**************************************************");
	System.out.println("Running test 4");
	User user = new User("Nadia");
	String report = user.generateReport().replaceAll(" ", "");
	Pattern p = Pattern.compile("\\p{Blank}");
	Matcher m = p.matcher(report);
	String cleanReport = m.replaceAll("");
	return cleanReport.equals("Name:"+user.getName()+".Funds:"+user.getFunds());
    }

    
    private static boolean test5(){
	System.out.println("**************************************************");
	System.out.println("Running test 5");
	User user = new User("Dim");
	user.addInventory(new Inventory(1));
	user.addInventory(new Inventory(100,0.05));
	user.addInventory(new Inventory());
	boolean success = 0 == Double.compare(user.calculateEarnings(),  1*0.01 + 100*0.05);
	return success;
	
    }

    public static void main(String[] args){

	// Uncomment the following tests to verify if your code passes them
	
	//System.out.println("Test 1 "+ (test1()?"OK":"Failed") + "\n--------------------------------------------------\n");
	//System.out.println("Test 2 " + (test2()?"OK":"Failed") + "\n--------------------------------------------------\n");
	//System.out.println("Test 3 " + (test3()?"OK":"Failed") + "\n--------------------------------------------------\n");
	//System.out.println("Test 4 " + (test4()?"OK":"Failed") + "\n--------------------------------------------------\n");
	//System.out.println("Test 5 " + (test5()?"OK":"Failed") + "\n--------------------------------------------------\n");
        
    }
}
