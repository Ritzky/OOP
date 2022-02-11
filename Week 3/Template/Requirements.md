R1 (1 mark) Add a constructor to the class Shopkeeper, taking one parameter corresponding to its
name. The constructor must also initialize its Account field to a default Account object. You
are not allowed to define any new fields or methods in Client. Remember you can
always modify the inheritance hierarchy.
There are two special types of ShopKeeper, FirstTime and BigCorp, implemented by the classes
BigCorp and FirstTimeShopKeeper.

R2 (1 mark) FirstTime shop keepers behave just like regular shopkeepers, but they have an additional interger attribute representing their New Company ID (NID) you must implement
constructor to make sure firstime can be instantiated, taking their name and NID as
parameters (in that order). You are not allowed to define any new fields or methods
in FirstTime.

R3 (1 mark) BigCorp are like regular ShopKeeper, but they earn a bonus every time they
make a deposit. You must implement a constructor to make sure BigCorps can be
instantiated, taking their name as a parameter, and setting their accumulated bonus (the field
bonus) to 0. You must also implement a method deposit that in addition to making a deposit
for the given amount, increases the accumulated bonus by 0.1% of the deposited amount. You
are not allowed to define any new fields in BigCorp.


R4 (2 marks) landlords or staff in charge of dealing with Shopkeepers. Each landlord is assigned
a maximum of 5 Shopkeepers of any kind. The class Landlord, therefore, must hold a list of the Shopkeepers
assigned to the corresponding agent.
landlord must implement the following methods:
• addShopkeeper, to assign a new client to an agent;
• getShopkeepers, to retrieve the list of Shopkeepers assigned to an landlord.
You are only allowed to add these two methods, without overloading. You are
only allowed to add one extra field to landlord, on top of the two provided already. You
must modify the constructor to make sure that all fields are initialized properly
