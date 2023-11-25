package sudoku;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Programme qui teste la classe Row
 *
 * @author Thierry Baribaud
 * @version 1.0.3
 */
public class RowTest {

    public RowTest() {
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

    @Test
    public void testSomeMethod() {

        Row row = new Row();
        Row row2;
        row.add(1);
        row.add(2);
        row.add(3);
        row.add(4);
        row.add(5);
        row.add(6);
        row.add(7);
        row.add(8);
        row.add(9);
        
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String rowAsString = objectMapper.writeValueAsString(row);
        System.out.println("row:"+row);
        row2 = objectMapper.readValue(rowAsString, Row.class);
        System.out.println("row2:"+row2);

        } catch (JsonProcessingException ex) {
            Logger.getLogger(RowTest.class.getName()).log(Level.SEVERE, null, ex);
             fail(ex.getMessage());
        }

    }

}
