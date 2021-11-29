package tests.tasks.collections;

import application.tasks.collections.PushAnObjectIntoArray;
import com.sun.jdi.ArrayReference;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PushAnObjectIntoArrayTest {
    PushAnObjectIntoArray object = new PushAnObjectIntoArray();
    @Test
    void pushTest() {
        List<String> result = new ArrayList<>();
        result.add("an object");
        assertEquals(result, object.push());
    }
}