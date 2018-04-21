public class RunForYourLife implements Runnable {
    public Thread t;
    public String name;

    public RunForYourLife(String name){
        this.name=name;
        System.out.println("\n" + name + ", ready.");
    }


    public void run() {
        System.out.println("\n" + name + ", go!");
        try
        {
            for (int i=1 ;i<21;i++)
            {
                System.out.println("\n" + name + " has passed checkpoint " + i);
                if (name=="Lionel"){
                    Thread.sleep(LetsGo.random()*3);
                }
                else if (name=="Andres"){
                    Thread.sleep(LetsGo.random()*2);
                }
                else {
                    Thread.sleep(LetsGo.random());
                }
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("\n" + name + " was interrupted");
        }
        System.out.println("\n" + name + " has finished!");
    }

    public void start () {
        System.out.println("\n" + name + ", set...");
        if (t == null) {
            t = new Thread(this, name);
            t.start ();
        }
    }
}
