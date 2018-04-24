package jhotel;
/**
 * Write a description of class TipeKamar here.
 *
 * @author Whisnu Samudra
 * @version 3 Maret 2018
 */
public enum TipeKamar
{
    // instance variables - replace the example below with your own
    SINGLE("Single"), DOUBLE("Double"), PREMIUM("Premium");
    public String element;
    
    TipeKamar()
    {
    }
    
    TipeKamar(String element){
        this.element=element;
    }
    
     public String toString()
     {
        return element;
    }
}
    


    