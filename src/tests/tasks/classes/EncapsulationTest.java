package tests.tasks.classes;

import application.tasks.classes.Encapsulation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncapsulationTest {
Encapsulation encapsulation = new Encapsulation();
    @Test
    void getEncapsulation() {
        assertEquals(1,encapsulation.getSomething(1));
    }
}