package sugoku;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe permettant de tester le package sugoku
 * @author Thierry Baribaud
 * @version 1.0.3
 */
public class SugokuTest {

    private static final String BASE_URL = "https://sugoku.onrender.com";

    public SugokuTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Sudoku.
     */
    @Test
    public void testMain() {

        System.out.println("BASE_URL:" + BASE_URL);

        OkHttpClient client = new OkHttpClient();

//        Request request = new Request.Builder()
//                .url(BASE_URL + "/board")
//                .build();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(BASE_URL + "/board").newBuilder();
        urlBuilder.addQueryParameter("difficulty", "hard");
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .build();
        Call call = client.newCall(request);
        Response response;
        try {
            response = call.execute();
            System.out.println("response:" + response);
            System.out.println("response.code:" + response.code());
            System.out.println("response.message:" + response.message());
            System.out.println("response.body:" + response.body().string());
//            System.out.println("response.solution:" + response.solution().string());

            assertEquals(response.code(), 200);
        } catch (IOException ex) {
            Logger.getLogger(SugokuTest.class.getName()).log(Level.SEVERE, null, ex);
            fail(ex.getMessage());
        }

    }

}
