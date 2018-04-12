import java.util.*;
import java.text.*;
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
    private int id;
    private boolean isAktif;

    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double jumlahHari, Customer pelanggan, boolean isAktif, int year, int month, int date)
    {
        this.jumlahHari=jumlahHari;
        this.pelanggan=pelanggan;
        this.biaya = jumlahHari * getRoom().getDailyTariff();
        this.tanggalPesan=new GregorianCalendar(year,month,date).getTime();
        this.isAktif=true;
        // initialise instance variables
        
    }
     public Pesanan(double jumlahHari, Customer pelanggan, Room kamar,Date tanggalPesan, boolean isAktif)
     {
        this.jumlahHari=jumlahHari;
        this.pelanggan=pelanggan;
        this.kamar=kamar;
        this.tanggalPesan=tanggalPesan;
        this.isAktif=isAktif;
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
     * Method untuk mendapatkan jumlah hari yang telah diset
     *
     * 
     * @return    jumlahHari type double
     */
    public double getJumlahHari()
    {
        return jumlahHari;
    }
    
    /**
     * Method untuk mendapatkan nama pelanggan yang telah diset
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
    
    /**
     * Method untuk mendapatkan kamar yang telah diset
     *
     * 
     * @return    kamar type Room
     */
    public Room getRoom()
    {
        return kamar;
    }
    
    /**
     * Method untuk mendapatkan tanggal pesan yang telah diset
     *
     * 
     * @return    tanggalPesan type Date
     */
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

    public int getID()
    {
        return id;
    }

    public boolean getStatusAktif()
    {
        return isAktif;
    }

    public void setBiaya(double biaya)
    {
        
        biaya = getBiaya() * getRoom().getDailyTariff();
    }
    
    /**
     * Method  untuk mengeset jumlah hari
     *
     * @param  jumlahHari type double
     * 
     */
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari; //untuk mengeset biaya yang akan dibayar
    }
    
    /**
     * Method untuk mengeset pelanggan
     *
     * @param  pelanggan type Customer
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
    
    /**
     * Method  untuk mengeset kamar
     *
     * @param  kamar type Room
     * 
     */
    public void setRoom(Room kamar)
    {
     this.kamar=kamar;
    }
    
    /**
     * Method  untuk mengeset tanggal pesan
     *
     * @param  tanggalPesan type Date
     * 
     */
    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan=tanggalPesan;
    }
    
    /**
     * Method untuk mencetak info pesanan
     *
     * @param  
     * 
     */

    public void setID(int id){
        this.id=id;
    }

    public void setStatusAktif(boolean isAktif)
    {
        this.isAktif=isAktif;
    }

    public String toString()
    {
        String final_status = "KOSONG";
        if(isDiproses == true && isSelesai == false) final_status = "DIPROSES";
        else if(isDiproses == false && isSelesai == false) final_status = "KOSONG";
        else if(isDiproses == false && isSelesai == true) final_status = "SELESAI";
        
        return "Dibuat oleh " + getPelanggan().getNama()
            + ". Proses booking untuk " + getRoom().getHotel().getNama()
            + "kamar nomor " + getRoom().getNomorKamar()
            + "dengan tipe kamar yang diinginkan " + getRoom().getTipeKamar().toString()
            + ". Status: " + final_status + ".";
        }
}
