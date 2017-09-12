# online-Store-System




 The program must  have a menu showing its services as shown below:   
 
Store System Menu 1. Add a new Item to Store 2. Add a new Customer to Store 3. Add an item to Customer shopping cart 4. Remove an item from Customer shopping cart 5. View the items in Customer shopping cart 6. End shopping and go to checkout 7. Empty Customer shopping cart 8. Exit the program 
 
The above services must do the following actions 
 1. Add a new Item to Store. 
 The system prompts to the user for adding a new item data. The item data contains the following items: - item number: holds an unique number for the item. - item name: holds the full name of the item. - item quantity: holds the quantity of the item. - item price: holds the  price of the item. Enter item number: Enter item name: Enter item quantity: Enter item price: Enter the type of item (B)Book, (s)shoes, (G)Game ?: B Enter Book title : Enter book  author: Do you want add another  item (y/n)? 
 
 2. Add a new Customer. The system prompts to the system user for adding data for a new customer data. The customer data contains the following items: - customer No : holds  an unique number of a customer. - customer name: holds a name of the course.  - New Shopping cart will be create and added  automatically for the new customer. The shopping cart will be  empty.  Enter customer number: Enter customer name: New shopping cart add to the customer Do you want add another  customer (y/n)? 
 
 2
 
The System will  repeat adding another customer , if the user answer yes for the question "  Do you want add another customer (y/n)? ". if the user select no, the system will return to the main menu showing it's services.  
 
3. Add an item to Customer shopping cart 
 
The system asks the user about a wanted  customer for adding an item to his shopping cart. The system will allow the user to specify the customer by  a customer number.  The system will search about the specified customer to show if he/she is exists or not exits. If the customer is exist,  The system will display a form displaying all items in the store, Then the system will ask the user to enter the items number and the required item quantity that the customer wants to add to his shopping cart. For each input the system will check the required item quantity with the item quantity in the store  to validate that the required quantity is available in the store for that item , if not that the system will alert the user and will not allow the user to add the item to shopping cart.  
 
Sample input for this case: 
 
Enter customer number: 212 The customer is not exits, Do you want try again(y/n)?   Enter customer number: 215 The customer  no :215 ,The  customer name : Ali  Al-Masri. Items in the store  1. 1401    Java Book.                                 [3]  2. 1311    logo Game.                                [5]  3. 1444     Nike sport shoes                     [1] ……… 0. Return to a main menu Enter your item choice :3 The item is  [1444     Nike sport shoes       [1] ] 
 
Enter the required quantity: 2 Sorry the required quantity is not available, the available quantity is [1],try again!    Do you want add another  item to shopping cart (y/n)? y Enter your item choice :3 The item is  [1444     Nike sport shoes       [1] ] Enter the required quantity: 1 The item is  [1444     Nike sport shoes       [1] ]  adding to shopping cart is  success Do you want add another  item to shopping cart (y/n)? y Enter your item choice :1 The item is  [1401    Java Book.                    [3] ] 
 
Enter the required quantity: 1 The item is  [1401    Java Book.                    [1] ]  adding to shopping cart is  success Do you want add another  item to shopping cart (y/n)? n 
 
4. Remove an item from Customer shopping cart 
 
When the user select this option, the System will prompts the user to enter a customer number(id)  and  then the system will search about the customer. If the customer is exists ,The system will show the customer information including  items of his shopping cart and will prompt the user to enter the item choice to remove from the shopping cart. 
 
 3
 
Enter customer number: 215 
 
The customer no :215,The customer name : Ali Hani Al-Masri. 
 
The current items in the shopping cart. 1. [1444     Nike sport shoes       [1] ] 2. [1401    Java Book.                   [1] ] 
 What you want to modify ? R. Remove item form the shopping cart. M. Return to the main menu. Enter your choice [R Remove, M main menu]:R Enter Your item option number:1 
 
The item [1444     Nike sport shoes       [1] ] is removed from shopping cart.  
 What you want to modify ? R. Remove item form the shopping cart. M. Return to the main menu. Enter your choice [R Remove, M main menu]:M 
 
5. View the items in Customer shopping cart The System should display the items in shopping cart for a given customer.  
 
Enter customer number: 215   Item no Item name Quantity Unit price Total price 1401     Java Book 1 20 20    Total price 20 
 Press (m/M) key to return to the main menu 
 
6. End shopping and go to checkout The System should display the items in shopping cart for a given customer and remove the customer from the store. 
 
7. Empty Customer shopping cart The System should remove all items in shopping cart for a given customer or assign new shopping cart for the customer. 
