import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

public class Ping {
    String pingip = "www.twitch.tv";
    public boolean getPingIsOk() {
        long currentTime = System.currentTimeMillis();
        boolean isPinged = false; // 2 seconds
        try {
            isPinged = InetAddress.getByName(pingip).isReachable(2000);
        } catch (IOException e) {
            System.out.println("Host is not Reachable");
            e.printStackTrace();
        }
        currentTime = System.currentTimeMillis() - currentTime;
        if(!isPinged){
            System.out.println("Ping is not ok! Millis: "+currentTime+" | Time: " + LocalDateTime.now());
            return false;
        }
        if(currentTime > 150){
            System.out.println("Ping is not ok! Millis: "+currentTime+" | Time: " + LocalDateTime.now());
            return false;
        }
        else{
            System.out.println("Ping is ok! Millis: "+ currentTime);
            return true;
        }
    }
}
