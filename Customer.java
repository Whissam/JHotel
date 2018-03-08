
/**
 * Class ini merupakan class yang digunakan untuk mengeset data Customer
 *
 * @author Whisnu Samudra
 * @version 1/3/2018
 */
public class Customer
{
    // instance variables - replace the example below with your own
    protected int id;
    protected String nama;

    /**
     * Constructor for objects of class Customer
     */
    
    
    public Customer (int id, String nama)
    {
        this.id=id;
        this.nama=nama;
    }
    /**
     * Method untuk mendapatkan ID yang telah diset
     *
     *  
     * @return    id type integer
     */
    public int getID()
    {
        return id;
    }
    /**
     * Method untuk mendapatkan nama yang telah diset
     *
     * 
     * @return    String type nama
     */
    public String getNama()
    {
        return nama;
    }
    /**
     * Method untuk mengeset ID
     *
     * @param  int id
     * 
     */
    public void setID (int id)
    {
        this.id=id; //untuk mengeset ID Customer
    }
    /**
     * Method untuk mengeset nama
     *
     * @param  String nama
     * 
     */
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    /**
     * Method untuk mencetak nama
     *
     * @param  String nama
     * 
     */
    public void printData()
    {
        System.out.println(nama);
    }
    

    
    
}
