package jhotel;
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
        if (kamar.getStatusKamar().equals(StatusKamar.VACANT)){
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(true);
            pesan.setRoom(kamar);
            DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.BOOKED);
        }
        else{
            pesan.setStatusAktif(false);
        }
        // put your code here
        

        
    }

    
    /**
     * Method untuk membatalkan pesanan
     *
     * @param  kamar type Room
     * 
     */
    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        if(pesan!=null) {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(false);
            pesan.setStatusAktif(false);
        }
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.VACANT);

    }
    
    /**
     * Method untuk menyelesaikan pesanan
     *
     * @param  kamar type Room
     * 
     */
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
    }
    
    /**
     * Method untuk membatalkan pesanan
     *
     * @param  pesan type Pesanan
     * 
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(), pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusAktif(false);

    }
    
    /**
     * Method untuk menyelesaikan pesanan
     *
     * @param  pesan type Pesanan
     * 
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(), pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }
        
}
