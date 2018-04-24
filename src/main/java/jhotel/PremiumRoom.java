package jhotel;


/**
 * Class ini merupakan class untuk premium room
 *
 * @author Whisnu Samudra
 * @version 15 Maret 2018
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private static double DISCOUNT = 0.3;
    private static TipeKamar TIPE_KAMAR = TipeKamar.PREMIUM;

    /**
     * Constructor for objects of class PremiumRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
    }

    /**
     * Method untuk mendapatkan tpe kamar
     *
     * 
     * @return    TIPE_KAMAR type TipeKamar
     */
    public TipeKamar getTipeKamar()
    {
        // put your code here
        return TIPE_KAMAR;
    }
    
    /**
     * Method untuk mendapatkan discount
     *
     * 
     * @return    DISCOUNT type double
     */
    public double getDiscount()
    {
        return DISCOUNT;
    }
    
    /**
     * Method untuk mengeset tarif
     *
     * @param  dailytariff type double
     * 
     */
    public void setDailyTariff (double dailytariff)
    {
        dailytariff*=DISCOUNT;
    }
    
}
