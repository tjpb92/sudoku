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
 * Programme pour tester la grille de jeu
 * @author Thierry Baribaud
 * @version 1.0.3
 */
public class BoardTest {
    
    public BoardTest() {
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

        Board board = new Board();
        board.add(row);
        board.add(row);
        board.add(row);
        board.add(row);
        board.add(row);
        board.add(row);
        board.add(row);
        board.add(row);
        board.add(row);
        
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String boardAsString = objectMapper.writeValueAsString(board);
        System.out.println("boardAsString:"+boardAsString);
        System.out.println("board:"+board);
        
        Board board2;
        board2 = objectMapper.readValue(boardAsString, Board.class);
        System.out.println("board2:"+board2);

        String json = "board:[[0,7,0,0,0,0,0,0,0],[1,0,0,0,0,0,0,0,9],"+
                    "[0,0,9,0,0,0,0,0,0],[0,1,0,0,0,0,0,0,0],"+
                    "[0,0,6,0,0,9,0,1,2],[0,9,0,0,0,0,3,0,0],"+
                    "[6,3,1,5,0,2,0,0,4],[0,0,2,6,4,0,0,3,0],"+
                    "[9,0,0,8,0,3,0,0,0]]}";
        json=json.replace("board:", "");
            System.out.println("json:"+json);
        Board board3;
        board3 = objectMapper.readValue(json, Board.class);
        System.out.println("board3:"+board3);
        
        } catch (JsonProcessingException ex) {
            Logger.getLogger(RowTest.class.getName()).log(Level.SEVERE, null, ex);
             fail(ex.getMessage());
        }        
    }
    
}
