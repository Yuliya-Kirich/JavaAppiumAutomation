import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainClassTest {
    MainClass Main = new MainClass();

    @Test
    public void testGetLocalNumber() {
        int number = 17;
        int putNumber = Main.getLocalNumber();
        if (number == putNumber) {
            System.out.println("It is ok number: " + putNumber);
        } else {
            assertEquals("It is wrong value!", number, putNumber);
        }
    }
}
