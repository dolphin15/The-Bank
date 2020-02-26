//NIHAN AKINCI 

public class Customer 
{
    private int customerId ;
    private String customerName;
    private String customerSurname;
    private String customerGender;
    private double customerCredit;
   	
        public Customer()
        {}
        
        public Customer(int customerId, String customerName, String customerSurname, String customerGender, double customerCredit)
        {
            this.customerId = customerId;
            this.customerName = customerName;
            this.customerSurname = customerSurname;
            this.customerGender = customerGender;
            this.customerCredit = customerCredit;     
	}
        
        public int getId() 
        {
            return customerId;
        }
        
        public void setId(int customerId) 
        {
            this.customerId = customerId;
        }

        public String getName() 
        {
            return customerName;
        }
        
        public void setName(String customerName) 
        {
            this.customerName = customerName;
        }

        public String getSurname() 
        {
            return customerSurname;
        }
        
        public void setSurname(String customerSurname) 
        {
            this.customerSurname = customerSurname;
        }
        
        public String getGender() 
        {
            return customerGender;
        }
        
        public void setGender(String customerGender) 
        {
            this.customerGender = customerGender;
        }

        public double getCredit() 
        {
            return customerCredit;
        }
        
        public void setCredit(double customerCredit) 
        {
            this.customerCredit = customerCredit;
        }
        
        @Override
        public String toString()
        {
            return this.getId() + " " + this.getName() + " " + this.getSurname() + " " + this.getGender() + " " + this.getCredit();
        }
        
        public void creditAdding(double creditAdding)
        {   
            if (creditAdding <= 0)
            {
                System.out.println("You cannot add negative values and zero.");
            }
            else 
            {
                customerCredit = customerCredit + creditAdding;
            }    
        } 
         
        public void creditWithdrawing( double creditWithdrawing )
        {   
            if (customerCredit < creditWithdrawing)
            {
                System.out.println("Insufficient balance.");
            }
            else 
            {
                customerCredit = customerCredit - creditWithdrawing;
            }            
        } 
        
        public String getBalance()
        {
            return ""+customerCredit; 
        }   
}
