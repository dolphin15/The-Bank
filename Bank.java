//NIHAN AKINCI

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bank 
{
    static ArrayList <Customer> CustomerList = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int counter = 0;

        public void deleteCustomer(Customer c1,int idd)
        {
            for (Iterator<Customer> it = CustomerList.iterator(); it.hasNext();   )
                {
                    c1 = it.next();
                    if(c1.getId() == idd)
                        {
                            it.remove();
                        }                                     
                }
        }
        
        public void listAll()
        {
            Iterator <Customer> list1 =CustomerList.iterator();
            while(list1.hasNext())
                {
                    System.out.println(list1.next());
                }
        }
        
        public void listByName(Customer c1,String name)
        {
            for (Customer customerName : CustomerList) 
            {
	      if(customerName.getName().equals(name))
                {
                    System.out.println(customerName);
	            counter ++;   
	        }
	    }
	    System.out.printf("\n%d records found.\n", counter);
	    counter = 0 ;
        }
        
        public void listBySurname(Customer c1,String surname)
        {
            for (Customer customerSurname : CustomerList) 
            {
	      if(customerSurname.getSurname().equals(surname))
                {
                    System.out.println(customerSurname);
	            counter ++;   
	        }
	    }
	    System.out.printf("\n%d records found.\n", counter);
	    counter = 0 ;            
        }
        
        public void listByGender(Customer c1,String gender)   
        {
            for (Customer customerGender : CustomerList) 
            {
	      if(customerGender.getGender().equals(gender))
                {
                    System.out.println(customerGender);
	            counter ++;   
	        }
	    }
	    System.out.printf("\n%d records found.\n", counter);
	    counter = 0 ;            
        }
}
