import java.util.Date;
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
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar)
    {
        this.jumlahHari=jumlahHari;
        this.pelanggan=pelanggan;
        this.kamar=kamar;
        this.biaya = jumlahHari * getRoom().getDailyTariff();
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
    
    public double getJumlahHari()
    {
        return jumlahHari;
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
    
    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }
    
    /**
     * Method  untuk mengeset biaya
     *
     * @param  biaya type double
     * 
     */
    public void setBiaya(double biaya)
    {
        
        biaya = getBiaya() * getRoom().getDailyTariff();
    }
    
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari; //untuk mengeset biaya yang akan dibayar
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
    
    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan=tanggalPesan;
    }
    /**
     * Method untuk mencetak biaya
     *
     * @param  biaya type double
     * 
     */

    public void printData()
    {
        
        System.out.println("Nama: " + getPelanggan().getNama());
        System.out.println("Status layanan diproses: " + isDiproses);
        System.out.println("Status layanan selesai: " + isSelesai);
        System.out.println("Jumlah Hari: " + jumlahHari);
        System.out.println("Biaya: " +getBiaya());
    }        
}
