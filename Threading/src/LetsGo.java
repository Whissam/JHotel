import java.util.concurrent.ThreadLocalRandom;
public class LetsGo {
    public static int min = 100;
    public static int max = 500;

    public LetsGo()
    {

    }

    public static int random(){
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }


    public static void main(String[] args){

        RunForYourLife lionel = new RunForYourLife("Lionel");
        lionel.start();
        RunForYourLife andres = new RunForYourLife("Andres");
        andres.start();
        RunForYourLife messi = new RunForYourLife("Messi");
        messi.start();
    }
}
