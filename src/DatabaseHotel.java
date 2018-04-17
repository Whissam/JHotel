import java.util.ArrayList;

/**
 * Class ini merupakan class untuk database hotel
 *
 * @author Whisnu Samudra
 * @version 9 Maret 2018
 */
public class DatabaseHotel
{
    // instance variables - replace the example below with your own
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * Constructor for objects of class DatabaseHotel
     */
    public DatabaseHotel()
    {
        // initialise instance variables
        
    }

    public static int getLastHotelID()
    {
        return LAST_HOTEL_ID;
    }

    /**
     * Method untuk menambahkan hotel ke dalam database
     *
     * @param  baru type Hotel
     * @return    false type boolean
     */
    public boolean addHotel(Hotel baru)
    {
        for(Hotel h:HOTEL_DATABASE){
            if(h.getId() != baru.getId())
            {
                HOTEL_DATABASE.add(baru);
                LAST_HOTEL_ID = baru.getId();
                return true;
            }
        }
        return false;
    }
    
    /**
     * Method untuk menghilangkan hotel dari database
     *
     * @param  id type integer
     * @return    false type boolean
     */
    public boolean removeHotel(int id) {
        for (Hotel h : HOTEL_DATABASE) {
            if (h.getId() != id) {
                for (Room k : DatabaseRoom.getRoomsFromHotel(h)) {
                    DatabaseRoom.removeRoom(h, k.getNomorKamar());

                }
                HOTEL_DATABASE.remove(h);
                return true;
            }

        }
        return false;
    }
    
    /**
     * Method untuk mendapatkan hotel pada database
     *
     * 
     * @return    list_hotel type String[]
     */
    public ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }

    public static Hotel getHotel(int id)
    {
        for(Hotel h:HOTEL_DATABASE){
            if(h.getId() == id)
            {
                return h;
            }
        }
        return null;
    }
}
