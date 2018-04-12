
/**
 * Write a description of class Room here.
 *
 * @author Whisnu Samudra
 * @version 8 Maret 2018
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;

    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel, String nomor_kamar,StatusKamar status_kamar)
    {
        this.hotel=hotel;
        this.nomor_kamar=nomor_kamar;
        this.status_kamar=status_kamar;// initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public Hotel getHotel()
    {
        return hotel;
    }
    
    
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    

    
    
    public double getDailyTariff()
    {
        return dailyTariff;
    }
    
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }
    
    public Pesanan getPesanan()
    {
        return pesan;
    }
    
    public abstract TipeKamar getTipeKamar();
    
        
    
    public void setHotel(Hotel hotel)
    {
        this.hotel=hotel;
    }
    
    
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar=nomor_kamar;
    }


    public void setDailyTariff(double dailytariff)
    {
        this.dailyTariff=dailytariff;
    }
    
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar=status_kamar;
    }
    
    public void setPesanan(Pesanan pesan)
    {
        this.pesan=pesan;
    }
    
    /*public String toString()
    {
        if(isAvailable)
        {
         System.out.println("\nNama Hotel : " + getHotel().getNama()
         + "\nTipe Kamar : " + getTipeKamar()
         + "\nHarga : " + getDailyTariff()
         + "\nStatus Kamar: " + getStatusKamar().toString());
         return null;
        }
        else
        {
         System.out.println("\nNama Hotel : " + getHotel().getNama()
         + "\nTipe Kamar : " + getTipeKamar()
         + "\nHarga : " + getDailyTariff()
         + "\nStatus Kamar: " + getStatusKamar().toString()
         + "Pelanggan : " + getPesanan().getPelanggan().getNama());
         return null;
        }
    }
*/
    
}
