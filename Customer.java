import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
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
     * @return    String type nama
     */
    public String getNama()
    {
        return nama;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public Date getDOB()
    {
       System.out.println("DOB: " +dob.getDate() +" " +dob.getMonth() +" " +dob.getYear());
       return dob;
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
    
    public void setEmail(String email)
    {
        Pattern ptr = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        System.out.println(email + " is " + (ptr.matcher(email).matches() ? "valid" : "invalid"));
    
    }
    
    public void setDOB(Date dob)
    {
        this.dob=dob;
    }
    
    /**
     * Method untuk mencetak nama
     *
     * @param  String nama
     * 
     */

    public void printData()
    {
        
        System.out.println("ID: " + id);
        System.out.println("Pelanggan: " + nama);
    }

    

    
    
}
