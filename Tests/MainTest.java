import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main theMain = new Main();

    @Test
    void isEven() {
        assertTrue(theMain.isEven(6));
    }

    @Test
    void testForWrongInputThrowException(){
        assertThrows(InputMismatchException.class,()->{
            theMain.isEven(1001);
        });
        /*
        boolean thrown;
        try {
            theMain.isEven(1002);
            thrown = false;
        }
        catch (InputMismatchException e){
            thrown = true;
        }
        assertTrue(thrown);
        */

    }

}