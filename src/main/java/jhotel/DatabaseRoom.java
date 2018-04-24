package jhotel;



import java.util.ArrayList;
/**
 * Class ini merupakan class untuk database room
 *
 * @author Whisnu Samudra
 * @version 9 Maret 2018
 */
public class DatabaseRoom
{
    // instance variables - replace the example below with your own
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();


    /**
     * Constructor for objects of class DatabaseRoom
     */
    public DatabaseRoom()
    {
        // initialise instance variables
        
    }

    /**
     * Method untuk menambahkan kamar ke dalam database
     *
     * @param  baru type Room
     * @return    false type boolean
     */
    public static boolean addRoom(Room baru) throws RoomSudahAdaException
    {
        if(baru.getHotel() != null){
        for(Room k:ROOM_DATABASE){
        if(k.getHotel().equals(baru.getHotel()) ){
            if(k.getNomorKamar().compareTo(baru.getNomorKamar())==0){
                throw new RoomSudahAdaException(baru);
            }
        }
        }
            ROOM_DATABASE.add(baru);
            return true;
    }
    else return false;
    }



    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for(Room k:ROOM_DATABASE){
            if(k.getHotel().equals(hotel) && k.getNomorKamar().compareTo((nomor_kamar)) == 0)
            {
                return k;
            }
        }
        return null;
    }

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> ArRoom= new ArrayList<Room>();
        for(Room k:ROOM_DATABASE){
            if(k.getHotel().equals(hotel))
            {
                ArRoom.add(k);
            }
        }
        return ArRoom;
    }

    public static ArrayList<Room> getVacantRooms()
    {
        ArrayList<Room> ArRoom= new ArrayList<Room>();
        for(Room k:ROOM_DATABASE){
            if(k.getStatusKamar().equals(StatusKamar.VACANT))
            {
                ArRoom.add(k);
            }
        }
        return ArRoom;
    }

    /**
     * Method untuk menghilangkan kamar dari database
     *
     * @param
     * @return    false type boolean
     */
    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException
    {
        for(Room k:ROOM_DATABASE){
            if(k.getHotel().equals(hotel) && k.getNomorKamar().compareTo((nomor_kamar)) == 0)
            {
                Administrasi.pesananDibatalkan(k);
                ROOM_DATABASE.remove(k);
                return true;
            }
        }
        throw new RoomTidakDitemukanException(hotel, nomor_kamar);
    }
    
    /**
     * Method untuk mendapatkan kamar pada database
     *
     * 
     * @return    list_room type String[]
     */
    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }
    
}
