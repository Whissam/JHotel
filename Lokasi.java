
/**
 * Class ini merupakan class yang digunakan untuk menunjukkan lokasi hotel
 *
 * @author Whisnu Samudra
 * @version 1/3/2018
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

    /**
     * Constructor for objects of class Lokasi
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        this.x_coord=x_coord;
        this.y_coord=y_coord;
        this.deskripsiLokasi=deskripsiLokasi;// initialise instance variables
        
    }

    /**
     * Method untuk mendapatkan koordinat x yang telah diset
     *
     * 
     * @return    x_coord type float
     */
    
    
    public float getX()
    {
        return x_coord;
    }
    /**
     * Method untuk mendapatkan koordinat y yang telah diset
     *
     * 
     * @return    y_coord type float
     */
    public float getY()
    {
        return y_coord;
    }
    /**
     * Method untuk mendapatkan deskripsi yang telah diset
     *
     * 
     * @return    deskripsiLokasi type String
     */
    public String getDiskripsi()
    {
        return deskripsiLokasi;
    }
    /**
     * Method untuk mengeset koordinat x
     *
     * @param  x_coord type float
     * 
     */
    public void setX (float x_coord)
    {
        this.x_coord = x_coord;
    }
    /**
     * Method untuk mengeset koordinat y
     *
     * @param  y_coord type float
     * 
     */
    public void setY (float y_coord)
    {
        this.y_coord = y_coord;
    }
    /**
     * Method untuk mengeset deskripsi
     *
     * @param  deskripsi type String
     * 
     */
    public void setDiskripsi (String deskripsi)
    {
        deskripsiLokasi=deskripsi;
    }
    /**
     * Method untuk mencetak deskripsi lokasi
     *
     * @param  deskripsiLokasi type String
     * 
     */
    public void printData()
    {
        
        System.out.println("Koordinat X: " + x_coord);
        System.out.println("Koordinat Y: " + y_coord);
        System.out.println("Deskripsi: " + deskripsiLokasi);
        //mencetak deskripsi lokasi
    }
    
    
}
