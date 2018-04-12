
/**
 * Class ini merupakan class untuk Single Room
 *
 * @author Whisnu Samudra
 * @version 15 Maret 2018
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your own
    private static TipeKamar TIPE_KAMAR = TipeKamar.SINGLE;
    

    /**
     * Constructor for objects of class SingleRoom
     */
    public SingleRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel,nomor_kamar,isAvailable,status_kamar);
        
    }

    /**
     * Method untuk mendapatkan tipe kamar
     *
     * 
     * @return    TIPE_KAMAR type TipeKamar
     */
    public TipeKamar getTipeKamar()
    {
        // put your code here
        return TIPE_KAMAR;
    }
}
