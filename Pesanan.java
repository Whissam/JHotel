
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
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;

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
    public void setPelanggan(Customer baru)
    {
        pelanggan=baru;
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
    public void setStatusSelesai(boolean diproses)
    {
        isSelesai=diproses;
    }
    /**
     * Method untuk mencetak biaya
     *
     * @param  biaya type double
     * 
     */
    public void printData(double biaya)
    {
        System.out.print(biaya);
    }    
   

    
    
}
