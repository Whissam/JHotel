package jhotel;



import java.util.ArrayList;

/**
 * Class ini merupakan class untuk database hotel
 *
 * @author Whisnu Samudra
 * @version 9 Maret 2018
 */
public class DatabaseHotel {
    // instance variables - replace the example below with your own
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * Constructor for objects of class DatabaseHotel
     */
    public DatabaseHotel() {
        // initialise instance variables

    }

    /**
     * Method untuk mengambil data Hotel dari database
     *
     *
     * @return HOTEL_DATABASE type ArrayList<Hotel>
     */
    public static ArrayList<Hotel> getHotelDatabase() {
        return HOTEL_DATABASE;
    }

    /**
     * Method untuk mengambil data Hotel
     *
     * @param id type int
     * @return null
     */
    public static Hotel getHotel(int id) {
        for (Hotel h : HOTEL_DATABASE) {
            if (h.getId() == id) {
                return h;
            }
        }
        return null;
    }
    /**
     * Method untuk mengambil id hotel terakhir
     *
     *
     * @return LAST_HOTEL_ID type int
     */
    public static int getLastHotelID() {
        return LAST_HOTEL_ID;
    }

    /**
     * Method untuk menambahkan hotel ke dalam database
     *
     * @param baru type Hotel
     * @return true type boolean
     */
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException {
        for (Hotel h : HOTEL_DATABASE) {
            if (h.getId() == baru.getId() || h.getNama() == baru.getNama() && h.getLokasi().equals(baru.getLokasi())) {
                throw new HotelSudahAdaException(h);
            }
        }
        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getId();
        return true;
    }

    /**
     * Method untuk menghilangkan hotel dari database
     *
     * @param id type integer
     * @return true type boolean
     */
    public static boolean removeHotel(int id) throws HotelTidakDitemukanException {
        for (Hotel h : HOTEL_DATABASE) {
            if (h.getId() != id) {
                for (Room k : DatabaseRoom.getRoomsFromHotel(h)) {
                    try {
                        DatabaseRoom.removeRoom(h, k.getNomorKamar());
                    } catch (RoomTidakDitemukanException e) {
                    }
                    HOTEL_DATABASE.remove(h);
                    return true;
                }

            }
        }
        throw new HotelTidakDitemukanException(id);
    }
}

