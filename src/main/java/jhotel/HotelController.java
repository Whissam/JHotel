package jhotel;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HotelController {

    @RequestMapping(value="/hotel", method = RequestMethod.GET)
    public ArrayList<Hotel> hotelsList()
    {
    ArrayList<Hotel> arrHotel = DatabaseHotel.getHotelDatabase();
    return arrHotel;
    }

    @RequestMapping(value="/hotel/{id_hotel}", method = RequestMethod.GET)
    public Hotel getHotel(@RequestParam (value="id_hotel") int id_hotel)
    {
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        return hotel;
    }
}
