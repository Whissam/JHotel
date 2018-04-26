package jhotel;


import org.springframework.web.bind.annotation.*;

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
    public Hotel getHotel(@PathVariable(value="id_hotel") int id_hotel)
    {
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        return hotel;
    }
}
