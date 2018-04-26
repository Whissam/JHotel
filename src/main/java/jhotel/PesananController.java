package jhotel;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.GregorianCalendar;

@RestController
public class PesananController {

    @RequestMapping(value = "/pesanancustomer/{id_customer}", method = RequestMethod.GET)
    public Pesanan pesananCust(@RequestParam (value="id_customer") int id_customer) {
        Pesanan pesancust = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return pesancust;
    }

    @RequestMapping(value = "/pesanan/{id_pesanan}/", method = RequestMethod.GET)
    public Pesanan getPesanan(@RequestParam(value = "id_pesanan") int id_pesanan) {
        Pesanan pesan = DatabasePesanan.getPesanan(id_pesanan);
        return pesan;
    }

    @RequestMapping(value = "/bookpesanan/", method = RequestMethod.GET)
    public Pesanan buatPesanan(@RequestParam(value = "jumlah_hari") int jumlah_hari, @RequestParam (value="id_customer") int id_customer, @RequestParam (value= "id_hotel") int id_hotel, @RequestParam
            (value= "nomor_kamar") String nomor_kamar) throws PesananSudahAdaException {
        Pesanan baru = new Pesanan(jumlah_hari, DatabaseCustomer.getCustomer(id_customer));
        DatabasePesanan.addPesanan(baru);
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar));
        baru.setTanggalPesan(new GregorianCalendar().getTime());
        return DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
    }

    @RequestMapping(value = "/cancelpesanan", method = RequestMethod.POST)
    public Pesanan batalkanPesanan(@RequestParam (value="id_pesanan") int id_pesanan) {
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }

    @RequestMapping(value = "/finishpesanan", method = RequestMethod.POST)
    public Pesanan selesaikanPesanan(@RequestParam (value="id_pesanan") int id_pesanan) {
        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }
}
