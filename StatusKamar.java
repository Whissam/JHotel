
/**
 * Enumeration class StatusKamar - write a description of the enum class here
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
