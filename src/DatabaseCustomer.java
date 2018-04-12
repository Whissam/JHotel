
/**
 * Class ini merupakan class yang digunakan untuk menambahkan atau mengurangi
 * list customer
 *
 * @author Whisnu Samudra
 * @version 1/3/2018
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private Customer list_customer;

    /**
     * Method untuk menambahkan customer ke dalam database
     *
     * @param  baru type Customer
     * 
     */
    public static boolean addCustomer(Customer baru)
    {
        return false;// initialise instance variables
        
    }
    
    /**
     * Method untuk menghilangkan customer dari database
     *
     * @param  id type integer
     * 
     */
    public boolean removeCustomer(int id)
    {
        return false;
    }
    
    /**
     * Method untuk mendapatkan database customer
     *
     * @return  list_cutomer type Customer
     * 
     */
    public Customer getCustomerDatabase()
    {
        return list_customer;
    }

}
