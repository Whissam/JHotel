package jhotel;


/**
 * Class ini merupakan class untuk Double Room
 *
 * @author Whisnu Samudra
 * @version 15 Maret 2018
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;

    /**
     * Constructor for objects of class DoubleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
    }

    /**
     * Method untuk mendapatkan customer
     *
     *
     * @return    customer2 type Customer
     */
    public Customer getCustomer2()
    {
        // put your code here
        return customer2;
    }
    
    /**
     * Method untuk mendapatkan tipe kamar
     *
     * 
     * @return    TIPE_KAMAR type TipeKamar
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }
    
    /**
     * Method untuk mengeset customer
     *
     * @param  customer2 type Customer
     * 
     */
    public void setCustomer2(Customer customer2)
    {
        this.customer2=customer2;
    }
    
}
