package jhotel;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.GregorianCalendar;

@RestController
public class PesananController {

    @RequestMapping(value = "/pesanancustomer/{id_customer}", method = RequestMethod.GET)
    public Pesanan pesananCust(@PathVariable (value="id_customer") int id_customer) {
        Customer cust = DatabaseCustomer.getCustomer(id_customer);
        Pesanan pesancust = DatabasePesanan.getPesananAktif(cust);
        return pesancust;
    }

    @RequestMapping(value = "/pesanan/{id_pesanan}", method = RequestMethod.GET)
    public Pesanan getPesanan(@PathVariable (value = "id_pesanan") int id_pesanan) {
        Pesanan pesan = DatabasePesanan.getPesanan(id_pesanan);
        return pesan;
    }

    @RequestMapping(value = "/bookpesanan", method = RequestMethod.POST)
    public Pesanan buatPesanan(@RequestParam (value = "jumlah_hari") int jumlah_hari, @RequestParam (value="id_customer") int id_customer, @RequestParam (value= "id_hotel") int id_hotel, @RequestParam
            (value= "nomor_kamar") String nomor_kamar) throws PesananSudahAdaException {
        Customer cust = DatabaseCustomer.getCustomer(id_customer);
        Pesanan baru = new Pesanan(jumlah_hari, cust);
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        DatabasePesanan.addPesanan(baru);
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(cust), DatabaseRoom.getRoom(hotel, nomor_kamar));
        baru.setTanggalPesan(new GregorianCalendar().getTime());
        return baru;
    }

    @RequestMapping(value = "/cancelpesanan", method = RequestMethod.POST)
    public Pesanan batalkanPesanan(@RequestParam (value="id_pesanan") int id_pesanan) {
        Pesanan pesan = DatabasePesanan.getPesanan(id_pesanan);
        Administrasi.pesananDibatalkan(pesan);
        return pesan;
    }

    @RequestMapping(value = "/finishpesanan", method = RequestMethod.POST)
    public Pesanan selesaikanPesanan(@RequestParam (value="id_pesanan") int id_pesanan) {
        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }
}
