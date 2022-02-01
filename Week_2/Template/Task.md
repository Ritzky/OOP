Food market:

-Due to the pandemic people have to ration and are only allowed 3 DIFFERENT types of fruit.

- however they can have as many of each type of fruit as they want,

- Each fruit type should be unique 

- They can deposit and withdraw as much as they want of that type of fruit

R1) Each Inventory object must have a unique identifier of type int, we should be able to get this unique id from a method called getUniqueId in the class Inventory

R2) Users can have up to 3 Inventorys: 
- to add an inventory there must be a an addInventory method in the class User
- if a fourth inventory is attempted to be added it should say an error message and do nothing
- There should be a method called getFunds which tells the user how much fruit they have all together from all 3 accounts

R3) Users should have a method to deposit and withdraw funds.
- They should be called deposit / withdraw
- They should take 2 intergers, which inventory and amount to withdraw / deposit

R4) The class User must have a method to generate a report. The method must be called
generateReport and return a String in the following format: Name: <name>. Funds:
<funds>, with the values of the corresponding fields.

R5) Every yeaqr you get interest on fruit. Make a constructor which takes an int parameter for the initial balance and a double parameter for the interest rate
 - default amount is 1%
 - User must have a calculateEarnings method
 - Calculate earnings tells you how many fruit you can get via interest across all accounts.

