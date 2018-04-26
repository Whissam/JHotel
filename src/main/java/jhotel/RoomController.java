package jhotel;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.ArrayList;

@RestController
public class RoomController {

    @RequestMapping(value = "/vacantrooms", method = RequestMethod.GET)
    public ArrayList<Room> vacantRooms() {
        ArrayList<Room> arrRoom = DatabaseRoom.getVacantRooms();
        return arrRoom;
    }

    @RequestMapping(value = "/room/{id_hotel}/{room_no}", method = RequestMethod.GET)
    public Room getRoom(@RequestParam(value = "id_hotel") int id_hotel, @RequestParam(value = "nomor_kamar") String nomor_kamar) {
        Room room = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar);
        return room;
    }
}
