import java.util.*;
import java.text.*;
import java.util.regex.*;
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
    protected String email;
    protected Date dob;

    /**
     * Constructor for objects of class Customer
     */
    
    
    public Customer (int id, String nama, int year, int month, int date)
    {
        this.id=id;
        this.nama=nama;
        this.dob=new GregorianCalendar(year,month,date).getTime();
    }
    
     public Customer (int id, String nama,Date dob)
    {
        this.id=id;
        this.nama=nama;
        this.dob=dob;
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
     * @return    nama type String
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Method untuk mendapatkan email yang telah diset
     *
     * 
     * @return    email type String
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Method untuk mendapatkan tanggal lahir yang telah diset
     *
     * 
     * @return    dob type Date
     */
    public Date getDOB()
    {
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
       System.out.println("DOB: " + dateFormat.format(dob));
       return dob;
    }
    
    /**
     * Method untuk mengeset ID
     *
     * @param  id type integer
     * 
     */
    public void setID (int id)
    {
        this.id=id; //untuk mengeset ID Customer
    }
    
    /**
     * Method untuk mengeset nama
     *
     * @param  nama type String
     * 
     */
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    
    /**
     * Method untuk mengeset email
     *
     * @param  email type String
     * 
     */
    public void setEmail(String email)
    {
        Pattern ptr = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        System.out.println(email + " is " + (ptr.matcher(email).matches() ? "valid" : "invalid"));
    
    }
    
    /**
     * Method untuk mengeset tanggal lahir
     *
     * @param  dob type Date
     * 
     */
    public void setDOB(Date dob)
    {
        this.dob=dob;
    }
    
    /**
     * Method untuk mencetak identitas pelanggan
     *
     * @param  
     * 
     */

    public String toString()
    {
        if(DatabasePesanan.getPesanan(this)==null)
        {
            System.out.println("\nCusomter ID : " +id +
            "\nName: " + nama +
            "\nEmail: " + email +
             getDOB());
             return null;
            }
             else
             {
             System.out.println("\nCusomter ID : " +id +
            "\nName: " + nama +
            "\nEmail: " + email +
             getDOB() +
             "Booking order is in progress");
             return null;
            }
                 
             
    }

    

    
    
}