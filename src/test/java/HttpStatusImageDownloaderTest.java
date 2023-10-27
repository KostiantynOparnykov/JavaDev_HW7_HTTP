import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class HttpStatusImageDownloaderTest {
    @Test
    void imageDownloadSuccessTest() {
        HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
        downloader.downloadStatusImage(200);
        File file = new File("src\\main\\resources\\200.jpg");
        assertTrue(file.exists());
    }
    @Test
    void imageDownloadFailTest() {
        HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
        assertThrows(IllegalArgumentException.class, () ->downloader.downloadStatusImage(666));
    }
}