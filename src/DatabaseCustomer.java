import java.util.ArrayList;
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
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * Method untuk menambahkan customer ke dalam database
     *
     * @param  baru type Customer
     * 
     */
    public static boolean addCustomer(Customer baru)
    {
     for(Customer c: CUSTOMER_DATABASE){
         if(c.getID() != baru.getID())
         {
             CUSTOMER_DATABASE.add(baru);
             LAST_CUSTOMER_ID = baru.getID();
             return true;
         }
     }
     return false;
        
    }

    public static Customer getCustomer(int id)
    {
        for(Customer c: CUSTOMER_DATABASE){
            if(c.getID() == id)
            {
                return c;
            }
        }
        return null;
    }
    
    /**
     * Method untuk menghilangkan customer dari database
     *
     * @param  id type integer
     * 
     */
    public boolean removeCustomer(int id)
    {
        for(Customer c: CUSTOMER_DATABASE){
            if(c.getID() == id)
            {
                for(Pesanan p: DatabasePesanan.getPesananDatabase()){
                    if(p.getPelanggan().equals(c))
                    {
                        DatabasePesanan.removePesanan(p);
                    }
                }
                CUSTOMER_DATABASE.remove(c);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Method untuk mendapatkan database customer
     *
     * @return  list_cutomer type Customer
     * 
     */
    public ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerId()
    {
        return LAST_CUSTOMER_ID;
    }

}
