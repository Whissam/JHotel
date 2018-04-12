import java.util.*;

/**
 * Class ini merupakan Main Class dari keseluruhan program.
 *
 * @author Whisnu Samudra
 * @version 1 Maret 2018
 */
public class JHotel
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class JHotel
     */
    
    public JHotel()
    {
        // initialise instance variables
        
    }
    
    /**
     * Method  main untuk menjalankan fungsi-fungsi
     *
     * @param  args type String[]
     * 
     */
    public static void main(String[] args)
    {
        
        
         Customer pelanggan = new Customer(2, "Samudra", new GregorianCalendar(2018,02,20).getTime());
                 
         //Customer cust = new Customer(3, "Sam");
         //Customer pel = new Customer(4, "Whis");
         //cust.setEmail("Ee_.td@ui.ac.id");
         //pel.setEmail("whisnusamudra.modul5@netlab.com");
         pelanggan.getDOB();
         
         
        
        /*
        Customer tes=new Customer(1 ,"wew"); membuat objek 
        Lokasi tes1=new Lokasi (112, 234, "FTUI");
        Hotel testes=new Hotel ("Wow", tes1, 2);
        Pesanan tustus=new Pesanan(334, tes);
        tes.printData(); manggil method
        tes.setNama("wow"); manggil  method merubah nama
        tes.printData(); manggil method
        tustus.printData(); manggil method
        DatabaseCustomer.addCustomer(tes); manggil method dari class yang belum dibuat objeknya
        */
    }
    
}
