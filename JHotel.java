
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
        Room kamar=new Room(tes, "101A", true, tes2, 500000, StatusKamar.BOOKED);
        Pesanan order=new Pesanan(500000, tes2);
        System.out.println("Welcome to JHotel");
        tes1.printData();
        tes2.printData();
        tes.printData();
        System.out.println("====================METHOD 1====================");
        Administrasi.pesananDitugaskan(order, kamar);
        order.printData();
        kamar.printData();
        System.out.println("====================METHOD 2====================");
        Administrasi.pesananDibatalkan(kamar);
        order.printData();
        kamar.printData();
        System.out.println("====================METHOD 3====================");
        Administrasi.pesananDitugaskan(order, kamar);
        Administrasi.pesananSelesai(kamar);
        order.printData();
        kamar.printData();
        System.out.println("====================METHOD 4====================");
        Administrasi.pesananDitugaskan(order, kamar);
        Administrasi.pesananDibatalkan(order);
        order.printData();
        kamar.printData();
        System.out.println("====================METHOD 5====================");
        Administrasi.pesananDitugaskan(order, kamar);
        Administrasi.pesananSelesai(order);
        order.printData();
        kamar.printData();
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
