import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("InCorrecT");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest2() {
        myString.setString("iNCORRECT");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest3() {
        myString.setString("lowercase");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest4() {
        myString.setString("Binarycode");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest5() {
        myString.setString("ALLCAPITALS");
        assertTrue(myString.detectCapitalUse());
    }


}
