package tests.tasks.string;

import application.tasks.string.Banjo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BanjoTest {
    Banjo banjo = new Banjo();
    @Test
    void banjoTest() {
        assertEquals("Martin does not play banjo",banjo.getArePlaying("Martin"));
        assertEquals("Rikke plays banjo",banjo.getArePlaying("Rikke"));
        assertEquals("rikke plays banjo",banjo.getArePlaying("rikke"));
    }
}