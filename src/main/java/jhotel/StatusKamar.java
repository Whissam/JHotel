package jhotel;
/**
 * Enumeration class StatusKamar - Enum untuk Status Kamar
 *
 * @author Whisnu Samudra
 * @version 8 Maret 2018
 */
public enum StatusKamar
{
    BOOKED("Booked"), PROCESSED("Processed"), VACANT("Vacant");
    
    private String element;
    
    StatusKamar()
    {
    }
    
    StatusKamar(String element){
        this.element=element;
    }
    
     public String toString()
     {
        return element;
    }
}
