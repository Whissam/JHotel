import java.util.ArrayList;
/**
 * Class ini merupakan class yang digunakan untuk menambahkan atau mengurangi
 * data pada list pesanan
 *
 * @author Whisnu Samudra
 * @version 1/3/2018
 */
public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;
    /**
     * Constructor for objects of class DatabasePesanan
     */
    public DatabasePesanan()
    {
        // initialise instance variables
        
    }
    
     /**
     * Method untuk menambahkan pesanan ke dalam database
     *
     * @param  baru type Pesanan
     * @return    false type boolean
     */
    public static boolean addPesanan(Pesanan baru)
    {
        if(getPesananAktif(baru.getPelanggan())==null){
            PESANAN_DATABASE.add(baru);
            LAST_PESANAN_ID = baru.getID();
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Method untuk menghilangkan pesanan dari database
     *
     * @param  baru type Pesanan
     * @return    false type boolean
     */
    public static boolean removePesanan(Pesanan pesan)
    {
        for(Pesanan p : PESANAN_DATABASE)
        {
            if(p.getRoom()!= null)
            {
                    Administrasi.pesananDibatalkan(pesan);
                    PESANAN_DATABASE.remove(p);
                    return true;

            }
            else if (p.getStatusAktif()==true)
            {
                pesan.setStatusAktif(false);
                PESANAN_DATABASE.remove(p);
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
    
    /**
     * Method untuk mendapatkan pesanan pada database
     *
     * @param  cust type Customer
     * @return    null type Pesanan
     */
    public static Pesanan getPesanan(int id)

    {
        for(Pesanan p : PESANAN_DATABASE)
        {
         if(p.getID()==id)
         {
             return p;
         }
         else
         {
             return null;
         }
        }
        return null;
    }

    public static Pesanan getPesanan(Room kamar)
    {
        for(Pesanan p : PESANAN_DATABASE)
        {
            if(p.getRoom().equals(kamar))
            {
                return p;
            }
            else
            {
                return null;
            }
        }
        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan p : PESANAN_DATABASE)
        {
            if(p.getStatusAktif()==true)
            {
                return p;
            }
            else
            {
                return null;
            }
        }
        return null;
    }
    /**
     * Method untuk mendapatkan pesanan pada database
     *
     * 
     * @return    null type String[]
     */

    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }

    public static int getLastPesananID()
    {
        return LAST_PESANAN_ID;
    }

}
