

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
        try{
            DatabaseCustomer.addCustomer(new Customer("Whisnu",2018,12,12, "whisnusamudra@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Sam",2017,11,11,"samudra819@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Udra",2016,10,10,"abcde@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Udra",2016,10,10,"abcde@gmail.com"));
        }
        catch(PelangganSudahAdaException e)
        {
            System.out.println("Exception Pelanggan sudah ada");
            System.out.println(e.getPesan());
        }


        //for(Customer c : DatabaseCustomer.getCustomerDatabase()){
          //  System.out.println(c);
        //}
        Lokasi kk = new Lokasi(14,15,"Tekkom");
        try{
            DatabaseHotel.addHotel(new Hotel("Tes",new Lokasi(12,13,"FTUI"), 5));
            DatabaseHotel.addHotel(new Hotel("Tes1",new Lokasi(13,14,"DTE"), 5));
            DatabaseHotel.addHotel(new Hotel("Tes2",kk,5));
            DatabaseHotel.addHotel(new Hotel("Tes2",kk, 5));
        }
        catch(HotelSudahAdaException e)
        {
            System.out.println("Exception Hotel sudah ada ");
            System.out.println(e.getPesan());
        }

        //for(Hotel h : DatabaseHotel.getHotelDatabase()){
          //  System.out.println(h);
        //}
        try{
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "Satu"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "Dua"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "Tiga"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "Tiga"));

        }
        catch(RoomSudahAdaException e)
        {
            System.out.println("Exception Room sudah ada");
            System.out.println(e.getPesan());

        }

        try {

          DatabasePesanan.addPesanan(new Pesanan(12, DatabaseCustomer.getCustomer(1)));
            DatabasePesanan.addPesanan(new Pesanan(11, DatabaseCustomer.getCustomer(2)));
            DatabasePesanan.addPesanan(new Pesanan(10, DatabaseCustomer.getCustomer(3)));
            DatabasePesanan.addPesanan(new Pesanan(10, DatabaseCustomer.getCustomer(3)));
        }
        catch(PesananSudahAdaException e)
        {
            System.out.println("Exception Pesanan sudah ada");
            System.out.println(e.getPesan());
        }
        try{
            DatabaseCustomer.removeCustomer(10);
        } catch(PelangganTidakDitemukanException e){
            System.out.println("---TES PELANGGAN TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }
        Customer me = new Customer("Whisnu",2017,1,2,"samudra819@gmail.com");
        Pesanan pesan = new Pesanan(32,me);
        try{
            DatabasePesanan.removePesanan(pesan);
        } catch(PesananTidakDitemukanException e){
            System.out.println("---TES PESANAN TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseHotel.removeHotel(29);
        } catch(HotelTidakDitemukanException e){
            System.out.println("---TES HOTEL TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseRoom.removeRoom(DatabaseHotel.getHotel(2),"Satu");
        } catch(RoomTidakDitemukanException e){
            System.out.println("---TES ROOM TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        System.out.println("===========HASIL==========");

        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println(DatabaseHotel.getHotelDatabase());
        System.out.println(DatabaseRoom.getRoomDatabase());
        System.out.println(DatabasePesanan.getPesananDatabase());



        //Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "Satu"));
        //for(Pesanan p : DatabasePesanan.getPesananDatabase()){
          //  System.out.println(p);
        //}
        //Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(2), "Dua"));
        //for(Pesanan p : DatabasePesanan.getPesananDatabase()){
          //  System.out.println(p);
        //}
        //Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(3), "Tiga"));
        //for(Pesanan p : DatabasePesanan.getPesananDatabase()){
          //  System.out.println(p);
        //}

        //Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)));
        //Customer pelanggan = new Customer(2, "Samudra", new GregorianCalendar(2018,02,20).getTime());

         //Customer cust = new Customer(3, "Sam");
         //Customer pel = new Customer(4, "Whis");
         //cust.setEmail("Ee_.td@ui.ac.id");
         //pel.setEmail("whisnusamudra.modul5@netlab.com");
        // pelanggan.getDOB();
         
         
        
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
