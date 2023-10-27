import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class HttpStatusCheckerTest {

    @Test
    void getStatusImageSuccessTest()

    {
        HttpStatusChecker checker = new HttpStatusChecker();
        String result = checker.getStatusImage(200);
        assertEquals("https://http.cat/200.jpg", result);
    }
    @Test
    void getStatusImageFailTest(){
        HttpStatusChecker checker = new HttpStatusChecker();
        assertThrows(IllegalArgumentException.class, () -> checker.getStatusImage(-1));
    }

}