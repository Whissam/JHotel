


/**
 * Class ini merupakan class untuk mengeset informasi tentang hotel seperti
 * nama, lokasi, dan bintang
 *
 * @author Whisnu Samudra
 * @version 1/3/2018
 */
public class Hotel
{
    // instance variables - replace the example below with your own
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    private int id;
    /**
     * Constructor for objects of class Hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        this.nama=nama;
        this.lokasi=lokasi;
        this.bintang=bintang;
        this.id=DatabaseHotel.getLastHotelID()+1;
        // initialise instance variables
        
    }

    public int getId() {
        return id;
    }

    /**
     * Method untuk mendapatkan bintang yang telah diset
     *
     * 
     * @return    bintang type int
     */
    
    
    public int getBintang()
    {
        return bintang;
    }
    /**
     * Method untuk mendapatkan nama yang telah diset
     *
     * 
     * @return    nama type String
     */
    public String getNama()
    {
        return nama;
    }
    /**
     * Method untuk mendapatkan lokasi yang telah diset
     *
     * 
     * @return    lokasi type Lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    /**
     * Method untuk mengeset nama
     *
     * @param  nama type String
     * 
     */
    public void setNama (String nama)
    {
        this.nama=nama;
    }
    /**
     * Method untuk mengeset lokasi
     *
     * @param  lokasi type Lokasi
     * 
     */
    public void setLokasi (Lokasi lokasi)
    {
        this.lokasi=lokasi;
    }
    /**
     * Method untuk mengeset bintang
     *
     * @param  bintang type int
     * 
     */
    public void setBintang (int bintang)
    {
        this.bintang=bintang;//untuk mengeset bintang hotel
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method untuk mencetak informasi hotel
     *
     * @param  
     * 
     */

    
    public String toString()
    {
        return("\nHotel" +
        "\nNama Hotel: " + nama +
        "\nLokasi: " + getLokasi().getDeskripsi() +
        "\nBintang: " + bintang);
    }  
}
