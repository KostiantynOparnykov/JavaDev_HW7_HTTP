import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class HttpStatusImageDownloader {
    public void downloadStatusImage(int code){
        String requestUrl = new HttpStatusChecker().getStatusImage(code);
        try {
            URLConnection openConnection = new URL(requestUrl).openConnection();
            openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
            BufferedImage image1 = ImageIO.read(openConnection.getInputStream());

            File file=new File("src/main/resources/" + code + ".jpg");
            ImageIO.write(image1, "jpg", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
