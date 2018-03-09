
/**
 * Class ini merupakan Class yang digunakan untuk melihat status pesanan
 * dan juga mengeset pesanan
 * 
 *
 * @author Whisnu Samudra
 * @version 1/3/2018
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;

    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya=biaya;
        this.pelanggan=pelanggan;
        // initialise instance variables
        
    }
    /**
     * Method untuk mendapatkan biaya yang telah diset
     *
     * 
     * @return    biaya type double
     */
    public double getBiaya()
    {
        return biaya;
    }
    /**
     * Method untuk mendapatkan pelanggan yang telah diset
     *
     * 
     * @return    pelanggan type Customer
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
    public String getNamaPelanggan()
    {
        return nama_pelanggan;
    }
    
    public TipeKamar getTipeKamar()
    {
        return tipe_kamar;
    }
    
    /**
     * Method untuk mendapatkan status yang sedang diproses
     *
     * 
     * @return    isDiproses type boolean
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    /**
     * Method untuk mendapatkan status yang telah selesai
     *
     * 
     * @return    isSelesai type boolean;
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
    public Room getRoom()
    {
        return kamar;
    }
    
    /**
     * Method  untuk mengeset biaya
     *
     * @param  biaya type double
     * 
     */
    public void setBiaya(double biaya)
    {
        this.biaya = biaya; //untuk mengeset biaya yang akan dibayar
    }
    /**
     * Method untuk mengeset pelanggan
     *
     * @param  baru type Customer
     * 
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan=pelanggan;
    }
    
    public void setNamaPelanggan(String nama_pelanggan)
    {
        this.nama_pelanggan=nama_pelanggan;
    }
    
    public void setTipeKamar(TipeKamar tipe_kamar)
    {
        this.tipe_kamar=tipe_kamar;
    }
    
    /**
     * Method untuk mengeset status diproses
     *
     * @param  diproses type Boolean
     * 
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses=diproses;
    }
    /**
     * Method untuk mengeset status selesai
     *
     * @param  diproses type boolean
     * 
     */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai=selesai;
    }
    
    public void setRoom(Room kamar)
    {
     this.kamar=kamar;
    }
    
    /**
     * Method untuk mencetak biaya
     *
     * @param  biaya type double
     * 
     */

    public void printData()
    {
        
        pelanggan.printData();
        System.out.println("Tipe Kamar: " + tipe_kamar);
        System.out.println("Status layanan diproses: " + isDiproses);
        System.out.println("Status layanan selesai: " + isSelesai);
    }        
}
