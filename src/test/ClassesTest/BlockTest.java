package test.ClassesTest;

import Classes.Block;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlockTest {
    Block block = new Block(new int[]{2, 2, 2});

    @Test
    void getWidth() {
        int expected = 2;
        int result = block.getWidth();
        assertEquals(expected, result);
    }

    @Test
    void getLength() {
        int expected = 2;
        int result = block.getLength();
        assertEquals(expected, result);
    }

    @Test
    void getHeight() {
        int expected = 2;
        int result = block.getHeight();
        assertEquals(expected, result);
    }

    @Test
    void getVolume() {
        int expected = 8;
        int result = block.getVolume();
        assertEquals(expected, result);
    }

    @Test
    void getSurfaceArea() {
        int expected = 24;
        int result = block.getSurfaceArea();
        assertEquals(expected, result);
    }
}