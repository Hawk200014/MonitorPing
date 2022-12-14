import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Ping ping = new Ping();
        OpenSpeedtest os = new OpenSpeedtest();
        int maxatteps = 5;
        int atteps = 0;
        while (true){
            if(!ping.getPingIsOk()){
                atteps++;
                System.out.println("Attempt: " + atteps);
                if(atteps > maxatteps) {
                    os.OpenBrowser();
                    atteps = 0;
                    try {
                        TimeUnit.MINUTES.sleep(3);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted while waiting");
                    }
                }
            }
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Interrupted while waiting");
            }
        }
    }
}