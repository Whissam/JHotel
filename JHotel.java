import java.util.regex.Matcher;

/**
 * Write a description of class JHotel here.
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
    public static void main(String[] args)
    {
        Lokasi tes1=new Lokasi(11, 12, "So far away");
        Hotel tes=new Hotel("Hotel Planet", tes1, 5);
        Customer tes2=new Customer(1, "Whisnu Samudra");
        Room tis= new SingleRoom(tes, "221B", true, StatusKamar.BOOKED);
        tis.setDailyTariff(100000);
        Pesanan tus=new Pesanan (7, tes2, tis);
        tes1.printData();
        tes2.printData();
        tes.printData();
        Administrasi.pesananDitugaskan(tus, tis);
        tus.printData();
        tis.printData();
        
        if(tis instanceof DoubleRoom)
        {
            System.out.println("Benar Double Room");
        }
        else 
        {
            System.out.println("Salah, bukan Double Room");
        }
        
        Room tis2 = new DoubleRoom (tes, "221C", true, StatusKamar.BOOKED);
        tis2.setDailyTariff(200000);
        Pesanan tos = new Pesanan (10, tes2, tis2);
        Administrasi.pesananDitugaskan(tos, tis2);
        tis2.printData();
        tos.printData();
        
        if(tis2 instanceof DoubleRoom)
        {
            System.out.println("Benar Double Room");
        }
        else 
        {
            System.out.println("Salah, bukan Double Room");
        }
        
         Customer pelanggan = new Customer(2, "Samudra");
         Customer cust = new Customer(3, "Sam");
         Customer pel = new Customer(4, "Whis");
         pelanggan.setEmail("e.t.d@");
         cust.setEmail("Ee_.td@ui.ac.id");
         pel.setEmail("whisnusamudra.modul5@netlab.com");
         
         
        
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
    
    public JHotel()
    {
        // initialise instance variables
        
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}
