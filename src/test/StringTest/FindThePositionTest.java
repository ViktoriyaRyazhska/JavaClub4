package test.StringTest;

import org.junit.jupiter.api.Test;
import String.FindThePosition;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindThePositionTest {
    @Test
    public void positionOfA() {
        assertEquals("Position of alphabet: 1", FindThePosition.position('a'));
    }

    @Test
    public void positionOfZ() {
        assertEquals("Position of alphabet: 1", FindThePosition.position('a'));
    }

    @Test
    public void positionOfE() {
        assertEquals("Position of alphabet: 5", FindThePosition.position('e'));
    }

    @Test
    public void positionOfO() {
        assertEquals("Position of alphabet: 15", FindThePosition.position('o'));
    }
}
