package test.CollectionTest;

import Collections.CreateList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CreateListTest {

    @Test
    void createList() {
        assertEquals(Arrays.asList(1), CreateList.createList(1));
        assertEquals(Arrays.asList(1, 2), CreateList.createList(2));
        assertEquals(Arrays.asList(1, 2, 3), CreateList.createList(3));
        assertEquals(Arrays.asList(1, 2, 3, 4), CreateList.createList(4));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), CreateList.createList(5));

    }
}