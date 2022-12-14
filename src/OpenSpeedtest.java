import java.io.IOException;

public class OpenSpeedtest {

    public void OpenBrowser() {
        Runtime rt = Runtime.getRuntime();
        String url = "https://speedtest.vodafone.de/speedtest";
        try {
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
