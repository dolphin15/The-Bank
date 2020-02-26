//NIHAN AKINCI 

import java.util.Scanner;
import java.util.Iterator;

public class ProjectTest 
{
    public static void main(String[] args) 
    {
        boolean quit1 = false, quit2 = false;
        int userChoice1, userChoice2, userChoice3;
        int id = 1;
        
        do{
            System.out.printf("\n\n(1)Add new customer.");
            System.out.printf("\n(2)Delete an existing customer. (by customer ID)");
            System.out.printf("\n(3)List customers.");
            System.out.printf("\n(4)Update a customers information.");
            System.out.printf("\n(5)Add money to bank.");
            System.out.printf("\n(6)Withdraw money from the bank.");
            System.out.printf("\n(0)Exit.\n");
            Scanner sc = new Scanner(System.in);
            Scanner in = new Scanner(System.in);
            userChoice1 = sc.nextInt();
            Customer c1 = new Customer();
            Bank b1 = new Bank();
            switch(userChoice1)
            {
                case 1:
                    System.out.printf("Customer Id is :"+id);
                    c1.setId(id);
                    System.out.printf("\nCustomer Name: ");
                    String customerName = in.next();
                    c1.setName(customerName);

                    System.out.printf("Customer Surname: ");
                    String customerSurname = in.next();
                    c1.setSurname(customerSurname);

                    System.out.printf("Customer Gender (male or female): ");
                    String customerGender = in.next();
                    c1.setGender(customerGender);

                    System.out.printf("Credit: ");
                    double customerCredit  = in.nextDouble();
                    c1.setCredit(customerCredit);
                    
                    Bank.CustomerList.add(c1);
                    System.out.printf("\nAdding is successful.");
                    
                    id++;
                    break;
                
                case 2:
                    System.out.printf("\nEnter the Id of the user you want to delete :");
                    int idd = in.nextInt();
                    b1.deleteCustomer(c1,idd);
                    System.out.printf("\nDeleting is successful.");
	            break;
                
                case 3:
                    System.out.printf("\n(1)Listed by all");
                    System.out.printf("\n(2)Listed by name");
                    System.out.printf("\n(3)Listed by surname");
                    System.out.printf("\n(4)Listed by gender");
                    System.out.printf("\n(0)Exit the listing menu\n");
                    userChoice2 = sc.nextInt();
                    do{
                    switch(userChoice2)
                    {
                        case 1:
                            System.out.println();
                            b1.listAll();
                            quit2 = true;
                            break;
                        case 2: 
                            System.out.printf("\nEnter the name of the user you want to list :");
                            String name = in.next();
                            System.out.println();
                            b1.listByName(c1, name);
                            quit2 = true;
                            break;
                        case 3: 
                            System.out.printf("\nEnter the surname of the user you want to list :");
                            String surname = in.next();
                            System.out.println();
                            b1.listBySurname(c1, surname);
                            quit2 = true;
                            break;
                        case 4: 
                            System.out.printf("\nEnter the gender of the user you want to list (male or female):");
                            String gender = in.next();
                            System.out.println();
                            b1.listByGender(c1,gender);
                            quit2 = true;
                            break;
                        case 0:
                            quit2 = true;
                            break;
                        default:
                            System.out.printf("There is no such option!");
                            break;
                    } 
                      }while (!quit2);
                      break;                
                case 4:
                    System.out.printf("\nEnter the Id of the customer you want to update information of :");
                    int update_id = in.nextInt();
                    for (Iterator<Customer> update = Bank.CustomerList.iterator(); update.hasNext();    )
                        {
                            c1 = update.next();
                            if(c1.getId()== update_id)
                            {
                                System.out.printf("\nWhich information do you want to update? :");
                                System.out.printf("\n(1)Update name");
                                System.out.printf("\n(2)Update surname");
                                System.out.printf("\n(3)Update gender");
                                System.out.printf("\n(0)Exit the update menu");
                                userChoice3 = in.nextInt();
                                switch (userChoice3) 
                                {
                                    case 1:
                                        System.out.printf("\nEnter new name:");
                                        String updateName = in.next();
                                        c1.setName(updateName);
                                        System.out.printf("\nUpdating is successful.");
                                        break;
                                    case 2:
                                        System.out.printf("\nEnter new surname:");
                                        String updateSurname = in.next();
                                        c1.setSurname(updateSurname);
                                        System.out.printf("\nUpdating is successful.");
                                        break;
                                    case 3:
                                        System.out.printf("\nEnter new gender (male or female):");
                                        String updateGender = in.next();
                                        c1.setGender(updateGender);
                                        System.out.printf("\nUpdating is successful.");
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.printf("There is no such option!");
                                        break;
                                } 
                            }
                        }
                    break;
                case 5:
                    System.out.printf("\nPlease enter the Id of the customer you want to add money to? :");
                    int answer_id1 = in.nextInt();
                    for (Iterator<Customer> it1 = Bank.CustomerList.iterator(); it1.hasNext();   )
                        {
                            c1 = it1.next();
                            if(c1.getId()== answer_id1)
                            {
                                System.out.printf("\nHow much money do you want to add? :");
                                double creditAdding  = in.nextDouble();
                                c1.creditAdding(creditAdding);
                                System.out.printf("\nAdding is successful. :");
                            }                                     
                        }
	            break;
                case 6:
                    System.out.printf("\nPlease enter the Id of the customer you want to withdraw money to? :");
                    int answer_id2 = in.nextInt();
                    for (Iterator<Customer> it2 = Bank.CustomerList.iterator(); it2.hasNext();    )
                    {
                        c1 = it2.next();
                        if(c1.getId()== answer_id2)
                        {
                           System.out.printf("\nHow much money do you want to withdraw? :");
                           double creditWithdrawing  = in.nextDouble();
                           c1.creditWithdrawing(creditWithdrawing);
                           System.out.printf("\nWithdrawing is successful. :");
                        }                                     
                    }
	            break;
                case 0:
                    quit1 = true;
                    break;
                default:
                    System.out.printf("There is no such option. Try again.\n");   
                    break;
            }
           } while (!quit1);
        System.out.printf("\nBye!");
    }
}