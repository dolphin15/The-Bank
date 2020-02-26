# The-Bank

A "bank simulation" in Java. 

The Bank Class:

I first imported arralist, iterator and scanner libraries. In the Bank
class, I defined fiels; a static arraylist named CustomerList, a scanner
named in and a variable named counter set to 0.

In deleteCustomer(Customer c1, int idd) method, I found a
customer object inside the CustomerList arraylist and removed it. For
that, I wrote a for loop for (Iterator<Customer> it =
CustomerList.iterator(); it.hasNext(); ) and inside of it c1 =
it.next();.If idd is equals to the c1 object’s id, it removs the object that
the iterator shows.
  
In listAll() method, I defined an iterator named list1 and
while(list1.hasNext()) I print System.out.println(list1.next());.

In listByName(),listBySurname() and listByGender() methods, the
idea is the same. They all have for-each loop and inside of it they all
have an if statement checks if the element is equals to the name user is
searching for. If it does, it prints it to the screen and increases the
counter. When the for-each loop finishes it print the counter to the
screen to say how many records it found and set counter to 0 again.

The Customer Class:

In the Customer class, I defined fields; all are private. Int customer
Id, string customerName, customerSurname, customerGender and
double customerCredit.

I defined two constructors. The Customer() does not do anything. The
Customer(int customerId, String customerName, String 
customerSurname, String customerGender, double
customerCredit) sets the variables it gets to a field with this.

getId(), getName(), getSurname(), getGender(), getCredit()
methods return related variables as their type. Only getBalance()
method returns customerCredit as String.

setId(int customerId), setName(String customerName),
setSurname(String customerSurname), setGender(String
customerGender) and setCredit(double customerCredit) methods
set the variable they get to a related field.

Also I had to override toString() method. toString() method was
returning the object inside the arralist as a text that computer can
understand. So now this method returns return this.getId() + " " +
this.getName() + " " + this.getSurname() + " " + this.getGender()
+ " " + this.getCredit();.

creditAdding(double creditAdding) method checks if the value that
it got while it was calling -creditAdding- is less than or equal to zero.
If it is, it prints a text that warns the user else it adds the creditAdding
to customerCredit.

creditWithdrawing(double creditWithdrawing) method checks if
customerCredit is less that the value that it got while it was calling -
creditWithdrawing-. If it is, it prints a text that warns the user, else it
subtracts the creditAdding to customerCredit.

The ProjectTest Class:

I first imported scanner and iterator libraries. In the ProjectTest class,
I defined a main method and then fiels; boolean variables named
quit1 and quit2 set as false, int variables named userChoice1,
userChoice2 and userChoice3 an int variable id set to 1.

Then, I entered a do-while statement. I printed menu texts and define
two scanners named sc and in. I scaned the choice with sc.nextInt()
and assign it to userChoice1. I defined a customer object c1 and a
bank object b1. With the userChoice1, I entered in the switch-case
statement.

In case1, first I printed a text saying the customer id and set id with
c1.setId(id) method. Then, I ask for the customer name, surname,
gender and credit. I scanned the answers and assign these answers to
their related variables and invoked their mutator methods with c1
object. Then, I added this c1 object to customerList in Bank class
with Bank.CustomerList.add(c1);, printed a text saying “Adding is
successful.”, increase id with id++; and break;.

In case2, I printed a text asking for the id of the customer that user
wants to delete. Scanned that integer and assigned it to an int named
idd. Then, I invoked b1.deleteCustomer(c1,idd); method and printed
a text saying “Deleting is successful.”.

In case 3, I printed menu texts and scanned the choice with
sc.nextInt(); and assigned it to userChoice2. I entered a do-while
statement. Inside it, I entered a switch-case statement using
userChoice2.

In case1, I first System.out.println(); and invoked b1.listAll();
method, set quit2 = true; and break;.

In case2, case3 and case4, I asked for the information that the user
wants to list. Scanned that information and assigned it to related
variable and invoked their related list method on the b1 object then I
printed System.out.println();. I set quit2 = true; and break;.

In case0 I only set quit2=true; and break;.

In default, I printed a text saying that “There is no such option.” and
break;.

I finish switch-case statement, finished do-while statement when
(!quit2); and break;. 

In case4, I asked for the id of the customer I wanted to update and
scanned it with in.nextInt(); and assigned it to an integer variable
named update_id. Then I entered a for loop for
(Iterator<Customer> update = Bank.CustomerList.iterator();
update.hasNext(); ). Inside of it, c1 = update.next();. If c1 object’s
getId() method equals to update_id, I printed a menu and got the
choice and assign it to a variable named userChoice3. With
userChoice3 I entered a switch-case statement.
  
In case1, case2 and case3 I asked for the new variable, got the variable
with in.next(); and assigned it to a related String variable, invoked a
mutator method on c1, printed a text saying “Updating is successful.”
and break;.

In case 0, I only break;. In default, I printed a text saying “There is no
such option.” and break;.

I finish the switch-case statement, if statement and for statement and
break;.
  
In case5 and case6, I both asked for id of the customer they want to
add or withdraw money to. I got the answer with in.nextInt(); and
assigned it to a related variable. Then for both cases, I entered a for
loop like for (Iterator<Customer> it1 =
Bank.CustomerList.iterator(); it1.hasNext(); ). Of course iterator
names are different. Inside of for loop, c1 = it1.next(); and if c1’s
getId() method equals to the variable that I got from the user, I asked
for how much money they want to add or subtract and got the answer
as double and assigned it to a variable. Then, I invoked related method
with that variable (c1.creditAdding(creditAdding); for adding.
c1.creditWithdrawing(creditWithdrawing); for withdrawing.).
After that, I printed a text saying either adding or withdrawing is
successful. I finished the if statement, for statement and break;.
  
In case0, quit1 = true;, break;. 
  
In default, I printed System.out.printf("There is no such option.
Try again.\n");, break;.

I finished the switch-case statement, do-while statement when
(!quit1); and break;.

I printed a text saying “Bye!”. I closed the main method and the
ProjectTest class. 
