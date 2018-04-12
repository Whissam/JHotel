
/**
 * Class ini merupakan class untuk proses administrasi
 *
 * @author Whisnu Samudra
 * @version 1 Maret 2018
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
       
    }

    /**
     * Method untuk menugaskan pesanan
     *
     * @param  pesan, kamar type Pesanan, Room
     * 
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        // put your code here
        
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        roomAmbilPesanan(pesan, kamar);
        
    }
    
    /**
     * Method untuk membooking kamar
     *
     * @param  pesan, kamar type Pesanan Room
     * 
     */
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.BOOKED);
        kamar.setPesanan(pesan);
        
        
    }
    
    /**
     * Method untuk mengosongkan kamar
     *
     * @param  kamar type Room
     * 
     */
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.VACANT);
        kamar.setPesanan(null);
    }
    
    /**
     * Method untuk membatalkan pesanan
     *
     * @param  kamar type Room
     * 
     */
    public static void pesananDibatalkan(Room kamar)
    {
        kamar.getPesanan().setStatusSelesai(false);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.getPesanan().setStatusAktif(false);
        kamar.getPesanan().setRoom(null);
        roomLepasPesanan(kamar);
    }
    
    /**
     * Method untuk menyelesaikan pesanan
     *
     * @param  kamar type Room
     * 
     */
    public static void pesananSelesai(Room kamar)
    {
        kamar.getPesanan().setStatusSelesai(true);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.getPesanan().setStatusAktif(false);
        kamar.getPesanan().setRoom(null);
        roomLepasPesanan(kamar);
        
    }
    
    /**
     * Method untuk membatalkan pesanan
     *
     * @param  pesan type Pesanan
     * 
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);   
    }
    
    /**
     * Method untuk menyelesaikan pesanan
     *
     * @param  pesan type Pesanan
     * 
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);   
    }
        
}
